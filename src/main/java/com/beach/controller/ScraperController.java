package com.beach.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.beach.domain.Scraper;

@Controller
public class ScraperController {

	@RequestMapping(value="/scraper/scrap", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Scraper scraper() {
		Scraper sc = new Scraper();
		sc.setName("scraper is workin");
		return sc;
	}
	
/*	@RequestMapping("/scraper/scrap")
	public String scraper() {
		Scraper sc = new Scraper();
		sc.setName("scraper is workin");
		return "sc- - - - - -- - scraper";
	}*/
	
	@RequestMapping("/scraper")
	public String hello() {
		return "scraper";
	}
	
}
