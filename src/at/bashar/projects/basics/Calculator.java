package at.bashar.projects.basics;
import java.util.Scanner;
public class Calculator {
    public static void addition(){
        System.out.println("Enter the 1. number: ");
        Scanner number1 = new Scanner(System.in);
        int add1 = number1.nextInt();

        System.out.println("Enter the 2. number: ");
        Scanner number2 = new Scanner(System.in);
        int add2 = number2.nextInt();

        int ergebnis = add1 + add2;
        System.out.println(ergebnis);
    }

    public static void subtraction(){
        System.out.println("Enter the 1. number: ");
        Scanner number1 = new Scanner(System.in);
        int subtract = number1.nextInt();

        System.out.println("Enter the 2. number: ");
        Scanner number2 = new Scanner(System.in);
        int subtract2 = number2.nextInt();

        int ergebnis = subtract - subtract2;
        System.out.println(ergebnis);
    }

    public static void multiplication(){
        System.out.println("Enter the 1. number: ");
        Scanner number1 = new Scanner(System.in);
        int multiple = number1.nextInt();

        System.out.println("Enter the 2. number: ");
        Scanner number2 = new Scanner(System.in);
        int multiple2 = number2.nextInt();

        int ergebnis = multiple * multiple2;
        System.out.println(ergebnis);

    }
    public static void division(){
        System.out.println("Enter the 1. number: ");
        Scanner number1 = new Scanner(System.in);
        int division = number1.nextInt();

        System.out.println("Enter the 2. number: ");
        Scanner number2 = new Scanner(System.in);
        int division2 = number2.nextInt();

        int ergebnis = division / division2;
        System.out.println(ergebnis);
    }


        public static void main(String[] args){

            System.out.println("welcome to the most basic calculator ever created");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Divison");
            System.out.println("5. Sqaure root");
            System.out.println("6. Sinus");
            System.out.println("7. Cosinus");

            while (true) {
                System.out.println("\n\n\n\n");
                Scanner input = new Scanner(System.in);
                String input1 = input.nextLine();
                if (input1.equals("1")) {
                    addition();
                } else if (input1.equals("2")) {
                    subtraction();
                } else if (input1.equals("3")){
                    multiplication();
                } else if (input1.equals("4")){
                    division();
                }
            }
        }}

