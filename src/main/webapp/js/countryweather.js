$(function (){

    //ajax方法得到服务器数据
    $.get("CountryWeather",function (data){
        init(data);
    });

    function init(data) {
        //创建图表
        var options = {
            title: {
                text: '城市温度',
                x: -20 //center
            },
            xAxis: {
                categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun',
                    'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'
                ]
            },
            yAxis: {
                title: {
                    text: 'Temperature (°C)'
                },
                plotLines: [{
                    value: 0,
                    width: 1,
                    color: '#808080'
                }]
            },
            tooltip: {
                valueSuffix: '°C'
            },
            legend: {
                layout: 'vertical',
                align: 'right',
                verticalAlign: 'middle',
                borderWidth: 0
            },
            //数据数列
            series: data
        };

        //放在div中显示出来
        $("#container2").highcharts(options);
    }
});