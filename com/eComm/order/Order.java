package com.eComm.order;

import com.eComm.misc.OrderStatus;

import java.util.Date;

public class Order {
    private String orderID;
    private OrderStatus order;
    private Date data;
    private OrderLog orderLog;

    public Order(String orderID, OrderStatus order, Date data, OrderLog orderLog) {
        this.orderID = orderID;
        this.order = order;
        this.data = data;
        this.orderLog = orderLog;
    }

    public String getOrderID() {
        return orderID;
    }

    public OrderStatus getOrder() {
        return order;
    }

    public Date getData() {
        return data;
    }

    public OrderLog getOrderLog() {
        return orderLog;
    }

}
