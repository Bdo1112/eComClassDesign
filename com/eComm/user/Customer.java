package com.eComm.user;

import com.eComm.order.Order;
import com.eComm.order.ShoppingCart;

public abstract class Customer {
    private ShoppingCart shoppingCart;
    private Order order;

    public abstract ShoppingCart getShoppingCart();
    public abstract boolean addItemToCart();
    public abstract boolean removeItemFromCart();



}
