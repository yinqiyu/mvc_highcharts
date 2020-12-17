package com.yqy.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yqy.service.CountryWeatherService;
import com.yqy.vo.CountryWeather;
import flexjson.JSONSerializer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@WebServlet("/CountryWeather")
public class CountryWeatherServlet extends HttpServlet {

    private final CountryWeatherService countryWeatherService = new CountryWeatherService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/json;charset=utf-8");
        PrintWriter out = response.getWriter();

        List<CountryWeather> countryWeathers = countryWeatherService.findAllCountryWeathers();
        List<Map<String,Object>> data = new ArrayList<>();
        Set<String> names = new HashSet<>();
        for(CountryWeather c : countryWeathers){
            names.add(c.getName());
        }
        int k = 0;
        for(String name : names){
            Map<String,Object> map = new HashMap<>();
            List<Object> ts = new ArrayList<>();
            if (k > 0){
                ts.clear();
                k = 0;
            }
            for(CountryWeather c : countryWeathers){
                if (name.equals(c.getName())){
                    ts.add(c.getData());
                }
            }
            map.put("name",name);
            map.put("data",ts);
            data.add(map);
            k++;
        }

        ObjectMapper objectMapper = new ObjectMapper();
        String res = objectMapper.writeValueAsString(data);
        out.print(res);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);


    }
}
