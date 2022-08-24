package com.eComm.catagory;

import com.eComm.order.Item;

import java.util.HashMap;
import java.util.List;

public class ItemCatalog implements Search{

    HashMap<String, List<Item>> itemName;
    HashMap<String, List<Item>> itemCategories;

    @Override
    public List<Item> searchItemByName(String name) {
        return itemName.get(name);
    }

    @Override
    public List<Item> searchItemByCategory(String category) {
        return itemCategories.get(category);
    }


}
