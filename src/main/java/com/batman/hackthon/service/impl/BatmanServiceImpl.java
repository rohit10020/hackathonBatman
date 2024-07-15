package com.batman.hackthon.service.impl;

import com.batman.hackthon.entity.BatmanEntity;
import com.batman.hackthon.service.BatmanService;
import com.batman.hackthon.util.EmailSender;
import jakarta.mail.MessagingException;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;

@Service
public class BatmanServiceImpl implements BatmanService {

    JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
    EmailSender emailSender = new EmailSender(mailSender);

    @Override
    public String logError(BatmanEntity batmanEntity) {
        try {
            sendEmail(batmanEntity);
        } catch (MessagingException | UnsupportedEncodingException e) {
            e.printStackTrace();
            System.out.println("Error sending email : " + e.getMessage());
        }
        logInDB(batmanEntity);

        return "Error logged successfully";
    }

    private void logInDB(BatmanEntity batmanEntity) {
        System.out.println("Error logged in DB : " + batmanEntity);
    }

    private void sendEmail(BatmanEntity batmanEntity) throws MessagingException, UnsupportedEncodingException {
        emailSender.sendEmail("rohit.r.gupta@sunlife.com", "Issue Number : "+batmanEntity.getIssueNumber(), batmanEntity.getIssueDescription());

    }
}