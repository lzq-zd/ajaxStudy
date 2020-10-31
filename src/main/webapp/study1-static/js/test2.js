function a1() {
    $.post({
        url:'/ajax/a3',
        data:{"name":$("#name").val()},
        success:function (data) {
            if(data.toString() === 'ok') {
                //信息核对成功
                $("#userInfo").css("color","green");
            }else {
                $("#userInfo").css("color","red");
            }
            $("#userInfo").html(data);
        }
    });
}


function a2() {
    $.post('/ajax/a3',{"password":$("#pwd").val()},function(data) {
        if(data.toString() === 'ok') {
            //信息核对成功
            $("#pwdInfo").css("color","green");
        }else {
            $("#pwdInfo").css("color","red");
        }
        $("#pwdInfo").html(data);
    });
}