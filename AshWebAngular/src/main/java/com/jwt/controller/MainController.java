/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Ashwini
 */
@Controller
public class MainController {
    
     @RequestMapping(value =  "/")
	public String menu() {
            //model.addAttribute("message", "Programmer Gate");
            return "/MainPage";
        }
       @RequestMapping(value = "/home")
	public String welcome() {
            //model.addAttribute("message", "Programmer Gate");
            return "/homePage";
        }
        @RequestMapping(value = "/userInfo")
	public String userInfo() {
            //model.addAttribute("message", "Programmer Gate");
            return "/userInfoPage";
        }
         @RequestMapping(value = "/admin")
	public String admin() {
            //model.addAttribute("message", "Programmer Gate");
            return "/adminPage";
        }
}
