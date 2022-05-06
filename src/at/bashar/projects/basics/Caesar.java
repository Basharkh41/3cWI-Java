package at.bashar.projects.basics;

import java.util.Scanner;

public class Caesar {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Text bitte eingeben:");
        String text = input.nextLine();
        int offset = 2;


        char [] meinArray = text.toCharArray();
        char [] meinNeuesArray = verschluesseln(offset, meinArray);

        System.out.println("\nSo sieht der Text verschlüsselt aus:");

        for(int i = 0; i < meinNeuesArray.length; i++) {
            System.out.print(meinNeuesArray[i]);
        }
        input.close();

    }

    public static char[] verschluesseln(int offset, char[] charArray) {

        char[] cryptArray = new char[charArray.length];


        for (int i = 0; i < charArray.length; i++) {

            int verschiebung = (charArray[i] + offset)%128;

            cryptArray[i] = (char) (verschiebung);

        }
        return cryptArray;

    }
}
