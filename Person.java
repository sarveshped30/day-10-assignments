package com.bridgeLabz.AddressBookManagement;

public class Person {
    // Class variable declaration
    private String fName;
    private String lName;
    private String emailId;
    private String state;
    private String city;
    private long phoneNumber;

    public Person(String fName, String lName, String emailId, long phoneNum, String state, String city) {
        this.fName = fName;
        this.lName = lName;
        this.emailId = emailId;
        this.phoneNumber = phoneNum;
        this.state = state;
        this.city = city;
    }

    // Method for setting class variables
    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getFName() {
        return this.fName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    // Methods for displaying class variables
    public String getLName() {
        return this.lName;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getEmailId() {
        return this.emailId;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public void setPhoneNumber(long phoneNum) {
        this.phoneNumber = phoneNum;
    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    public String toString() {
        String info = "Name: " + fName + " " + lName +
                "\n" + "Phone Number: " + phoneNumber + "\n" + "Email_Id: " + emailId + "\n"
                + "State: " + state + "\n" + "City: " + city;
        return info;
    }
}
