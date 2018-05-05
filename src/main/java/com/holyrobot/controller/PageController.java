package com.holyrobot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cuill on 2018/4/2.
 */
@Controller
public class PageController {
    @RequestMapping("/index")
    public String page() {
        return "index";
    }
}
