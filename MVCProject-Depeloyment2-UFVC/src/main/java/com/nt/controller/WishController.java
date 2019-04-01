package com.nt.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		
		Calendar cal=null;
		String msg=null;
		int  hour=0;
		//get system get and time
		cal=Calendar.getInstance();
		//get current hour of day
		 hour=cal.get(Calendar.HOUR_OF_DAY);
		
		if(hour<12)
			msg="Good Mornning";
		else if(hour<16)
			msg="Good AfterNoon";
		else if(hour<20)
			msg="Good Evening";
		else
			msg="Good Night";
		
		return new ModelAndView("result","wmsg",msg);
	}

}
