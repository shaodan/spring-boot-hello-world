package com.blockfin.recorder.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class DemoApplication {

    @Value("${dry.run:true}")
    private boolean dryRun;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        String env = dryRun ? "Development" : "Production";
        return "Hello Spring Boot " + env;
    }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
