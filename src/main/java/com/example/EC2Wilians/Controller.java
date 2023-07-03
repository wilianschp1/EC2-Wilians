package com.example.EC2Wilians;

import java.lang.String;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(path="/")
public class Controller{
    
    @GetMapping(path="/")
    public String home(){
        return "PT77425335 - Luiggi Chacon";
    }
}

