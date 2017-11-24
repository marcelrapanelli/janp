package com.janp.justanormalperson.datas;

/**
 * Created by Marcel.Tavares on 20/10/2017.
 */
public class AccountData {

    private String id;
    private String email;
    private String password;
    private String recoveryPin;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
