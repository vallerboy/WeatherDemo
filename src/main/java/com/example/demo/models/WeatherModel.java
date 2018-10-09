package com.example.demo.models;

public class WeatherModel {
    private WeatherDetails main;
    private CloudDetails clouds;

    public WeatherDetails getMain() {
        return main;
    }

    public void setMain(WeatherDetails main) {
        this.main = main;
    }

    public CloudDetails getClouds() {
        return clouds;
    }

    public void setClouds(CloudDetails clouds) {
        this.clouds = clouds;
    }

    public static class WeatherDetails{
        private double temp;

        public double getTemp() {
            return temp;
        }

        public void setTemp(double temp) {
            this.temp = temp;
        }
    }

    public static class CloudDetails{
        private int all;

        public int getAll() {
            return all;
        }

        public void setAll(int temp) {
            this.all = temp;
        }
    }
}
