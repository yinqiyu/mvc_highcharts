package com.yqy.test;

import com.yqy.Dao.CountryWeatherDao;
import com.yqy.vo.CountryWeather;
import flexjson.JSONSerializer;
import org.junit.Test;

import java.util.List;

public class TestContryWeatherDao {
    private final CountryWeatherDao countryWeatherDao = new CountryWeatherDao();

    @Test
    public void testFindall(){
        List<CountryWeather>countryWeathers = countryWeatherDao.findAllCountryWeathers();
        for (CountryWeather countryWeather:countryWeathers){
            System.out.println(countryWeather);
        }
    }

    @Test
    public void testToJSON(){
        List<CountryWeather>countryWeathers = countryWeatherDao.findAllCountryWeathers();
        JSONSerializer serializer = new JSONSerializer();
        serializer.exclude("class");
        String serialize = serializer.serialize(countryWeathers);
        System.out.println(serialize);
    }
}
