import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {

        ApiResponse res1 = new ApiResponse("London, United Kingdom",13);
        ApiResponse res2 = new ApiResponse("Sedrbia, Belgrade",21);
        ApiResponse res3 = new ApiResponse("New York, USA",7);

        ApiResponse responses[] = new ApiResponse[3];
        responses[0] = res1;
        responses[1] = res2;
        responses[2] = res3;

        try(FileWriter out = new FileWriter("responses.json")){
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            out.write(gson.toJson(responses));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
