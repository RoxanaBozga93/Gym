package ro.sci.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ro.sci.model.User;
import ro.sci.repo.UserRepository;
import ro.sci.service.UserService;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

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

//    @GetMapping("/all")
//    public String showAll(Model model) {
//        model.addAttribute("books", userService.findAll());
//        return "books/allBooks";
//    }


    @GetMapping("/")
    public String root() {
        return "index";
    }

//    @GetMapping("/user")
//    public String userIndex() {
//        return "user/index";
//    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/access-denied")
    public String accessDenied() {
        return "/error/access-denied";
    }

    @GetMapping
    public String currentUser(@ModelAttribute("user") @Valid User user, BindingResult result, Model model) {

        Authentication loggedInUser = SecurityContextHolder.getContext().getAuthentication();
        String email = loggedInUser.getName();

        user = userService.findByEmail(email);
        String firstName = user.getFirstName();
        model.addAttribute("firstName", firstName);
        model.addAttribute("emailAddress", email);

        return "user/index"; //this is the name of my template
    }
}
