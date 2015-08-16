package com.loyin.controller;

import javax.print.DocFlavor.STRING;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.loyin.service.WarFilePraseService;
import com.sun.org.apache.xpath.internal.operations.Mod;

@Controller
@RequestMapping(value = "/warfile/", method = RequestMethod.POST)
public class Propertysettings {
	private WarFilePraseService warfileprasesvr;
	
	@RequestMapping(value = "save/{poolname}")
	public String pathSave(@PathVariable String poolname, Model model){
		if(warfileprasesvr.warFilePropertiesSave()){
			return "redirect:/path_show/" + poolname;
		}
		else{
			return "redirect:/path_show/";
		}
	}
	
	@RequestMapping(value = "show/{poolname}")
	public String propertyShow(@PathVariable String poolname, Model model){
		
		return "xxxx.JSP";
	}
}
