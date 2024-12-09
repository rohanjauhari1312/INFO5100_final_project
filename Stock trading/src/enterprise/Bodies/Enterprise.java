/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enterprise.Bodies;

import model.Person;

/**
 *
 * @author rohanjauhari
 */
public class Enterprise {

    String name,username, password, role;
    Person p;

    public Person getPerson() {
        return p;
    }

    public void setPerson(Person p) {
        this.p = p;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

        public Enterprise(String name, String username, String password, String role) {

        this.name=name;
        this.password=password;
        this.username = username;
        this.role = role;
    }

    public boolean isMatch(String id) {
        if (getUsername().equals(id)) {
            return true;
        }
        return false;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return name;
    }
}
