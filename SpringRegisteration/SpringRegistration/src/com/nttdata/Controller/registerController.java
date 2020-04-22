package com.nttdata.Controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nttdata.Model.User;
@Controller
@RequestMapping("/register")
public class registerController {

	@RequestMapping(method = RequestMethod.GET)
	public String display(ModelMap model)  
    {  
        model.addAttribute("user", new User());  
        return "register";  
    }  
	@RequestMapping(method = RequestMethod.POST)
	public String loginCheck(@Valid  @ModelAttribute("user")User user,BindingResult result,ModelMap model)
	{
		
		if(result.hasErrors())
		{
			
			return "register";
		}
	
		else
		{
			model.addAttribute("ifobj", user);
			return "welcome";
		}
	}
}
