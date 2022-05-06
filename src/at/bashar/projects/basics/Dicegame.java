package at.bashar.projects.basics;

import java.util.Random;
import java.util.Scanner;

public class Dicegame {
    public static void main(String[] args) {

        System.out.println("Enter the Dice Number, it must be between 1 and 6: ");
        Scanner DiceNumber = new Scanner(System.in);
        int DiceNumberint = DiceNumber.nextInt();

        boolean invalid = DiceNumberint > 6;
        if(invalid){
            System.out.println("invalid");
            System.out.println("Enter a valid number please: ");
            DiceNumberint = DiceNumber.nextInt();
        }



        System.out.println("You entered " + DiceNumberint + " rounds");




        Random ranNumber = new Random();
        Random ranNumbercmptr = new Random();
        int totalUser = 0;
        int totalCpmtr = 0;
        int randomNumberUser = 0;
        int randomNumbercmptr = 0;



        for (int i = 0; i < DiceNumberint; i++) {
            randomNumberUser = ranNumber.nextInt(6) + 1;
            totalUser = totalUser + randomNumberUser;

            System.out.print(" ");

            randomNumbercmptr = ranNumbercmptr.nextInt(6) + 1;
            totalCpmtr = totalCpmtr + randomNumbercmptr;

            System.out.print(" ");
        }

        System.out.println("");
        System.out.println("your Total: " + totalUser);
        DiceNumber.close();

        System.out.println("");
        System.out.println("Computer's Total: " + totalCpmtr);
        DiceNumber.close();

        }
    }
