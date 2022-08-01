package com.example.alarm.dto;


    public record AlarmDTO(
            int id,
            String name,
            int hour,
            int minute,
            int autoStopMinutes) {
    }

