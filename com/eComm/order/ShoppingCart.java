package com.eComm.order;

import java.util.List;

public class ShoppingCart {
    private List<Item> productInCart;

    public boolean addItem(Item item){
        return true;
    }

    public boolean removeItem(Item item){
        return true;
    }

    public boolean changeQwt(Item item, int quantity){
        return true;
    }

    public List<Item> getItemList(){
        return null;
    }

    public boolean checkOut(){
        return true;
    }

}
