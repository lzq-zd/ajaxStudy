$(function () {
    $("#btn").click(function () {
        $.post("/ajax/a2",function (data) {
            console.log(data);
            var html = "";
            for (var i = 0; i < data.length; i++) {
                html += "<tr>"+
                    "<td>"+data[i].name+"</td>"+
                    "<td>"+data[i].age+"</td>"+
                    "<td>"+data[i].sex+"</td>"+"</tr>"
            }
            $("#content").html(html);
        })
    })
});