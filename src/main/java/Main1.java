import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        final String cityName = "New York";
        ApiResponse apiResponse = null;

        try {
            URL url = new URL("http://api.weatherstack.com/current?access_key=033d98c18b8ec488fdf623c5a6027aae&query="+cityName);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            if(connection.getResponseCode() != 200)
                throw new RuntimeException("Something went wrong with request");

            StringBuilder infoString = new StringBuilder();
            Scanner scanner = new Scanner(url.openStream());
            while(scanner.hasNext()){
                infoString.append(scanner.nextLine());
            }

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            JsonObject jsonObject = gson.fromJson(infoString.toString(),JsonObject.class);
            JsonObject requestLocation = (JsonObject) jsonObject.get("request");
            JsonObject requestTemp = (JsonObject) jsonObject.get("current");

            String location = requestLocation.get("query").toString();
            String temperature = requestTemp.get("temperature").toString();

            apiResponse = new ApiResponse(location,Integer.parseInt(temperature));
            System.out.println(apiResponse);


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
