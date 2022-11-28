package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedirectController {
    @GetMapping(value = "/")
    public String printWelcome(ModelMap model) {
        return "redirect:/users";
    }
}