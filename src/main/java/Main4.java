import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.io.FileWriter;

public class Main4 {

    public static void main(String[] args) {
        ApiResponse response = new ApiResponse("Serbia, Belgrade",19);

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("location",response.getLocation());
        jsonObject.addProperty("temperature",response.getTemperature());

        try(FileWriter fw = new FileWriter("rucni_upis.json")){
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            fw.write(gson.toJson(jsonObject));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
