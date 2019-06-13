package ro.sci.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ro.sci.model.User;
import ro.sci.service.UserService;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public String userForm(@Valid User user, BindingResult result, Model model) {
//        user = new User("Ion", "Mester", "Ion.Mester@yahoo.com", "pass", "23453657");
////        model.addAttribute("email", user.getEmail());
////        model.addAttribute("firstName", user.getFirstName());
////        model.addAttribute("lastName", user.getLastName());
//
////        model.addAttribute("user1", user);
//////        model.addAttribute("dd", email);
//////        model.addAttribute("ff", pass);

        if (result.hasErrors()) {
            return "user";
        }
        model.addAttribute("user", user);
        return "user";
    }


    @PostMapping("/user")
    public String userSave(@ModelAttribute User user) {
        userService.save(user);
        return "result_user";
    }

}
