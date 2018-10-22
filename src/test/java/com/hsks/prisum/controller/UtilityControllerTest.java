package com.hsks.prisum.controller;

import com.hsks.prisum.model.Reminder;
import com.hsks.prisum.service.UtilityService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class UtilityControllerTest {
    @InjectMocks
    private UtilityController utilityController;
    @Mock
    private UtilityService utilityService;

    private Reminder reminder;
    @Before
    public void setUp() throws Exception {
        reminder = mock(Reminder.class);
    }

    @Test
    public void shouldAddReminders() {
        utilityController.addReminder(reminder);

        verify(utilityService).addReminder(reminder);
    }
}