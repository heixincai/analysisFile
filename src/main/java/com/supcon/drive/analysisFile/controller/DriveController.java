package com.supcon.drive.analysisFile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DriveController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

}
