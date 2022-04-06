public class ApiResponse {

    String location;
    Integer temperature;

    public ApiResponse() {
    }

    public ApiResponse(String location, Integer temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer weather) {
        this.temperature = weather;
    }

    @Override
    public String toString() {
        return "Location: " + location + ", temperature: " + temperature;
    }
}
