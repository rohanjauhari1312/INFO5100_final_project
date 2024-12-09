/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author rohanjauhari
 */
public class Person {

    String username, role, enterpriseName, orgName, designation, firstName, lastName, dob, email, bankBalance, phoneNo, password;
    int id;
        boolean isInactive=false;
    public void changeActiveStatus(){
        isInactive = !isInactive;
    }
    private static int count=0;
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(String bankBalance) {
        this.bankBalance = bankBalance;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
public void setPassword(String password) {
        this.password = password;
    }
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public Person(String username,  String role) {
        count++;
        this.id = count;
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
        return getUsername();
    }

    public String getPassword() {
        return password;
    }

    public boolean getActiveStatus() {
        return isInactive;
    }
}
