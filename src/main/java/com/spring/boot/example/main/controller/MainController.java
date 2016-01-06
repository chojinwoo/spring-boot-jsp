package com.spring.boot.example.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by bangae1 on 2016-01-06.
 */
@Controller
public class MainController {
    @RequestMapping(value="/", method= RequestMethod.GET)
    public String main(Model model) {
        model.addAttribute("msg", "hello");
        return "main";
    }
}
