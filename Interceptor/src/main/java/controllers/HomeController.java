package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/login")
    public String login(ModelMap model) {
        model.addAttribute("username", "Trúc Quỳnh");
        return "login";
    }
    @RequestMapping("/signup")
    public  String singup(ModelMap model){
        model.addAttribute("username", "Trúc Quỳnh");
        return "signup";
    }
}

