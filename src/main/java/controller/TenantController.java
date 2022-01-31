package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TenantController {

    @GetMapping("/tenant/panel")
    public String tenantPanel() {
        return "tenant-panel";
    }
}

