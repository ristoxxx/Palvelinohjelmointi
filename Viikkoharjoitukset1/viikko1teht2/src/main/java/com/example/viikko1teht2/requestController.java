package com.example.viikko1teht2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class requestController {
	@RequestMapping("index")
	public String index() {
		return "This main page";
	}
//	@RequestMapping("contact")
//	public String contact() {
//		return "This contact page";
//	}
	@RequestMapping(value="hello", method = RequestMethod.GET)
//	public @ResponseBody String x(@RequestParam("location") String itemid){

	public String hello(@RequestParam("location") String location){
		return "This page " + location;
	}
//	    Item i = itemDao.findOne(itemid);              
//	    String itemName = i.getItemName();
//	    String price = i.getPrice();
//	    return "moi";

}
