package at.bashar.projects.basics;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args){

        Scanner Name = new Scanner(System.in);
        System.out.println("Enter your name please:");

        String userName = Name.nextLine();
        System.out.println("Guten Tag " + userName);

        System.out.println("    Selektieren Sie die gewünschte Funktion:");
        System.out.println("    1. Einzahlen");
        System.out.println("    2. Abheben");
        System.out.println("    3. Kontostand");
        System.out.println("    4. Ende");
        int Kontostand = 0;

        while(true){

            Scanner number = new Scanner(System.in);
            String choice = number.nextLine();
            if(choice.equals("1")){
                System.out.println("Geben Sie den Betrag ein, den Sie einzahlen möchten: ");
                Scanner number1 = new Scanner(System.in);
                int a = number1.nextInt();

                System.out.println("Sie haben " + a + " Euro eingezahlt!");
                Kontostand = Kontostand + a;

            }
            else if(choice.equals("2")){
                System.out.println("Wieviel würden Sie gerne abheben? ");
                Scanner number2 = new Scanner(System.in);
                int b = number2.nextInt();

                System.out.println("Sie haben " + b + " Euro abgehoben!");
                Kontostand= Kontostand - b;
            }
            else if(choice.equals("3")){
                System.out.println("Der Kontostand beträgt: " + Kontostand + " €");

            }
            else if (choice.equals("4")){
                System.out.println("Machine is stopping");
                break;
            }

        }
    }
}
