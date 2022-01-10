package com.company;

import Repository.Kontroller;

import java.util.Scanner;

public class ConsoleView {

    private final Scanner keyboard = new Scanner(System.in);

    public ConsoleView(){
    }

    public void clearScreen() {
        for (int i = 1; i <= 10; i++)
            System.out.println();
    }

    public void UI() {
        Kontroller kontroller=new Kontroller();
        while (true) {
            clearScreen();
            System.out.println("Insert number");
            System.out.println("1.Add Product");
            System.out.println("2.Show Products");
            System.out.println("3.Delete Product");
            System.out.println("4.Update Product");
            System.out.println("5.Add Order");
            System.out.println("6.Show Order");
            System.out.println("7.Delete Order");
            System.out.println("8.Update Order");
            System.out.println("0.Exit");
            int input = keyboard.nextInt();
            clearScreen();
            if (input == 1) {
                System.out.println("Name:");
                String name= keyboard.nextLine();
                System.out.println("Preis:");
                int preis= keyboard.nextInt();
                kontroller.addProdukt(name,preis);
            } else if (input == 2) {
                kontroller.printProdukte();
            } else if (input == 3) {
                System.out.println("Name:");
                String name= keyboard.nextLine();
                kontroller.deleteProdukt(name);
            }
        }
    }
}
