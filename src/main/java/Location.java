import com.google.gson.annotations.SerializedName;

public class Location {

    @SerializedName("name")
    String city;
    String country;

    public Location() {
    }

    public Location(String name, String country) {
        this.city = name;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return city + ", " + country;
    }
}
