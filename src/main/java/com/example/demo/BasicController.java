package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class BasicController {
    @GetMapping("index")
    public String index() {
        return "index.html";
    }
    @GetMapping("login")
    public String login() {
        return "login.html";
    }
    @GetMapping("register") 
    public String register() {
        return "register.html";
    }
    @GetMapping("logout")
    public String logout() {
        return "logout.html";
    }
    @PostMapping("auth")
    public String auth(Model model,@RequestParam("ID") String ID, @RequestParam("password") String password) {
        model.addAttribute("ID", ID);
        model.addAttribute("password", password);
        System.out.println("ID: " + model.getAttribute("ID"));
        System.out.println("ID: " + model.getAttribute("password"));
        return "auth.html";
    }

}
