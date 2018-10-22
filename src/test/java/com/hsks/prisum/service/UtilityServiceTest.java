package com.hsks.prisum.service;

import com.hsks.prisum.model.Reminder;
import com.hsks.prisum.repository.ReminderRepository;
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
public class UtilityServiceTest {
    @InjectMocks
    private UtilityService utilityService;
    @Mock
    private ReminderRepository reminderRepository;

    private Reminder reminder;

    @Before
    public void setUp() throws Exception {
        reminder = mock(Reminder.class);
    }

    @Test
    public void shouldAddReminder() {
        utilityService.addReminder(reminder);

        verify(reminderRepository).save(reminder);
    }
}