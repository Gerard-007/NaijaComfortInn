package com.naija.inn.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @GetMapping("/dashboard")
    public String getAdminDashboard() {
        return "Welcome, Admin!";
    }
}
