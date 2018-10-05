package com.example.Seller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class SellerTestController {

    @GetMapping("/SellerTest")
    public String greeting() { 
        return "SellerTest";//go to SellerTest.html
    }

}
