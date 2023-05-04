package spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {

	@RequestMapping(path="/home", method=RequestMethod.GET)
	public String home() {
		
		System.out.println("home page");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about(Model model) {
		
		model.addAttribute("name","Mahendra Maurya");
		model.addAttribute("designation","Software Engineer");
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		
	   ModelAndView modelandview=new ModelAndView();
				
	   modelandview.addObject("name","mahendra Software");
	   modelandview.setViewName("help");
	   
	   List<Integer> list=new ArrayList<Integer>();
	     
	   list.add(12);
	   list.add(23);
	   list.add(343);
	   list.add(78);
	   modelandview.addObject("rollnumber",list);
	   
	   return modelandview;
	}
}
