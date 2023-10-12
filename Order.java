package ru.geekbrains.lesson6.srp2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Order {
    private String clientName;
    private String product;
    private int qnt;
    private double price;

    public Order(){
    }

    public Order(String clientName, String product, int qnt, double price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getQnt() {
        return qnt;
    }

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }
}
