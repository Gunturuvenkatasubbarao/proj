package com.ltts.project.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.project.Dao.BookingDao;
import com.ltts.project.Dao.MemberDao;
import com.ltts.project.Dao.RoomDao;
import com.ltts.project.model.Booking;
import com.ltts.project.model.RoomDetails;

@RestController

public class RoomController {
	@Autowired
	MemberDao md;
	@Autowired
	BookingDao bd;
	@Autowired
	RoomDao rd;
	@RequestMapping("/hiii")
	public String firstMethod() {
		return "Hello SpringBoot";
	}
	
	@RequestMapping("/Room ")
	public ModelAndView secondMethod() {
		return new ModelAndView("index");
	}
	@RequestMapping("/RoomDetails")
	public ModelAndView registerUser() {
		return new ModelAndView("Room Details");
	}
	@RequestMapping("/room")
	public ModelAndView room() {
		return new ModelAndView("room");
	}
	@RequestMapping(value="adduser2", method=RequestMethod.POST)
	public ModelAndView addUser1(HttpServletRequest req, Model model) {
		ModelAndView mv=null;
		String hotelname=req.getParameter("hotelname");
		String roomnumber =req.getParameter("roomnumber");
		String roomtype=req.getParameter("roomtype");
		String roomdescription=req.getParameter("roomdescription");
		String floor=req.getParameter("floor");
		String facility=req.getParameter("facility");
		String cost=req.getParameter("cost");
		
	//	ApplicationContext ac=new ClassPathXmlApplicationContext();
		RoomDetails r=new RoomDetails(hotelname,roomnumber,roomtype,roomdescription,floor, facility, cost);
		System.out.println("***** INSIDE CONTROLLER ****"+r);
		boolean b=rd.InsertRoomDetails(r);
		if(b==false) {
			mv=new ModelAndView("details");
			
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
	@RequestMapping("/viewroom")
	public ModelAndView viewAllRoomDetails(Model model) {
		ModelAndView mv=new ModelAndView("viewroom");
		List<RoomDetails> li=rd.getAllRoomDetails();
		
		model.addAttribute("list", li);
		
		return mv;
	}
}

