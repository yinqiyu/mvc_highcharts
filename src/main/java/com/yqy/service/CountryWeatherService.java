package com.yqy.service;

import com.yqy.Dao.CountryWeatherDao;
import com.yqy.vo.CountryWeather;

import java.util.List;

public class CountryWeatherService {
    private final CountryWeatherDao countryWeatherDao = new CountryWeatherDao();


    public List<CountryWeather> findAllCountryWeathers(){
        return countryWeatherDao.findAllCountryWeathers();
    }
}
