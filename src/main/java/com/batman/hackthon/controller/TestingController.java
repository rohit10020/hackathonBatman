package com.batman.hackthon.controller;

import com.batman.hackthon.entity.TestingEntity;
import com.batman.hackthon.service.TestingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/testing")
public class TestingController {

    private final TestingService testingService;

    public TestingController(TestingService testingService) {
        this.testingService = testingService;
    }

    @PostMapping
    public ResponseEntity<TestingEntity> create(@RequestBody TestingEntity testingEntity) {
        return ResponseEntity.ok(testingService.create(testingEntity));
    }

    @GetMapping
    public ResponseEntity<List<TestingEntity>> getAll() {
        return ResponseEntity.ok(testingService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TestingEntity> getById(@PathVariable String id) {
        return ResponseEntity.ok(testingService.getById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TestingEntity> update(@PathVariable String id, @RequestBody TestingEntity testingEntity) {
        return ResponseEntity.ok(testingService.update(id, testingEntity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        testingService.delete(id);
        return ResponseEntity.ok().build();
    }
}
