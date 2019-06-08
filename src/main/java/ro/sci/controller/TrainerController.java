package ro.sci.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ro.sci.model.Trainer;
import ro.sci.service.TrainerService;

import javax.validation.Valid;

@Controller
public class TrainerController {


    @Autowired
    private TrainerService trainerService;

    @GetMapping("/trainer")
    public String trainerForm(@Valid Trainer trainer, BindingResult result, Model model) {

        if (result.hasErrors()) {
            return "trainer";
        }
        model.addAttribute("trainer", trainer);
        return "trainer";
    }


    @PostMapping("/trainer")
    public String trainerSave(@ModelAttribute Trainer trainer) {
        System.out.println(trainer.getSalary());
        trainerService.save(trainer);
        return "result_trainer";
    }
}
