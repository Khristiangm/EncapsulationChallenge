package com.timbuchalka;

/**
 * Created by KH389659 on 29/09/2017.
 */
public class Printer {

    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean duplexPrinter;
    private static int sumPages;

    public Printer(int tonerLevel, boolean duplexPrinter) {

        if (tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {

            System.out.println("The Toner is out of ink");

        }

        this.duplexPrinter = duplexPrinter;
    }

    public void printing(int numberOfPages) {
        if (tonerLevel <= 0) {

            System.out.println("A impressora nao possui Tinta");

        } else if (!duplexPrinter) {
            sumPages += numberOfPages;
            this.numberOfPagesPrinted += numberOfPages;
            System.out.println("O total de paginas impressas na vida util desta impressora foram " + sumPages);
            System.out.println("Foram Impressas: " + numberOfPages + " Paginas frente/verso neste evento de Impressao");
            System.out.println("O Total de folhas Impressas ate entao foram: " + this.numberOfPagesPrinted + " Por nao possuir o sistema duplex printer");

        } else {
            sumPages += numberOfPages;
            this.numberOfPagesPrinted += numberOfPages / 2;
            System.out.println("O total de paginas impressas na vida util desta impressora foram " + sumPages);
            System.out.println("Foram Impressas: " + numberOfPages + " Paginas frente/verso neste evento de Impressao");
            System.out.println("O Total de folhas Impressas ate entao foram: " + this.numberOfPagesPrinted + " Por possuir o sistema duplex printer");


        }


    }

    public void fillUpTheToner(int fill) {

        if (tonerLevel == 100) {

            System.out.println("Repositorio de Tinta Lotado");

        } else if (tonerLevel + fill > 100) {

            System.out.println("A impressora Transbordou,voce colocou " + (tonerLevel + fill - 100) + " % a mais de Tinta Necessaria");

        } else {
            tonerLevel += fill;
            System.out.println("Foi abastecido " + fill + "%, e agora a impressora esta com um total de " + tonerLevel + "% de tinta");
        }
    }
}
