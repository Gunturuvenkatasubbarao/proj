package com.ltts.project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.project.Dao.BookingDao;
import com.ltts.project.Dao.MemberDao;
import com.ltts.project.model.Booking;
import com.ltts.project.model.Member;

@RestController
public class HomeController {
	
	@Autowired
	MemberDao md;
	
	@RequestMapping("/hi")
	public String firstMethod() {
		return "Hello SpringBoot";
	}
	
	@RequestMapping(" ")
	public ModelAndView secondMethod() {
		return new ModelAndView("index");
	}
	@RequestMapping("/registration")
	public ModelAndView registerUser() {
		return new ModelAndView("registration");
	}
	@RequestMapping("/login")
	public ModelAndView login() {
		return new ModelAndView("login");
	}
	@RequestMapping("/details")
	public ModelAndView details() {
		return new ModelAndView("details");
	}
	@RequestMapping("/bookhotel")
	public ModelAndView bookhotel() {
		return new ModelAndView("bookhotel");
	}
	@RequestMapping("/menu")
	public ModelAndView menu() {
		return new ModelAndView("menu");
	
	}
	
	@RequestMapping("/logout")
	public ModelAndView logout() {
		return new ModelAndView("logout");
	
	}
	
	
	@RequestMapping(value="adduser", method=RequestMethod.POST)
	public ModelAndView addUser(HttpServletRequest req, Model model) {
		ModelAndView mv=null;
		String name=req.getParameter("name");
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		String country=req.getParameter("country");
		String mobile=req.getParameter("mobile");
		String email=req.getParameter("email");
		
	//	ApplicationContext ac=new ClassPathXmlApplicationContext();
		Member m=new Member(name,username,password,country,mobile,email);
		System.out.println("***** INSIDE CONTROLLER ****"+m);
		boolean b=md.InsertMember(m);
		if(b==false) {
			mv=new ModelAndView("login");
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
	@RequestMapping(value="checkuser")
	public ModelAndView checkUser(HttpServletRequest req, Model model) {
		ModelAndView mv=null;
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		Member m=md.getMemberByEmail(email);
		System.out.println(m);
		
		
		if(m !=null) {
		
			if(password.equals(m.getPassword())) {
				model.addAttribute("value", m.getUsername());
				mv=new ModelAndView("index");
				mv=new ModelAndView("navbar");
			}
			else {
				model.addAttribute("msg", "Password Wrong");
				mv=new ModelAndView("login");
			}
		}
		else {
			model.addAttribute("msg", "User Not Found Please Register");
			mv=new ModelAndView("login");
		}
		return mv;
	}
	
	
}
