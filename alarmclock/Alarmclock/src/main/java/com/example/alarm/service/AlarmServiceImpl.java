package com.example.alarm.service;
import com.example.alarm.AlarmService;
import com.example.alarm.model.Alarm;
import com.example.alarm.repository.AlarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AlarmServiceImpl implements AlarmService {
    @Autowired
    AlarmRepository alarmRepository;
    private com.example.alarm.model.Alarm Alarm;

    @Override
    public List<Alarm> getAllAlarm() {
        return (List<Alarm>) alarmRepository.findAll();
    }

    @Override
    public Alarm getAlarmById(long id) {
        return null;
    }

    @Override
    public Alarm updateAlarm(Alarm alarm, long id) {
        return alarmRepository.save(Alarm);
    }

    @Override
    public void deleteAlarm(long id) {
    }

    @Override
    public Alarm saveAlarm(Alarm alarm) {
        return alarmRepository.save(Alarm);
    }
    }

