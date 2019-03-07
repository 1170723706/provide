package com.jk.controller;

import com.jk.bean.User;
import com.jk.client.LoginClient;
import com.jk.util.Constant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

@Controller
@RequestMapping("login")
public class LoginController {

    @Resource
    LoginClient loginClient;


    @ResponseBody
    @RequestMapping("toLoginByNameAndPassword")
    public String toLoginByNameAndPassword(User user, HttpSession session, HttpServletResponse response,HttpServletRequest request) throws UnsupportedEncodingException {
       User userFromDB= loginClient.login(user);
            return "1";
    }
    @RequestMapping("toLoginHtml")
    public String toLogin(HttpServletRequest request,Model m) throws UnsupportedEncodingException {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(Constant.remPwd)) {
                    String val = cookie.getValue();
                    String[] strings = val.split(Constant.splitChar);
                    User user = new User();
                    user.setLoginacct(strings[0]);
                    user.setUserpswd(strings[1]);
                    m.addAttribute("user", user);
                }
            }
        }
            return "login";
        }

    @RequestMapping("toIndex")
    public String toIndex() {
            return "html/index";
        }

    @RequestMapping("toView")
    public String toView(String viewName) {

            return viewName;
        }
    @ResponseBody
    @RequestMapping("removeUser")
    public String removeUser(HttpSession session){
            session.removeAttribute("userf");
            return "1";
        }


    @ResponseBody
    @RequestMapping("userLoginAccount")
    public String userLoginAccount(User user) {
        Integer userCount=loginClient.queryLoginAccount(user);
        if (userCount>0) {
            return "loginUser";
        }else{
            return "1";
        }
    }

}


