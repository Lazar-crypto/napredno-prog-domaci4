public class ApiRequest {

    Location location;
    Weather weather;

    public ApiRequest() {
    }

    public ApiRequest(Location location, Weather weather) {
        this.location = location;
        this.weather = weather;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return location.toString() + " " + weather.toString();
    }
}
