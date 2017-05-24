package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HellowordController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("test hellowordController>>>>>>>>>>>");
		
		ModelAndView modelview = new ModelAndView();
		modelview.setViewName("hello");
		
		return modelview;
	}

}
