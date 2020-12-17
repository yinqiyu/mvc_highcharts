package com.yqy.vo;

public class CountryWeather {
    private int id;
    private String name;
    private int month;
    private double data;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CountryWeather{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", month=" + month +
                ", data=" + data +
                '}';
    }
}
