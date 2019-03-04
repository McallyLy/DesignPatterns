package com.Mcally.ObserverMode;

public class MainTest {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        Mokey mokey=new Mokey();
        weatherData.registerObserver(mokey);
        weatherData.setNameAndaFloat("成都气象台",100);
    }
}
