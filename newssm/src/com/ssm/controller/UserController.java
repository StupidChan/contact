package com.ssm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.ssm.domain.Contact;
import com.ssm.domain.User;
import com.ssm.service.UserService;

@Controller
@Scope(value="prototype")
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private UserService userService;
	
	/*@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(User user,Model model) throws Exception {
		user=userService.checkLogin(user.getUsername(), user.getPassword());
		if(user!=null){
			//model.addAttribute("retCode", 0);
			model.addAttribute("user",user);
			return "welcome";			
		}
		//model.addAttribute("retCode", 1);
		return "login";
	}*/
	
	//@RequestMapping(value="/login",method=RequestMethod.POST)
	
	@RequestMapping({"/login"})
	public ModelAndView login(User user, ModelAndView model, HttpSession session) throws Exception {
		user=userService.checkLogin(user.getUsername(), user.getPassword());
		if(user!=null){
			 session.setAttribute("user", user);
			 int lalala=user.getId();
			 //model.setView(new RedirectView("/contact/getAll"));
			 model.setView(new RedirectView("/newssm/contact/getAll.action?id="+lalala));
		}
		else
	    {
			model.addObject("message", "登录名或者密码错误，请重新输入");
			model.setViewName("login");
	    }
	    return model;
	}
	
	/*@RequestMapping({"/login"})
	public String login(User user, ModelAndView model, HttpSession session,RequestAttributes attr) throws Exception {
		user=userService.checkLogin(user.getUsername(), user.getPassword());
		if(user!=null){
			 session.setAttribute("user", user);
			 //model.setView(new RedirectView("/contact/getAll"));
			 attr.addFlashAttribute("id",user.id);
			 model.setView(new RedirectView("/newssm/contact/getAll.action"));
		}
		else
	    {
			model.addObject("message", "登录名或者密码错误，请重新输入");
			model.setViewName("login");
	    }
	    return null;
	}*/
	
	
	/*@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insert(User user) throws Exception{
		userService.Add(user);
		return "login";
		
	}*/
	@RequestMapping(value="/insert")
	public ModelAndView insert(User user,ModelAndView model,HttpSession session) throws Exception{
		User userCheck=userService.checkInsert(user.getUsername());
		if(userCheck!=null){
			model.addObject("message", "登录名已被注册，请重新输入");
			model.setViewName ("insert");
		}
		else
	    {
			userService.Add(user);
			model.setViewName("login");
	    }
		return model;
	}
	
	
	@RequestMapping("/toUpdateUser")
	public String toUpdateUse(Integer id,Model model){
		User user=userService.findUserById(id);
		model.addAttribute("user", user);
		return "user_update";
	}
	@RequestMapping(value="/updateUser")
	public String updateUser(User user) throws Exception{
		userService.update(user);;
		return "login";
	}
	
}