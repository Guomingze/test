$(function () {
    $.get("http://localhost:8080/hello/mvc1",function (res) {
        console.log(res);
        var str = "";
        for(var x = 0;x < res.length;x ++) {
            str += "<h1>" + res[x].saddress + "</h1>";
        }
        $("#div1").html(str);
    });
    var jsons =  {
        "sid":1,
        "suid":1,
        "sphone":18403415218,
        "saddress":"山西省朔州市",
        "state":1
    };
    jsons = JSON.stringify(jsons);
    $("#btn1").click(function () {
        $.ajax({
            type:"POST",
            url:"http://localhost:8080/hello/mvc",
            data:jsons,
            dataType:"json",
            contentType:"application/json",
            success:function (res) {
                console.log(res);
            }
        });
    });
});