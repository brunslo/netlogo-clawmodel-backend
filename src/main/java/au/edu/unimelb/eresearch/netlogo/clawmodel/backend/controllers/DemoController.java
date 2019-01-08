package au.edu.unimelb.eresearch.netlogo.clawmodel.backend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/demo")
public class DemoController {
    @GetMapping
    public String demo() {
        return "demo";
    }
}
