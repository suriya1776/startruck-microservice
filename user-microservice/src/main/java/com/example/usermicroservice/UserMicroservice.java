package com.example.usermicroservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class UserMicroservice {

    public static void main(String[] args) {
        SpringApplication.run(UserMicroservice.class, args);
    }
}

@RestController
class UserController {

    private final RestTemplate restTemplate;

    public UserController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/send-email")
    public String sendEmail() {
        String emailServiceUrl = "http://localhost:8081/send";
        String response = restTemplate.getForObject(emailServiceUrl, String.class);
        return "Email sent: " + response;
    }
}
