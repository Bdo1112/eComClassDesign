package com.eComm.user;

import com.eComm.misc.Address;
import com.eComm.misc.bankTransfer;
import com.eComm.misc.creditCard;

import java.util.List;

public class Account {
    private String userName;
    private String password;
    private String name;
    private Address address;
    private String email;
    private String phoneNumber;
    private List<creditCard> creditCardList;
    private List<bankTransfer> bankTransferList;

    public Account(String userName, String password, String name, Address address, String email, String phoneNumber){
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phone) {
        this.phoneNumber = phone;
    }




}
