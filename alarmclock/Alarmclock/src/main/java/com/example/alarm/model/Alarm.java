package com.example.alarm.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
    @Table(name = "alarms")
    @EntityListeners(AuditingEntityListener.class)
    @JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
           allowGetters = true)
    public class Alarm {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "alarm_id")
        private Long id;
        @Column(name = "name")
        private String name;
        @Column(name = "hours")
        private int hour;
        @Column(name = "minutes")
        private int minute;
        @Column(name = "auto_stop_minutes")
        private int autoStopMinutes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id =  id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getAutoStopMinutes() {
        return autoStopMinutes;
    }

    public void setAutoStopMinutes(int autoStopMinutes) {
        this.autoStopMinutes = autoStopMinutes;
    }

}
