$(function (){
    //使用ajax从服务器加载数据
    $.get("weather",function (data){
        init(data);
    })
})

function init(data) {
    var dataArray = [];//新建一个数据
    for (var i = 0; i < data.length; i++) {
        var name = data[i].city;
        var percent = data[i].min;
        var obj = {};//新建一个对象
        obj.name = name;
        obj.value = percent;
        dataArray.push(obj);
    }
}

var myChart = echarts.init(document.getElementById('main'));
function randomValue() {
    return Math.round(Math.random()*1000);
}
option = {
    tooltip: {
        formatter:function(params,ticket, callback){
            return params.seriesName+'<br />'+params.name+'：'+params.value
        }//数据格式化
    },
    visualMap: {
        min: 0,
        max: 1500,
        left: 'left',
        top: 'bottom',
        text: ['高','低'],//取值范围的文字
        inRange: {
            color: ['#e0ffff', '#006edd']//取值范围的颜色
        },
        show:true//图注
    },
    geo: {
        map: 'china',
        roam: false,//不开启缩放和平移
        zoom:1.23,//视角缩放比例
        label: {
            normal: {
                show: true,
                fontSize:'10',
                color: 'rgba(0,0,0,0.7)'
            }
        },
        itemStyle: {
            normal:{
                borderColor: 'rgba(0, 0, 0, 0.2)'
            },
            emphasis:{
                areaColor: '#F3B329',//鼠标选择区域颜色
                shadowOffsetX: 0,
                shadowOffsetY: 0,
                shadowBlur: 20,
                borderWidth: 0,
                shadowColor: 'rgba(0, 0, 0, 0.5)'
            }
        }
    },
    series : [
        {
            name: '信息量',
            type: 'map',
            geoIndex: 0,
            data:dataList
        }
    ]
};
myChart.setOption(option);
myChart.on('click', function (params) {
    alert(params.name);
});