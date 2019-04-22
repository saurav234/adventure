package com.nvsm.adventure.controllers;

import com.nvsm.adventure.model.repositories.ActivityRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

    private ActivityRepository activityRepository;

    public HomePageController(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    @RequestMapping("/adventure")
    public String fetchTrecks(Model model) {
        model.addAttribute("activities", activityRepository.findAll());
        return "index";
    }
}
