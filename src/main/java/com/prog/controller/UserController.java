package com.prog.controller;

import com.prog.entity.UserDtls;
import com.prog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    // Load the homepage
    @GetMapping("/")
    public String home(HttpSession session, Model model) {
        String message = (String) session.getAttribute("message");
        if (message != null) {
            model.addAttribute("message", message);
            session.removeAttribute("message");
        }
        return "index"; // Render index.html or index.jsp
    }

    // Handle user registration via browser
    @PostMapping("/register")
    public String register(@ModelAttribute UserDtls user, HttpSession session) {
        userService.saveUser(user);
        session.setAttribute("message", "User Registered Successfully.");
        return "redirect:/";
    }

    // API to Register User (Postman Access)
    @PostMapping("/api/register")
    @ResponseBody
    public String registerApi(@RequestBody UserDtls user) {
        userService.saveUser(user);
        return "User Registered Successfully!";
    }
    // API to Get All Users (Postman Access)
    @GetMapping("/api/users")
    @ResponseBody
    public List<UserDtls> listUsersApi() {
        return userService.getAllUsers();
    }

    // API to Get User by ID (Postman Access)
    @GetMapping("/api/users/{id}")
    @ResponseBody
    public UserDtls viewUserApi(@PathVariable String id) {
        return userService.getUserById(id);
    }

    // API to Update User (Postman Access)
    @PutMapping("/api/update")
    @ResponseBody
    public String updateUserApi(@RequestBody UserDtls user) {
        if (userService.getUserById(user.getId()) != null) {
            userService.updateUser(user);
            return "User Updated Successfully!";
        }
        return "User not found!";
    }

    // API to Delete User (Postman Access)
    @DeleteMapping("/api/delete/{id}")
    @ResponseBody
    public String deleteUserApi(@PathVariable("id") String id) {
        if (userService.getUserById(id) != null) {
            userService.deleteUser(id);
            return "User Deleted Successfully!";
        }
        return "User not found!";
    }
}

