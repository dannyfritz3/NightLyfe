package edu.csbsju.nightlyfe;

/**
 * Created by dannyfritz3 on 3/13/18.
 * Class for getting and setting values for a restaurant
 */

public class Restaurant {
    private String name, owner, city, address;
    private double longitude, latitude;

    public String getName() {
        return this.name;
    }

    public String getOwner() {
        return this.owner;
    }

    public String getCity() {
        return this.city;
    }

    public String getAddress() {
        return this.address;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLongtitude(double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(double lattitude) {
        this.latitude = latitude;
    }
}
