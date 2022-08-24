package com.eComm.product;

import com.eComm.user.Account;

public class Product {

    private String productID;
    private String productName;
    private String description;
    private double price;
    private ProductCategory productCategory;
    private int itemStock;
    private Account seller;

    public Product(String productID, String productName, String description, double price, ProductCategory productCategory, int itemStock, Account seller) {
        this.productID = productID;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.productCategory = productCategory;
        this.itemStock = itemStock;
        this.seller = seller;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public int getItemStock() {
        return itemStock;
    }

    public void setItemStock(int itemStock) {
        this.itemStock = itemStock;
    }

    public Account getSeller() {
        return seller;
    }

    public void setSeller(Account seller) {
        this.seller = seller;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID='" + productID + '\'' +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", productCategory=" + productCategory +
                ", itemStock=" + itemStock +
                ", seller=" + seller +
                '}';
    }
}
