package yk.js.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/mvc")
public class mvcController {
	       public mvcController(){
	    	    System.out.print("mvcontroller has run");
	       }
		    @RequestMapping("/hello")
		    public String hello(){     
		    	System.out.print("hello has been accedded");
		        return "hello";
		    }
		    
		

}
