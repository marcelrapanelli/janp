package com.janp.justanormalperson.populators;

import com.janp.justanormalperson.datas.AccountData;
import com.janp.justanormalperson.models.AccountModel;
import org.springframework.stereotype.Component;

/**
 * Created by Marcel.Tavares on 20/10/2017.
 */
@Component
public class AccountPopulator {

    public void populate(AccountData source, AccountModel target) {
        target.setEmail(source.getEmail());
        target.setPassword(source.getPassword());
        target.setRecoveryPin(source.getEmail());
        target.setActive(source.isActive());
    }
}
