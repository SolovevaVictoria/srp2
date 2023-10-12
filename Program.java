package ru.geekbrains.lesson6.srp2;

import java.util.Scanner;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {
        SaverOrder saverOrder = new SaverOrder();
        OrderConsoleScanner orderConsoleScanner = new OrderConsoleScanner();

        Order order = orderConsoleScanner.inputFromConsole();
        saverOrder.saveOrder(order, "file1", "json");
        saverOrder.saveOrder(order, "file2", "txt");
    }

}
