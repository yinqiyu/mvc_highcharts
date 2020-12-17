package com.yqy.service;

import com.yqy.Dao.WeatherDao;
import com.yqy.vo.Weather;

import java.util.List;

/*
* 业务层
*/
public class WeatherService {
    private final WeatherDao weatherDao = new WeatherDao();

    //查询所有天气
    public List<Weather>findAllWeather(){
        return weatherDao.findAllWeather();
    }
}
