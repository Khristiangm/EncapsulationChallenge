package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);

        printer.printing(30);
        System.out.println("-----------------------------------------------------------------------------------------");
        printer.printing(30);

        System.out.println("-----------------------------------------------------------------------------------------");
        printer.printing(30);
        System.out.println("-----------------------------------------------------------------------------------------");
        printer.fillUpTheToner(60);


    }
}
