package com.yqy.servlet;

import com.yqy.vo.Sale;
import com.yqy.service.SaleService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/sale")
public class SaleServlet extends HttpServlet {

    //调用业务层
    private final SaleService saleService = new SaleService();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //指定输出到浏览器的类型
        response.setContentType("text/json;charset = utf-8");
        //得到一个打印流进行输出
        PrintWriter out = response.getWriter();
        //得到对象
        List<Sale>sales = saleService.findAllSales();
        //转换json
        String json = saleService.toJson(sales);
        out.print(json);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.doPost(request,response);
    }
}
