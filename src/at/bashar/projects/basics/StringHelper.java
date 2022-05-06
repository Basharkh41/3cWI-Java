package at.bashar.projects.basics;
import java.util.Scanner;

public class StringHelper {
        public static int isPalindrom() {
            String Palindrom, reverse = "";
            System.out.println("please enter your text here: ");
            Scanner Palindrominput = new Scanner(System.in);
            Palindrom = Palindrominput.nextLine();
            int length = Palindrom.length();

            for (int i = length - 1; i >= 0; i--) {
                reverse = reverse + Palindrom.charAt(i);
            }
            if (Palindrom.equals(reverse)) {
                System.out.println("Entered text is a palindrome.");
            } else {
                System.out.println("Entered text isn't a palindrome!");
            }
        return 0;
        }


        public static int countLetters(){
            System.out.println("please enter your text here:");
            Scanner countLettersInput = new Scanner(System.in);
            String countLettersString = countLettersInput.nextLine();
            int countLettersInt = countLettersInput.nextInt();
            for (int i = 0; i < countLettersString.length(); i++){
                if(Character.isLetter(countLettersString.charAt(i))){
                    countLettersInt++;
                }
                System.out.println("Letters: " + countLettersInt);
            }
        return 0;
        }
        public static int reverseString(){
            System.out.println("please enter your text here:");
            Scanner reverseStringInput = new Scanner(System.in);
            String reverseStringstring = reverseStringInput.nextLine();
            StringBuilder output = new StringBuilder(reverseStringstring);
            output.reverse();
            System.out.println("here is your reversed text: " + output);
            return 0;

        }

        public static int getAmountOfLetters(){
            System.out.println("please enter your text here:");
            Scanner getAmountOfLettersInput = new Scanner(System.in);
            String getAmountOfLettersstring = getAmountOfLettersInput.nextLine();
            if (getAmountOfLettersstring == null || getAmountOfLettersstring.isEmpty()){
                return 0;
            }
            String[] words = getAmountOfLettersstring.split("\\s+");
            return words.length;

        }

    public static void main(String[] args) {



        System.out.println("Please enter your name: ");
        Scanner a = new Scanner(System.in);
        String input = a.nextLine();

        System.out.println("Hallo " + input + " what do you want to do with your text?");
        System.out.println("\n");
        System.out.println("1. is my text a Palindrome?");
        System.out.println("2. how many letters does my text contain?");
        System.out.println("3. i want to reverse my text!");
        System.out.println("4. how many words does my text contain?");
        System.out.println("5. Stop the program");

        Scanner number = new Scanner(System.in);
        int choice = number.nextInt();
        String choice1 = number.nextLine();

        boolean valid = choice > 6;

        while(valid) {
            if (choice1.equals(1)) {
                isPalindrom();
            } else if (choice1.equals(2)) {
                countLetters();
            } else if (choice1.equals(3)) {
                reverseString();
            } else if (choice1.equals(4)) {
                getAmountOfLetters();
            } else if (choice1.equals(5)) {
                System.out.println("thanks for trying my program!");
                break;
            }
            }
        }

    }
