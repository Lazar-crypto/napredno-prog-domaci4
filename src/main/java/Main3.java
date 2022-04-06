import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {
        try(FileReader in = new FileReader("responses.json")){
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            //Movie[] movies = gson.fromJson(in, Movie[].class);
            List<ApiResponse> responseList = Arrays.asList(gson.fromJson(in, ApiResponse[].class));

            for(ApiResponse response: responseList)
                System.out.println(response);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

}
