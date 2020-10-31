function a1() {
    // url：请求地址
    //   data：要发送的数据
    //  success：成功之后执行的回调函数(全局)
    //        data：封装了服务器返回的数据
    //        status：状态
    // 将文本框输出的值，
    // 发给服务器，
    //  接收服务器返回的数据
    $.ajax( {
        url: '/ajax/a1',
        data:{'name':$("#txtName").val()},
        success:function (data) {
            console.log(data);
        }
    });

}