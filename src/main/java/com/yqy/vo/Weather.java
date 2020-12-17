package com.yqy.vo;

public class Weather {

    private String city;
    private String weather;
    private String wind;
    private String max;
    private String min;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "city='" + city + '\'' +
                ", weather='" + weather + '\'' +
                ", wind='" + wind + '\'' +
                ", max='" + max + '\'' +
                ", min='" + min + '\'' +
                '}';
    }
}
