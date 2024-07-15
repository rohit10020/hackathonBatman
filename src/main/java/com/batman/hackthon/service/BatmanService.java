package com.batman.hackthon.service;

import com.batman.hackthon.entity.BatmanEntity;
import jakarta.mail.MessagingException;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;

@Component
public interface BatmanService {

    String logError(BatmanEntity batmanEntity) throws MessagingException, UnsupportedEncodingException;
}