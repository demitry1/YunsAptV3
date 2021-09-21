package org.demitry.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    //인덱스 페이지
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    //에러 페이지
    @RequestMapping("/error")
    public String error404(){
        return "error404";
    }

}
