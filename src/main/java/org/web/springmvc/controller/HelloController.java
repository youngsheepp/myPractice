package org.web.springmvc.controller;


import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.web.springmvc.req.HelloReq;
import org.web.springmvc.rsp.HelloRsp;

@Controller
public class HelloController {
	
	@RequestMapping(value = "/hello.json", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public HelloRsp sayHello(@RequestBody @Validated HelloReq request){
		HelloRsp rsp = new HelloRsp();
		rsp.setMsg("hello "+request.getName());
		return rsp;
	}
}
