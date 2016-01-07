package com.spring.boot.example.main.controller;

import com.spring.boot.example.user.model.Users;
import com.spring.boot.example.user.repository.UsersAuthRepository;
import com.spring.boot.example.user.repository.UsersRepository;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private UsersAuthRepository usersAuthRepository;

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String main(Model model) {
        usersRepository.findAll();
        model.addAttribute("msg", "hello");
        return "main";
    }

}
