package com.batman.hackthon.util;

import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class EmailSender {
    private JavaMailSender mailSender;

    public EmailSender(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendEmail(String email, String subject, String content) throws MessagingException, UnsupportedEncodingException {
        Properties props = System.getProperties();
        props.put( "mail.smtp.host", "SMTP.ca.sunlife" );

        jakarta.mail.Session session = jakarta.mail.Session.getDefaultInstance( props, null );
        Message msg = new MimeMessage( session );
        msg.setFrom( new InternetAddress( "i.am.djrg@gmail.com" ));
        msg.addRecipient( Message.RecipientType.TO, new InternetAddress( "rohit.r.gupta@sunlife.com" ));
        msg.addRecipient( Message.RecipientType.TO, new InternetAddress( "arvind.pal@sunlife.com" ));
        msg.addRecipient( Message.RecipientType.TO, new InternetAddress( "ujjwal.s.sharma@sunlife.com" ));
        msg.setSubject( subject);
        msg.setText( content );

        msg.setHeader( "X-Mailer", "Sunlife" );
        msg.setSentDate( new java.util.Date());
        jakarta.mail.Transport.send( msg );
    }
}