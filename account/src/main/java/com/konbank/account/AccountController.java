package com.konbank.account;

import org.openapitools.api.AccountApi;
import org.openapitools.model.AccountDTO;
import org.openapitools.model.AccountOperationDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController implements AccountApi {

    double balance = 10000;

    @Override
    public ResponseEntity<AccountDTO> getAccountById() {

       AccountDTO account = AccountDTO.builder()
               .balance(5000.0)
               .build();

       return ResponseEntity.ok(account);
    }

    @Override
    public ResponseEntity<String> performAction(AccountOperationDTO accountOperationDTO) {

        // Get account

        // Perform operation
        switch (accountOperationDTO.getOperationType()) {
            case ADDITION -> balance += accountOperationDTO.getAmount();
            case SUBTRACTION -> balance -= accountOperationDTO.getAmount();
        }

        final String response = "Current balance: " + balance;

        return ResponseEntity.ok(response);

    }


}
