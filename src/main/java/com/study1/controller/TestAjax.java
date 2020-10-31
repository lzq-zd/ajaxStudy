package com.study1.controller;

import com.study1.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: TestAjax
 * @Author: 中都
 * @Date: 2020/10/31 14:07
 * @Description: TODO
 */
@RequestMapping(value = "/ajax")
@Controller
public class TestAjax {
    @RequestMapping(value = "/start")
    public String start() {
        return "test";
    }

    @RequestMapping(value = "/start1")
    public String start1() {
        return "test1";
    }


    @RequestMapping(value = "/start2")
    public String start2() {
        return "test2";
    }

    @RequestMapping(value = "/a1")
    public void ajax1(String name, HttpServletResponse response) throws IOException {
        System.out.println(name);
        if("admin".equals(name)) {
            response.getWriter().print("true");
        }else {
            response.getWriter().print("false");
        }
    }

    @RequestMapping(value = "/a2")
    @ResponseBody
    public List<User> ajax2() {
        List<User> list = new ArrayList<>();

        User u1 = new User("lzq",89,"男");
        User u2 = new User("dyp",21,"女");
        User u3 = new User("hmj",19,"男");
        User u4 = new User("gd",18,"女");

        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);

        return list;
    }

    @RequestMapping(value = "/a3",produces = {"text/plain;charset=UTF-8"})
    @ResponseBody
    public String ajax3(String name,String password) {
        String msg = "";
        if(name != null ) {
            if("admin".equals(name)) {
                msg = "ok";
            }else {
                msg = "用户名有错误";
            }
        }
        if(password != null ) {
            if("123456".equals(password)) {
                msg = "ok";
            }else {
                msg = "密码有错误";
            }
        }
        return msg;
    }
}
