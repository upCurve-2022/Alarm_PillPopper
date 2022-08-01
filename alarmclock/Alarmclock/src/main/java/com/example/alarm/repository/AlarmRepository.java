package com.example.alarm.repository;

import com.example.alarm.model.Alarm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface AlarmRepository extends JpaRepository<Alarm, Long> {

}
