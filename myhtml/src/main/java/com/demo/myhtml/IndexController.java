package com.demo.myhtml;

import model.user;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @PostMapping("/register")
    public String userRegistration(@ModelAttribute user user, Model model){
        System.out.println(user.toString());

        System.out.println(user.getFname());
        System.out.println(user.getLname());
        System.out.println(user.getDob());
        System.out.println(user.getEmail());
        model.addAttribute("firstname", user.getFname());
        model.addAttribute("lastname", user.getLname());
        return "welcome";
    }
}
