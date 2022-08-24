package com.eComm.user;

import com.eComm.order.ShoppingCart;

public class Guest extends Customer {

    public boolean registerAccount(){
        return true;
    }

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
