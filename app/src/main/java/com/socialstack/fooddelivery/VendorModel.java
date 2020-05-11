package com.socialstack.fooddelivery;

public class VendorModel {
    private String items,address;
    private long orderid;
    private long amount,code;

    public VendorModel(long orderid, String items, long amount, long code,String address) {
        this.orderid = orderid;
        this.items = items;
        this.amount = amount;
        this.code = code;
        this.address = address;
    }

    public VendorModel() {
    }


    public long getOrderid() {
        return orderid;
    }

    public void setOrderid(long orderid) {
        this.orderid = orderid;
    }

    public String getItems() {
        return items;
    }

    public String getAddress() {
        return address;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }
}
