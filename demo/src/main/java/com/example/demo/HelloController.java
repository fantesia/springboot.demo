package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mycontro")
public class HelloController {

   @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name, Model model) {
    	System.out.println("name----"+name);
        model.addAttribute("name", name);
        return "hello";
    }
    
    @RequestMapping("/world/{name}")
    public String world(@PathVariable("name") String name, Model model) {
    	System.out.println("world--name----"+name);
        model.addAttribute("name", name);
        return "hellotest";
  }
	
}

