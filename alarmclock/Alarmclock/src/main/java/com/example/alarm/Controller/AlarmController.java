package com.example.alarm.Controller;
import com.example.alarm.model.Alarm;
import com.example.alarm.repository.AlarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/alarm")
public class AlarmController {
    @Autowired
    private final AlarmRepository alarmRepository;
    private com.example.alarm.AlarmService AlarmRepository;

    public AlarmController(AlarmRepository alarmRepository) {
        this.alarmRepository = alarmRepository;
    }

    @GetMapping
    public List<Alarm> getAllAlarms() {
        return alarmRepository.findAll();
    }
    @PostMapping
    public Alarm saveAlarm(@RequestBody Alarm alarm) {
        return this.AlarmRepository.saveAlarm(alarm);
    }

    @DeleteMapping
    public void deleteAlarm(@PathVariable("id") Long id) {
        AlarmRepository.deleteAlarm(id);
    }

}






