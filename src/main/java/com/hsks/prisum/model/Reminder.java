package com.hsks.prisum.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;
import java.util.Date;

@Entity(name="reminders")
@IdClass(Reminder.class)
public class Reminder implements Serializable {

    @Id
    private Date time;
    @Id
    private String activity;
    @Id
    private String email;

    public void setTime(Date time) {
        this.time = time;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getTime() {
        return time;
    }

    public String getActivity() {
        return activity;
    }

    public String getEmail() {
        return email;
    }
}
