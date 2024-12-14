package com.xworkz.xworkzLogin.controller;

import com.xworkz.xworkzLogin.dto.LoginDTO;
import com.xworkz.xworkzLogin.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class LoginController {
    public LoginController() {
        System.out.println("LoginController created");
    }
@Autowired
private LoginService loginService;


    @RequestMapping(value = "/submitForm", method = {RequestMethod.GET, RequestMethod.POST})
    public String onSave(LoginDTO loginDTO, Model model) {
        System.out.println("save method"+loginDTO);

        System.out.println("LoginController: onSave method invoked");
        System.out.println("Received DTO: " + loginDTO);

        boolean isSaved = loginService.save(loginDTO);

        if (isSaved) {
            System.out.println("Admin details saved successfully");
            model.addAttribute("successMessage", "Registration successful!");
            return "Success.jsp";
        } else {
            System.err.println("Failed to save admin details");
            model.addAttribute("errorMessage", "Registration failed. Please check your input.");
            model.addAttribute("loginDetails", loginDTO);
            return "login.jsp";
        }
    }
}
