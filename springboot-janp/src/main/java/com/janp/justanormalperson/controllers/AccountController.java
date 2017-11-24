package com.janp.justanormalperson.controllers;

import com.janp.justanormalperson.datas.AccountData;
import com.janp.justanormalperson.datas.ResponseData;
import com.janp.justanormalperson.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Marcel.Tavares on 16/10/2017.
 */
@RestController
@RequestMapping("/acc")
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "generate", method = RequestMethod.POST)
    public ResponseEntity<ResponseData> createNewAccount(@RequestBody AccountData accountData) {
        ResponseData responseData = new ResponseData(false, true, "Created with success!");
        if(!accountService.generateNewAccount(accountData)) {
            responseData = new ResponseData(true, false, "Failed to create account");
        }
        return ResponseEntity.ok(responseData);
    }
}
