package com.konbank.account;

import org.openapitools.api.AccountApi;
import org.openapitools.model.AccountDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController implements AccountApi {

    @Override
    public ResponseEntity<AccountDTO> getAccountById() {

       AccountDTO account = AccountDTO.builder()
               .balance(5000.0)
               .build();

       return ResponseEntity.ok(account);
    }
}
