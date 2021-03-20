package com.ltts.project.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.project.Dao.MemberDao;
import com.ltts.project.Dao.MenuDao;
import com.ltts.project.model.Booking;
import com.ltts.project.model.Member;
import com.ltts.project.model.Menu;

@RestController
public class MenuController {
	
	@Autowired
	MemberDao md;
	@Autowired
	MenuDao fd;
	
	@RequestMapping("/hye")
	public String firstMethod() {
		return "Hello SpringBoot";
	}
	
	@RequestMapping("menu ")
	public ModelAndView secondMethod() {
		return new ModelAndView("index");
	}
	@RequestMapping("/Menu")
	public ModelAndView registerUser() {
		return new ModelAndView("Menu");
	}
	
	@RequestMapping(value="adduser3", method=RequestMethod.POST)
	public ModelAndView addUser(HttpServletRequest req, Model model) {
		ModelAndView mv=null;
		String menuid=req.getParameter("menuid");
		String menuname=req.getParameter("menuname");
		String cost=req.getParameter("cost");
		
		
	//	ApplicationContext ac=new ClassPathXmlApplicationContext();
		Menu f=new Menu(menuid,menuname,cost);
		System.out.println("***** INSIDE CONTROLLER ****"+f);
		boolean b=fd.InsertMenu(f);
		if(b==false) {
			mv=new ModelAndView("success");
			model.addAttribute("msg", "Successfully Inserted.. ");
		}
		else {
			mv=new ModelAndView("error");
			model.addAttribute("msg", "Error due to Connection");
			
		}
		/*
		 * try { b=md.InsertMember(m); mv=new ModelAndView("success"); } catch(Exception
		 * e) {
		 * 
		 * mv=new ModelAndView("error"); }
		 */
		
		
		return mv;
	}
	@RequestMapping("/viewmenu")
	public ModelAndView viewAllMenu(Model model) {
		ModelAndView mv=new ModelAndView("viewmenu");
		List<Menu> li=fd.getAllMenu();
		
		model.addAttribute("list", li);
		
		return mv;
	}
}