package com.hsks.prisum.repository;

import com.hsks.prisum.model.Reminder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ReminderRepository extends CrudRepository<Reminder, Reminder> {
    public Reminder save(Reminder reminder);
}
