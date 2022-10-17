package com.beachResort.controller;

import com.beachResort.service.BeachResortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
//@RequestMapping("/beachResort")
public class BeachResortController {
    @Autowired
    BeachResortService beachResortService;
    @GetMapping(value = {"/","/beachResort"})
    public String showHomePage(Model model) {
        model.addAttribute("appName", "resort");
        return "html/index";
    }
    @GetMapping("/about")
    public String showAboutPage(Model model) {
       // beachResortService.reservedRoom();
       // System.out.println("Done");
        return "html/about";
    }
    @GetMapping("/rooms")
    public String showRoomsPage(Model model) {
        return "html/rooms";
    }
    @GetMapping("/reservation")
    public String showReservationPage(Model model) {
        return "html/reservation";
    }
    @GetMapping("/blog")
    public String showBlogPage(Model model) {
        return "html/blog";
    }
    @GetMapping("/contact")
    public String showContactPage(Model model) {
        return "html/contact";
    }

}
