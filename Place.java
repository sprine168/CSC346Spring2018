/*Steven Prine
* CSC346
* Prof. Noynaert
*/

import java.util.Objects;

public class Place {

    String city;
    String state_prefix;
    String country;
    String zipCode;
    int population;
    int housingUnits;
    double latitude;
    double longitude;
    double distanceFromOrigin;

    public Place(String city, String zipCode, String state_prefix, String country, int population,
                 int housingUnits, double latitude, double longitude, double distanceFromOrigin) {

        this.city = city;
        this.zipCode = zipCode;
        this.state_prefix = state_prefix;
        this.country = country;
        this.population = population;
        this.housingUnits = housingUnits;
        this.latitude = latitude;
        this.longitude = longitude;
        this.distanceFromOrigin = distanceFromOrigin;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState_prefix() {
        return state_prefix;
    }

    public void setState_prefix(String state_prefix) {
        this.state_prefix = state_prefix;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getHousingUnits() {
        return housingUnits;
    }

    public void setHousingUnits(int housingUnits) {
        this.housingUnits = housingUnits;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getDistanceFromOrigin() {
        return distanceFromOrigin;
    }

    public void setDistanceFromOrigin(double distanceFromOrigin) {
        this.distanceFromOrigin = distanceFromOrigin;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Place{" +
                "city='" + city + '\'' +
                ", state_prefix='" + state_prefix + '\'' +
                ", country='" + country + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", population=" + population +
                ", housingUnits=" + housingUnits +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", distance in miles=" + miles(distanceFromOrigin) +
                ", distance in kilos=" + distanceFromOrigin +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Place)) return false;
        Place place = (Place) o;
        return Objects.equals(city, place.city) &&
                Objects.equals(state_prefix, place.state_prefix);
    }

    @Override
    public int hashCode() {

        return Objects.hash(city, state_prefix);
    }

    public static double miles(double toMiles) {
        return toMiles * 0.621371;
    }

}