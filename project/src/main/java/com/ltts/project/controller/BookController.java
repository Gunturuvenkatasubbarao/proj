package com.ltts.project.controller;




import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.project.Dao.BookingDao;
import com.ltts.project.Dao.MemberDao;
import com.ltts.project.model.Booking;



@RestController
public class BookController {
	@Autowired
	BookingDao bd;
	
	@GetMapping("/bookhotel")
public ModelAndView searchHotelPage(ModelAndView modelAndView) {
		
		modelAndView.setViewName("bookhotel");
		return modelAndView;
	}
	@RequestMapping(value="adduser1", method=RequestMethod.POST)
	public ModelAndView addUser1(HttpServletRequest req, Model model) {
		ModelAndView mv=null;
		String bookingid =req.getParameter("bookingid");
		String roomnumber=req.getParameter("roomnumber");
	    String bookingdate=req.getParameter("bookingdate");
	    Date d=Date.valueOf(bookingdate);
		String status=req.getParameter("status");
		String checkoutdate=req.getParameter("checkoutdate");
		Date d1=Date.valueOf(checkoutdate);
		String paymenttype=req.getParameter("paymenttype");
		String cost=req.getParameter("cost");
		String menuid=req.getParameter("menuid");
		String menudate=req.getParameter("menudate");
		Date d2=Date.valueOf(menudate);
		boolean isBooked = Boolean.parseBoolean(req.getParameter("isBooked"));
		
		
	//	ApplicationContext ac=new ClassPathXmlApplicationContext();
		Booking n=new Booking(bookingid,roomnumber,d,status,d1,paymenttype,cost,menuid,d2,isBooked);
		System.out.println("***** INSIDE CONTROLLER ****"+n);
		boolean b=bd.InsertBooking(n);
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
	
	@RequestMapping("/viewbooking")
	public ModelAndView viewAllBooking(HttpServletRequest req,Model model) {
		ModelAndView mv=new ModelAndView("viewbooking");
		List<Booking> li=bd.getAllBooking();
		
		model.addAttribute("list", li);
		String bookingid = req.getParameter("bookingid");
		Booking b = bd.getById(bookingid);
		System.out.println(b);
		
		if(b!=null) {
			if(bookingid.equals(b.getBookingid())) {
			        b.getIsBooked();
			
			}
		}
		
		return mv;
	}

	/*@RequestMapping("/viewbooking")
	public ModelAndView checkUser(HttpServletRequest req, Model model) {
		ModelAndView mv=null;
		String email=req.getParameter("lemail");
		String pass=req.getParameter("lpass");
		
		
		System.out.println();
		
		
		if(m !=null) {
		
			if(pass.equals(m.getPassword())) {
				model.addAttribute("value", m.getUserName());
				mv=new ModelAndView("welcome");
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
	}*/



}

