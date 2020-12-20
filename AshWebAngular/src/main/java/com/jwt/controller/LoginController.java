/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwt.controller;

//import com.jwt.model.Employee;
import com.jwt.model.Login;
import java.io.IOException;

//import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//import com.model.Login;
import com.jwt.service.LoginService;
//import com.jwt.service.EmployeeService;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;

/**
 *
 * @author Abhijit
 */
@Controller
public class LoginController {
    
    private static final Logger logger = Logger
			.getLogger(LoginController.class);

    public LoginController() {
		System.out.println("LoginController()");
	}
    
        @Autowired
	private LoginService loginService;

    @RequestMapping(value = "/loginpage")
    public ModelAndView test(ModelAndView model) throws IOException {		
		model.setViewName("test");
//		return model;
                Login login = new Login();
		model.addObject("login", login);
		model.setViewName("LoginPage");
		return model;
	}
    
    
    //newRegistration
     @RequestMapping(value = "/newRegistration")
    public ModelAndView newRegistration(ModelAndView model) throws IOException {
                Login login = new Login();
		model.addObject("login", login);
		model.setViewName("NewRegistration");
		return model;
	}
    
    //ListUserMaster
    @RequestMapping(value = "/ListUserMaster")
	public ModelAndView listUserMaster(ModelAndView model) throws IOException {
		List<Login> listEmployee = loginService.getAllUsers();                               
		model.addObject("listEmployee", listEmployee);
		model.setViewName("UserMaster");
		return model;
	}
        
     @RequestMapping(value = "/deleteuser", method = RequestMethod.GET)
	public ModelAndView deleteEmployee(HttpServletRequest request) {
		int loginid = Integer.parseInt(request.getParameter("id"));
		loginService.deleteuser(loginid);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/edituser", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int loginid = Integer.parseInt(request.getParameter("id"));
		Login login = loginService.getlogin(loginid);
		ModelAndView model = new ModelAndView("NewRegistration");
		model.addObject("login", login);

		return model;
	}
        //Splitpage
        @RequestMapping(value = "/Splitpage")
    public ModelAndView Splitpage(ModelAndView model) throws IOException {		
		model.setViewName("notFound");
		return model;
    }
    
        
//        @RequestMapping(value = "/ListUserMaster")
//	public ModelAndView ListUserMaster(ModelAndView model) throws IOException {
//		List<Employee> listEmployee = employeeService.getAllEmployees();
//		model.addObject("listEmployee", listEmployee);
//		model.setViewName("UserMaster");
//		return model;
//	}
//    
//    //SaveRegistration
   @RequestMapping(value = "/SaveRegistration", method = RequestMethod.POST)
	public ModelAndView SaveRegistration(@ModelAttribute Login login) {
		if (login.getId()== 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			loginService.addRegistration(login);
		} else {
			loginService.addRegistration(login);
		}
		return new ModelAndView("redirect:/");
	}
//        //loginSuccess
//        
//          @RequestMapping(value = "/loginSuccess", method = RequestMethod.POST)
//          public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
//          @ModelAttribute("login") Login login) {
//            ModelAndView mav = null;
//            Login user = loginService.validateUser(login);
//            if (null != user) {
//            mav = new ModelAndView("test");
////            mav.addObject("firstname", user.getFirstname());
//            } else {
//            mav = new ModelAndView("notFound");
////            mav.addObject("message", "Username or Password is wrong!!");
//            }
//            return mav;
//          }

//        @RequestMapping(value="/loginSuccess", method=RequestMethod.POST)
//	public String login(@Valid @ModelAttribute("login") Login login, BindingResult result) {
//		if (result.hasErrors()) {
//			return "loginpage";
//		} else {
//			boolean found = studentService.findByLogin(studentLogin.getUserName(), studentLogin.getPassword());
//			if (found) {				
//				return "success";
//			} else {				
//				return "failure";
//			}
//		}
//		
//	}
}
