/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ductmc.dto;

/**
 *
 * @author Peter
 */
public class RegisterRequest {

    private String username;
    private String password;
    private String fullname;
    private String numberPhone;
    private String email;

    public RegisterRequest() {
    }

    public RegisterRequest(String username, String password, String fullname, String numberPhone, String email) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
