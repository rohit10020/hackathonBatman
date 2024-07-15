package com.batman.hackthon.service;

import com.batman.hackthon.entity.TestingEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TestingService {
    TestingEntity create(TestingEntity testingEntity);
    List<TestingEntity> getAll();
    TestingEntity getById(String id);
    TestingEntity update(String id, TestingEntity testingEntity);
    void delete(String id);
}
