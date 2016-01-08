package com.spring.boot.example.main.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.persistence.Table;
import java.util.List;


/**
 * Created by bangae1 on 2016-01-06.
 */
@Controller
@Table
public class MainController {

    private static final Logger log = LogManager.getLogger(MainController.class.getName());

//    @Autowired
//    private UserService userService;

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("msg", "hello");
        return "login";
    }

    @RequestMapping(value="/main", method=RequestMethod.GET)
    public String main() {
        return "main";
    }

}
