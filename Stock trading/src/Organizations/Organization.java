/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organizations;

/**
 *
 * @author rohanjauhari
 */
public class Organization {
    String name,username, password, role;

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
    public Organization(String organizationName, String adminUserName, String organizationPassword, String organizationRole) {
                this.name=organizationName;
                this.username = adminUserName;
                this.password = organizationPassword;
                this.role = organizationRole;

    }
        public boolean isMatch(String id) {
        if (getUsername().equals(id)) {
            return true;
        }
        return false;
    }
}
