package com.example.viikko1teht1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class ekaController {
	@RequestMapping("index")
	public String index() {
		return "This is main page";
	}
	@RequestMapping("contact")
	public String contact() {
		return "This is contact page";
	}

}

