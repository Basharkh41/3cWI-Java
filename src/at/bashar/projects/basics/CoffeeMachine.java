package at.bashar.projects.basics;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        int coffeesizeresult = 0;
        int coffeebeansstrengthresult = 0;
        int watersizeresult = 0;
        int beanssizeresult = 0;

        System.out.println("Hello and welcome to the digital coffee machine");

        System.out.println("How large should the coffee be? only between 40-200ml!");
        Scanner coffeesizescanner = new Scanner(System.in);
        int coffeesize = coffeesizescanner.nextInt();
        boolean invalid = coffeesize > 200;
        boolean invalid2 = coffeesize < 40;
        if (invalid || invalid2) {
            System.out.println("the size must be between 40 and 200ml");
            coffeesize = coffeesizescanner.nextInt();
        }
        coffeesizeresult = coffeesizeresult + coffeesize;



    System.out.println("how strong should it be? only between 1-10!");
    Scanner beansstrengthscanner = new Scanner(System.in);
    int beansstringth = beansstrengthscanner.nextInt();
    boolean invalid3 = beansstringth > 10;
    boolean invalid4 = beansstringth < 0;
    if (invalid3 || invalid4) {
        System.out.println("the strength must be between 1 and 10");
        beansstringth = beansstrengthscanner.nextInt();
    }
    coffeebeansstrengthresult = coffeebeansstrengthresult + beansstringth;






        System.out.println("1. do you want to refill water?");
        System.out.println("2. do you want to refill coffee beans?");
        System.out.println("3. your coffee is ready!");
        System.out.println("4. shut down");


        while (true) {

            Scanner inputscanner = new Scanner(System.in);
            String input = inputscanner.nextLine();

            if(input.equals("1")){
                System.out.println("how much water do you want to refill? must be between 1-1000 ml, you can also take 100ml water out of the tank at a time by entering a negative number");
                Scanner watersizescanner = new Scanner(System.in);
                int watersize = watersizescanner.nextInt();
                boolean invalid5 = watersize < -100;
                boolean invalid6 = watersize > 1000;
                if (invalid5 || invalid6){
                    System.out.println("error, please enter a valid size");
                    watersize = watersizescanner.nextInt();
                }
                System.out.println("the size of the water you've refilled is " + watersize);
                watersizeresult = watersizeresult + watersize;
            }

            else if(input.equals("2")){
                System.out.println("how much coffee beans do you want to refill? must be between 1-100, you can also take 10 beans out by entering a negative number");
                Scanner beanssizescanner = new Scanner(System.in);
                int beanssize = beanssizescanner.nextInt();
                boolean invalid7 = beanssize < -10;
                boolean invalid8 = beanssize > 100;
                if(invalid7 || invalid8){
                    System.out.println("error, enter a valid number");
                    beanssize = beanssizescanner.nextInt();
                }
                System.out.println("you've refilled " + beanssize + " beans");
                beanssizeresult = beanssizeresult + beanssize;
            }

            else if(input.equals("3")){
                System.out.println("your coffee is now ready!");
                System.out.println("the size of your coffee is: " + coffeesizeresult + " ml");
                System.out.println("the strength of your coffee is: " + coffeebeansstrengthresult);
                System.out.println("the size of the water you've refilled is: " + watersizeresult + " ml");
                System.out.println("the amount of beans you've refilled is: " + beanssizeresult);
            }

            else if(input.equals("4")){
                System.out.println("thank you for using our machine, goodbye!!");
                break;
            }

        }

    }
}
