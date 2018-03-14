package br.com.paulo.spring.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mailer {

    private String to;

    @Value("remember@gmail.com")
    private String from;

    @Value("Lembrete de senha")
    private String title;

    private String message;

    public void setTo(String to) {
        this.to = to;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void sendEmail(){
        System.out.println("*** Email successfully sent! ***");
        System.out.println("E-mail title: " + title);
        System.out.println("From: " + from);
        System.out.println("To: " + to);
        System.out.println("Message: " + message);
    }


}
