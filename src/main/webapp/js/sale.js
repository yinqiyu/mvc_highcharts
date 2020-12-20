$(function (){

    //创建两个数组,数组长度可变
    var  names = [];
    var sales = [];

    //ajax方法得到服务器数据
    $.get("sale",function (data){
        //alert(data)
        //遍历对象
        for (var i = 0;i<data.length;i++){
            //得到每种商品的的名字和价格
            names[i] = data[i].name;
            sales[i] = data[i].amount;
            // alert(data[i].name);
        }

        // alert(salarys)
        //创建图表
        var options = {
            //指定图表类型
            chart:{
                type:'bar'
            },
            plotOptions: {
                series: {
                    colorByPoint: true
                }
            },
            title:{
                text:'按销售额统计',
                style:{
                    color:'red'
                }
            },
            xAxis:{
                //指定x的分类
                categories:names
            },
            yAxis:{
                //设置最小为0
                min:0,
                title: {
                    text: '销售额（万元）'
                }
            },

            //数据数列
            series:[{
                //指定工资数组
                name:'销售额',
                data:sales
            }]
        };
        //放在div中显示出来
        $("#container1").highcharts(options);
    });


    //  var charts = Highcharts.chart("container",options);

});