package com.Iocwithxml;

public class Laptop {

    private int price ;
    private String company;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "price=" + price +
                ", company='" + company + '\'' +
                '}';
    }


}
