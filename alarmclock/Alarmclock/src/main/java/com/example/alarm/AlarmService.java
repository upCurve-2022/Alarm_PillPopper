package com.example.alarm;


import com.example.alarm.model.Alarm;

import java.util.List;

public interface AlarmService {
        Alarm getAlarmById(long id);
        Alarm updateAlarm(Alarm alarm, long id);
        void deleteAlarm(long id);
        Alarm saveAlarm(Alarm alarmDTO);
        List<Alarm> getAllAlarm();
}
