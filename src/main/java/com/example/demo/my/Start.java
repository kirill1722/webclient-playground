package com.example.demo.my;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class Start {

    @Autowired
    private WebClient webClient;

    @PostConstruct
    public void init() {
        System.out.println("start");
        String result = webClient.get()
                .retrieve()
                .bodyToMono(String.class)
                .block();
        System.out.println("end");
    }

}
