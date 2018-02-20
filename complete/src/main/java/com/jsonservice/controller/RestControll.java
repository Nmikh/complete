package com.jsonservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequestMapping("/")
public class RestControll {

    @RequestMapping(method = RequestMethod.POST)
    public String send(@RequestParam MultipartFile file) throws IOException {

            String message=new String(file.getBytes());
            System.out.println(message);

        return "send";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String get(Model model){
        return "index";
    }

}
