package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spring.model.User;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String showForm() {
		
		
		return "contact";
	}
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(
			@ModelAttribute User user,Model model
			) {
		
		model.addAttribute("user",user);
		
		
		return "success";
	}
//	@RequestMapping(path="/processform",method=RequestMethod.POST)
//	public String handleForm(
//			@RequestParam(name="username", required=true) String username,
//			@RequestParam("email") String email,
//			@RequestParam("password") String password,Model model
//			) {
//		
//		User user=new User();
//		user.setUsername(username);
//		user.setEmail(email);
//		user.setPassword(password);
//		System.out.println("username=="+username);
//		System.out.println("User Emai=="+email);
//		System.out.println("Password=="+password);
//		model.addAttribute("user",user);
//		
//		
//		return "success";
//	}
}
