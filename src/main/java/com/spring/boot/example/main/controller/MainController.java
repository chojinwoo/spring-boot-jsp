package com.spring.boot.example.main.controller;

import com.spring.boot.example.main.model.Table;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


/**
 * Created by bangae1 on 2016-01-06.
 */
@Controller
public class MainController {

    private static final Logger log = LogManager.getLogger(MainController.class.getName());

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @RequestMapping(value="/", method= RequestMethod.GET)
    public String main(Model model) {
        List list = jdbcTemplate.query("select * from tab", new BeanPropertyRowMapper(Table.class));
        System.out.println(list.size());
        model.addAttribute("msg", "hello");
        return "main";
    }

}
