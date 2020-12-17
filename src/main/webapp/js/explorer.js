$(function (){
    //使用ajax从服务器加载数据
    $.get("explorer",function (data){
        init(data);
    })
})

function init(data) {
    var dataArray = [];//新建一个数据
    for(var i=0;i<data.length;i++){
        var name = data[i].name;
        var percent = data[i].percent;
        var obj = {};//新建一个对象
        obj.name = name;
        obj.y = percent;
        dataArray.push(obj);
    }
    //创建图表
    var options = {
        chart:{
            type:'pie'
        },
        //指定主标题
        title:{
            text:'浏览器占比'
        },
        //设置数据列
        series:[{
            name:'浏览器占比',
            colorByPoint: true,
            data: dataArray
        }]
    };

    //放在div中显示出来
    $("#container3").highcharts(options);
}