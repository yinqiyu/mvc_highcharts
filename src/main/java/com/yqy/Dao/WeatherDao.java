package com.yqy.Dao;

import com.yqy.vo.Weather;
import com.yqy.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class WeatherDao {
    private final QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());

    public List<Weather> findAllWeather() {
        try {
            return runner.query("select * from weather_db", new BeanListHandler<>(Weather.class));
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    
}
