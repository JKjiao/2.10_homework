package com.zhangjiaming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DemoController {

	@RequestMapping("hello")
	public String toHello() {
		
		return "hello";
	}
}
