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
    }
}
