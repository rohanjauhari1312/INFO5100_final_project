/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.Roles;

/**
 *
 * @author rohanjauhari
 */
public class Role {
    String name,username, password, role;
    @Override
    public String toString() {
        return name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    public Role(String roleName, String adminUserName, String rolePassword, String roleTask) {
                this.name=roleName;
                this.username = adminUserName;
                this.password = rolePassword;
                this.role = roleTask;

    }
        public boolean isMatch(String id) {
        if (getUsername().equals(id)) {
            return true;
        }
        return false;
    }
}
