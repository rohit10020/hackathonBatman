package com.batman.hackthon.controller;

import com.batman.hackthon.entity.BatmanEntity;
import com.batman.hackthon.entity.TestingEntity;
import com.batman.hackthon.service.BatmanService;
import jakarta.mail.MessagingException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.util.List;

@RestController
@RequestMapping("/batman")
public class BatmanController {

    private final BatmanService batmanService;

    public BatmanController(BatmanService batmanService) {
        this.batmanService = batmanService;
    }

    @PostMapping
    public ResponseEntity<String> logError(@RequestBody BatmanEntity batmanEntity) throws MessagingException, UnsupportedEncodingException {
        return ResponseEntity.ok(batmanService.logError(batmanEntity));
    }

}