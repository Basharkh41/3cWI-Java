package at.bashar.projects.basics;

import java.util.Arrays;
import java.util.Scanner;

public class Hangman {
    public static void main (String[] args) {
        int anzFehler = 0, maxFehler = 6;
        int gefunden = 0;
        String wort;
        Scanner sc = new Scanner(System.in);
        char[] loesung;
        char[] falsche = new char[maxFehler];

        Arrays.fill(falsche, '\255');
        System.out.println("Spieler 2: wegschauen!");
        System.out.print("Spieler 1: Wort eingeben: ");
        wort = sc.next().toUpperCase();
        for(int i = 0; i < 10; i++)
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        loesung = new char[wort.length()];
        Arrays.fill(loesung, '*');
        System.out.print("Spieler 2: Buchstaben raten:\n");
        while (anzFehler < maxFehler && gefunden < loesung.length) {
            System.out.println("Zu erratendes Wort: " + toString(loesung));
            if (anzFehler == 1)
                System.out.println("Nicht enthaltener Buchstabe: " + falsche[0]);
            else if (anzFehler > 1)
                System.out.println("Nicht enthaltene Buchstaben: " + toString(falsche));
            System.out.print("Neuen Buchstaben raten: ");
            char c = sc.next().toUpperCase().charAt(0);
            boolean enthalten = false;
            for (int i = 0; i < loesung.length; i++)
                if (wort.charAt(i) == c) {
                    enthalten = true;
                    loesung[i] = c;
                    gefunden++;
                }
            if (!enthalten && Arrays.binarySearch(falsche, c) < 0) {
                falsche[anzFehler++] = c;
                Arrays.sort(falsche);
            }
        }
        if (anzFehler == maxFehler)
            System.out.println("Verloren! Das Wort ist " + wort);
        else
            System.out.println("Gewonnen: Das Wort ist " + wort);
    }

    private static String toString(char[] chars) {
        String s = "";
        for(char c : chars)
            if(c != '\255')
                s = s + c;
        return s;
    }
}
