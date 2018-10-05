package com.example.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class AdminTestController {

    @GetMapping("/AdminTest")
    //public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
    public String greeting() { 
        return "AdminTest";
    }

}
