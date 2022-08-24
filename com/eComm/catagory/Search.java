package com.eComm.catagory;

import com.eComm.order.Item;

import java.util.List;

public interface Search {
    public List<Item> searchItemByName(String name);
    public List<Item> searchItemByCategory(String category);
}
