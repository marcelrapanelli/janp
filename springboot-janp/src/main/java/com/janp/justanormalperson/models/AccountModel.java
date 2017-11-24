package com.janp.justanormalperson.models;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by Marcel.Tavares on 21/06/2017.
 */
@Document(collection = "account")
public class AccountModel {

    private String id;
    @Indexed(unique = true)
    private String email;
    private String password;
    private String recoveryPin;
    private List<HeroModel> heros;
    private boolean active;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRecoveryPin() {
        return recoveryPin;
    }

    public void setRecoveryPin(String recoveryPin) {
        this.recoveryPin = recoveryPin;
    }

    public List<HeroModel> getHeros() {
        return heros;
    }

    public void setHeros(List<HeroModel> heros) {
        this.heros = heros;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
