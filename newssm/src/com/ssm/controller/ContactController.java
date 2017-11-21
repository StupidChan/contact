package com.ssm.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.ssm.domain.Contact;
import com.ssm.domain.User;
import com.ssm.service.ContactService;

@Controller
@Scope(value="prototype")
@RequestMapping("/contact")
public class ContactController {
	
	@Resource
	private ContactService contactService;
	
	/*@RequestMapping(value="/getAll")
	public String getAll(Model model) throws Exception{
		List<Contact> contacts=contactService.getAll();
		
		model.addAttribute("contacts", contacts);
		
		return "getAll";
	}*/
	
	//查询用户的全部记录
	@RequestMapping(value="/getAll")
	public String getAll(HttpSession session,int id)throws Exception{
		List<Contact> contacts =contactService.getAll(id);
		session.setAttribute("contacts", contacts);
		return "getAll";
	}
	
	//根据ID删除单条记录
	@RequestMapping(value="/deleteById")
	public ModelAndView deleteById(ModelAndView model,Integer t_id,int id){
		contactService.deleteById(t_id);
		model.setView(new RedirectView("/newssm/contact/getAll.action?id="+id));
		return model;
	}

	//修改记录信息
	@RequestMapping("/toUpdate")
	public String toUpdate(int t_id,Model model){
		Contact contact=contactService.getAllById(t_id);
		model.addAttribute("contact", contact);
		return "contact_update";
	}
	@RequestMapping(value="/doUpdate")
	public ModelAndView updateById(ModelAndView model,Contact contact){
		contactService.update(contact);
		int lalala=contact.getUser_id();
		model.setView(new RedirectView("/newssm/contact/getAll.action?id="+lalala));
		return model;
	}
	
	/*@RequestMapping(value="/doUpdate")
	public ModelAndView updateById(ModelAndView model,Contact contact){
		contact.setT_age(11);
		contact.setT_name("李锦记");
		contactService.update(contact);
		//System.out.println(contact.getT_address());
		int lalala=contact.getUser_id();
		model.setView(new RedirectView("/newssm/contact/getAll.action?id="+lalala));
		return model;
	}*/
	
	//增加单条通讯录记录
	@RequestMapping("/toSave")
	public String toSave(int user_id,HttpSession session){
		session.setAttribute("user_id", user_id);
		return "contact_save";
	}
	@RequestMapping(value="/save")
	public ModelAndView save(ModelAndView model,Contact contact){
		contactService.save(contact);
		int lalala=contact.getUser_id();
		model.setView(new RedirectView("/newssm/contact/getAll.action?id="+lalala));
		return model;
	}
	
	//动态查询
	@RequestMapping("/dynamicSelect")
	public ModelAndView dynamicSelect(Contact contact,HttpSession session,ModelAndView model)throws Exception{
		Map<String,Object> map = new LinkedHashMap<String, Object>();
		/*map.put("user_id", contact.getUser_id());*/
		map.put("t_name",contact.getT_name());
		map.put("t_school",contact.getT_school());
		map.put("t_gender", contact.getT_gender());
		
		List <Contact> dyContact=contactService.dynamicSelect(map);
		session.setAttribute("dyContact", dyContact);
		//odel.setViewName("dy_contact");
		if(dyContact!=null){
			 model.setViewName("dy_contact");
		}
		else
	    {
			model.addObject("message", "没查到相关信息");
			int lalala=contact.getUser_id();
			model.setView(new RedirectView("/newssm/contact/getAll.action?id="+lalala));
	    }
		return model;
	}
}


