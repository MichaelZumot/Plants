package webg5.g52094.plants.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import webg5.g52094.plants.business.PlantsService;

@Controller
public class MainCtrl {

    private static final Logger log = LoggerFactory.getLogger("MusiqueApp.java");

    @Autowired
    PlantsService service;

    @GetMapping("/")
    public String getIndex(Model model) {
        return "home";
    }

    @GetMapping("/plants")
    public String getPlants(Model model) {
        model.addAttribute("plants", service.getAllPlants());
        return "plants";
    }


}

