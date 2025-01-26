package com.konbank.transaction;

import org.openapitools.api.TransactionApi;
import org.openapitools.model.TransferDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import java.net.http.HttpClient;

@RestController
public class TransactionController implements TransactionApi {

//    @Override
//    public ResponseEntity<TransferDTO> transfer() {
//
//        // TODO Move to Service, add a transaction
//
//        // Get from account
//
//        // Get to Account
//
//        // subtract from fromAccount
//
//        // add to toAccount
//
//    }


    @Override
    public ResponseEntity<Void> transfer(TransferDTO transferDTO) {

        System.out.println("Transfer method");

        WebClient webClient = WebClient.create("http://localhost:8081");
//
        String response = webClient.get()
                .uri("/api/v1/account") // Endpoint URI
//                .header("Content-Type", "application/json") // Set headers
//                .bodyValue(jsonPayload) // Set the request body
                .retrieve() // Retrieve the response
                .bodyToMono(String.class) // Map the body to a String (Mono<String>)
                .block();

        System.out.println(response);

        return ResponseEntity.ok().build();

    }
}
