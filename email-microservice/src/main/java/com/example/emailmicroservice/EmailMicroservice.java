package com.example.emailmicroservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class EmailMicroservice {

    public static void main(String[] args) {
        SpringApplication.run(EmailMicroservice.class, args);
    }
}

@RestController
class EmailController {

    @GetMapping("/send")
    public String sendEmail() {
        return "Email sent successfully!";
    }
}

