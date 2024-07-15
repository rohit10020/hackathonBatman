package com.batman.hackthon.service.impl;

import com.batman.hackthon.entity.TestingEntity;
import com.batman.hackthon.service.TestingService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TestingServiceImpl implements TestingService {

    private final Map<String, TestingEntity> data = new HashMap<>();

    @Override
    public TestingEntity create(TestingEntity testingEntity) {
        data.put(testingEntity.getName(), testingEntity);
        return testingEntity;
    }

    @Override
    public List<TestingEntity> getAll() {
        return new ArrayList<>(data.values());
    }

    @Override
    public TestingEntity getById(String id) {
        return data.get(id);
    }

    @Override
    public TestingEntity update(String id, TestingEntity testingEntity) {
        data.put(id, testingEntity);
        return testingEntity;
    }

    @Override
    public void delete(String id) {
        data.remove(id);
    }
}
