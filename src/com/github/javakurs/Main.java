package com.github.javakurs;

/**
 * Hauptklasse für das Einstiegsprojekt: Einfacher Taschenrechner
 * <p>
 * In dieser Klasse sollen die Übungen 01 - 05 implementiert werden.
 * Bei den weiteren Übungen werden neue Klassen angelegt und das Projekt entwickelt und verändert sich im Verlauf
 * des Kurses immer weiter
 */
public class Main { //Deklaration der Klasse

    public static void main(String[] args) { //Deklaration der Methode(Methodensignatur)
        System.out.println("Hello World"); //Was die Methode macht

        String x; //Variablendeklaration(Typ=String "x"(Name))
        x = "Hello World"; //Wertzuweisung der Var. (Initialisierung)
        System.out.println(x);

        String hello = "Hello";
        String world = "World";
        String helloWorld = hello + " " + world;
        System.out.println(helloWorld);

        int wert0 = 0;
        System.out.println(wert0);
        String helloWorldLeetSpeak = "hell" + wert0 + "W" + wert0 + "rldLeetSpeak";
        System.out.println(helloWorldLeetSpeak);

        int add1 = 2;
        int add2 = 5;
        System.out.println(add1 + add2);

        int div1 = 1;
        int div2 = 3;
        System.out.println(div1 / div2);

        double doublediv1 = 1;
        double doublediv2 = 3;
        System.out.println(doublediv1 / doublediv2);

        int intergebnis = 1 / 3;
        System.out.println(intergebnis);

        double doubleergebnis = 1.0 / 3.0;
        System.out.println(doubleergebnis);

        boolean wahrheit = 1 < 3;
        System.out.println(wahrheit);

        int[] array10 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(array10[6]); //Ausgabe des 7. Wertes des 10Stelligen Arrays

        int tooMuch = (int) 4294967295L;
        System.out.println(tooMuch);

        //HelloWorld Schleife

        for (int counter = 1; counter <= 10; counter = counter + 1)
            System.out.println("Hello World");

        int ergebnissumme = 0;
        for (int countersumme = 1; countersumme <= 10; countersumme += 1) {
            ergebnissumme += countersumme;
        }
        System.out.println(ergebnissumme);

        int ergebnissummewhile = 0;
        int countersummewhile = 1;
        while (countersummewhile <= 10) {
            ergebnissummewhile += countersummewhile;
            countersummewhile++;
        }
        System.out.println(ergebnissummewhile);

        int[] arrayschleifen10 = new int[10];
        for (int counterarrayschleife = 0; counterarrayschleife < 10; counterarrayschleife += 1) {
            arrayschleifen10[counterarrayschleife] = counterarrayschleife + 1;
        }

        for (int counterausgabearray = 0; counterausgabearray <= arrayschleifen10.length - 1; counterausgabearray += 1) {
            System.out.print(arrayschleifen10[counterausgabearray] + ",");
        }
    }
}
