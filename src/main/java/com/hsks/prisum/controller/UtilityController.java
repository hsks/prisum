package com.hsks.prisum.controller;

import com.hsks.prisum.model.Reminder;
import com.hsks.prisum.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.Response;

@Controller
public class UtilityController {
    @Autowired
    private UtilityService utilityService;

    @PostMapping("/addReminder")
    @ResponseBody
    public void addReminder(Reminder reminder) {
    utilityService.addReminder(reminder);
    }

}
