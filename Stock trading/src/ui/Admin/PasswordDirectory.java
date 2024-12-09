/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.Admin;

import model.*;
import java.util.HashMap;

/**
 *
 * @author rohanjauhari
 */
public class PasswordDirectory {
    protected HashMap<String, String> passwords;
    public PasswordDirectory(){
        passwords = new HashMap<String, String>();
    }

    protected HashMap<String, String> getPasswords() {
        return passwords;
    }
    public boolean validatePassword(String username, String password){
        return (password.equals(passwords.get(username)));
    }
    public boolean register(String username, String password){
        if (passwords.containsKey(username))
            return false;
        passwords.put(username, password);
        return true;
    }
    
    protected void remove(String username){
        passwords.remove(username);
    }

    void update(String text, String p) {
        passwords.put(p, text);
    }
}
