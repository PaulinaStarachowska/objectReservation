package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LandlordController {

    @GetMapping("/landlord/panel")
    public String landlordPanel() {

        return "landlord-panel";
    }
}