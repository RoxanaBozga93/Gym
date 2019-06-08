package ro.sci.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ro.sci.model.Admin;
import ro.sci.model.User;
import ro.sci.service.AdminService;

import javax.validation.Valid;

@Controller
public class AdminController {


    @Autowired
    private AdminService adminService;


    @GetMapping("/admin")
    public String adminForm(@Valid Admin admin, BindingResult result, Model model) {
//        user = new User("Ion", "Mester", "Ion.Mester@yahoo.com", "pass", "23453657");
//        model.addAttribute("email", user.getEmail());
//        model.addAttribute("firstName", user.getFirstName());
//        model.addAttribute("lastName", user.getLastName());

//        model.addAttribute("user1", user);
////        model.addAttribute("dd", email);
////        model.addAttribute("ff", pass);

        if (result.hasErrors()) {
            return "admin";
        }
        model.addAttribute("admin", admin);
        return "admin";
    }


    @PostMapping("/admin")
    public String userSave(@ModelAttribute Admin admin) {
        adminService.save(admin);
        return "result_admin";
    }
}
