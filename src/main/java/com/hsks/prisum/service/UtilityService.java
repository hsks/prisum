package com.hsks.prisum.service;

import com.hsks.prisum.model.Reminder;
import com.hsks.prisum.repository.ReminderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilityService {
    @Autowired
    private ReminderRepository reminderRepository;

    public void addReminder(Reminder reminder) {
        reminderRepository.save(reminder);
    }
}
