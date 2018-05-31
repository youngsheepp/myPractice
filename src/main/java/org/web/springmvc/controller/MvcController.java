package org.web.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mvc")
public class MvcController {
	 @RequestMapping("/hello")
	 @ResponseBody
	    public String hello(){ 
	        return "helloworld";
	    }
}
