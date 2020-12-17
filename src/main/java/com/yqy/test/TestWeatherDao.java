package com.yqy.test;

import com.yqy.Dao.WeatherDao;
import com.yqy.vo.Weather;
import flexjson.JSONSerializer;
import org.junit.Test;

import java.util.List;

public class TestWeatherDao {
    private final WeatherDao weatherDao = new WeatherDao();

    @Test
    public void testFindAll(){
        List<Weather>weathers = weatherDao.findAllWeather();
        for(Weather weather:weathers){
            System.out.println(weather);
        }
    }

    @Test
    public void testToJSON(){
        List<Weather>weathers = weatherDao.findAllWeather();
        //创建josn转换器
        JSONSerializer serializer = new JSONSerializer();
        //去除class属性
        serializer.exclude("class");
        String serialize = serializer.serialize(weathers);
        System.out.println(serialize);
    }
}
