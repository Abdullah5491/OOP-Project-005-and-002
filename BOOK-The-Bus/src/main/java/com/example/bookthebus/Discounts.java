package com.example.bookthebus;

public class Discounts {
    private String DiscountCode;
    private double DiscountPercentage;


    public Discounts(String discountCode, double discountPercentage) {
        DiscountCode = discountCode;
        DiscountPercentage = discountPercentage;
    }

    public String getDiscountCode() {
        return DiscountCode;
    }

    public void setDiscountCode(String discountCode) {
        DiscountCode = discountCode;
    }

    public double getDiscountPercentage() {
        return DiscountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        DiscountPercentage = discountPercentage;
    }

}


