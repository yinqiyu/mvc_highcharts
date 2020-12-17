package com.yqy.servlet;

import com.yqy.vo.Weather;
import com.yqy.service.WeatherService;
import flexjson.JSONSerializer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/weather")
public class WeatherServlet extends HttpServlet {
    private final WeatherService weatherService = new WeatherService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //相应类型为JSON
        response.setContentType("text/json;charset=utf-8");
        PrintWriter out = response.getWriter();
        //调用业务层访问数据
        List<Weather>weathers = weatherService.findAllWeather();
        //创建JSON转换对象
        JSONSerializer serializer = new JSONSerializer();
        serializer.exclude("class");
        String serialize = serializer.serialize(weathers);
        //输出客户端
        out.print(serialize);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
