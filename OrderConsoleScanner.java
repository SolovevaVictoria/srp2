package ru.geekbrains.lesson6.srp2;

import java.util.Scanner;

public class OrderConsoleScanner {
    private Scanner scanner = new Scanner(System.in);

    private String prompt(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }
    public Order inputFromConsole(){
        String clientName = this.prompt("Client name: ");
        String product = this.prompt("Product: ");
        Integer qnt = Integer.parseInt(this.prompt("Quantity: "));
        Double price = Double.parseDouble(this.prompt("Price: "));
        Order order = new Order(clientName, product, qnt, price);
        return order;
    }
}
