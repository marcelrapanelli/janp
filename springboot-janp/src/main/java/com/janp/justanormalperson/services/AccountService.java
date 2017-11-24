package com.janp.justanormalperson.services;

import com.janp.justanormalperson.datas.AccountData;
import com.janp.justanormalperson.models.AccountModel;
import com.janp.justanormalperson.populators.AccountPopulator;
import com.janp.justanormalperson.repository.impl.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Marcel.Tavares on 20/10/2017.
 */
@Service
public class AccountService {

//    @Value("${hybris.export.class.attribute.value.endpoint}")
//    private String apiExportAttributeValue;

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private AccountPopulator accountPopulator;

    public boolean generateNewAccount(AccountData accountData){
        boolean successOnCreation = false;
        AccountModel accountModel = getAccountForData(accountData.getEmail());
        if(accountModel == null){
            accountPopulator.populate(accountData, accountModel);
            accountRepository.save(accountModel);
            successOnCreation = true;
        }

        return successOnCreation;
    }

    public AccountModel getAccountForData(String email){
        AccountModel accountModel = accountRepository.findByEmail(email);
        return accountModel;
    }
}
