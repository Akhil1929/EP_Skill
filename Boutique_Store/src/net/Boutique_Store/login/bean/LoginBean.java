package net.Boutique_Store.login.bean;

import java.io.Serializable;

public class LoginBean implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String email_id;
    private String password;
    
    public String getemail_id() {
        return email_id;
    }

    public void setemail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}