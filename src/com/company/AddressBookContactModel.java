package com.company;

public class AddressBookContactModel {
    private String firstName = " ";
    private String lastName = " ";
    private String address = " ";
    private String city = " ";
    private String state = " ";
    private int zip = 0;
    private long phoneNumber = 0;
    private String email = " ";

    public AddressBookContactModel(String firstName, String lastName, String address, String city, String state,
                                   int zip, long phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNo) {
        this.phoneNumber = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayAddressBook() {
        System.out.println(" ");
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name : " + lastName);
        System.out.println("Address : " + address);
        System.out.println("City Name : " + city);
        System.out.println("Email : " + state);
        System.out.println("Zip Code : " + zip);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Email : " + email);
    }

}
