package com.konbank.account;

import org.openapitools.api.AccountApi;
import org.openapitools.model.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController implements AccountApi {

    @Override
    public ResponseEntity<Account> getAccountById() {

       Account account = Account.builder()
               .balance(5000.0)
               .build();

       return ResponseEntity.ok(account);
    }
}
