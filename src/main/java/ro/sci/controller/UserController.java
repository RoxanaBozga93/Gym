package ro.sci.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ro.sci.enums.ROLES;
import ro.sci.model.User;

@Controller
public class UserController {


    @GetMapping("/user")
    public String greeting(@RequestParam(name="email", required=true, defaultValue="World") String email,
                           @RequestParam(name="pass", required=false) String pass, Model model) {
        User user = new User("Ion", "Mester", "Ion.Mester@yahoo.com", "pass", "23453657", ROLES.USER);
//        model.addAttribute("email", user.getEmail());
//        model.addAttribute("firstName", user.getFirstName());
//        model.addAttribute("lastName", user.getLastName());

        model.addAttribute("user1", user);
        model.addAttribute("dd", email);
        model.addAttribute("ff", pass);
        return "user";
    }
}
