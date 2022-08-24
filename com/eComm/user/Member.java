package com.eComm.user;

import com.eComm.order.ShoppingCart;

public class Member extends Customer{

    private Account account;

    @Override
    public ShoppingCart getShoppingCart() {
        return null;
    }

    @Override
    public boolean addItemToCart() {
        return false;
    }

    @Override
    public boolean removeItemFromCart() {
        return false;
    }
}
