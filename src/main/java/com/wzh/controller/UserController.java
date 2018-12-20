package com.wzh.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wzh.model.User;
import com.wzh.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年07月09日
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/showUser.do")
    public void selectUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.selectUser(userId);
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(mapper.writeValueAsString(user));
        response.getWriter().close();
    }

    @RequestMapping("/selectUser.do")
    private String select(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String id = request.getParameter("id");
        User user = userService.selectUser(Integer.parseInt(id));
        request.setAttribute("user", user);
        return "index";

    }

}