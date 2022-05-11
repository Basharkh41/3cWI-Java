package at.bashar.projects.basics;
import java.util.Arrays;
import java.util.Scanner;

public class StringHelper {

    public static void CountHowManyWords(){
        System.out.println("please enter a text to see how many letters your text have: ");
        Scanner input = new Scanner(System.in);
        String i = input.nextLine();
        System.out.println("Excluding white spaces "+ i.replaceAll(" ", "").length());
    }
    public static void isPalindrome(){
        System.out.println("please enter a text to see if your text/word is a palindrome:");
        Scanner input = new Scanner(System.in);
        String i = input.nextLine();
        if(i.charAt(0)==i.charAt(i.length()-1)) {
            System.out.println("it is indeed a palindrome");
        }else{
            System.out.println("it is not a palindrome");
        }
    }

    static void CountWords(){
        System.out.println("please enter a text to see how many words your text have: ");
        Scanner input = new Scanner(System.in);
        String i = input.nextLine();
        String[] words = i.split("\\s+");
        System.out.println(words.length);
    }
    static void ReverseString(){
        System.out.println("please enter a text to reverse it:");
        Scanner input = new Scanner(System.in);
        String i = input.nextLine();
        String words[]=i.split("\\s");
        String reverseWord = "";
        for(String w:words){
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseWord+=sb.toString()+" ";
        }
        System.out.println(reverseWord);
    }

    
    public static void main(String[] args) {


        System.out.println("Please enter your name: ");
        Scanner a = new Scanner(System.in);
        String input = a.nextLine();

        System.out.println("Hallo " + input +" what do you want to do with your text?");
        System.out.println("\n");
        System.out.println("1. is my text a Palindrome?");
        System.out.println("2. how many letters does my text contain?");
        System.out.println("3. i want to reverse my text!");
        System.out.println("4. how many words does my text contain?");
        System.out.println("5. Stop the program");


        while(true) {
            Scanner c = new Scanner(System.in);
            String cc = c.nextLine();
        if(cc.equals("1")){
            isPalindrome();
        }
        else if(cc.equals("2")){
            CountHowManyWords();
        }
        else if(cc.equals("3")){
            ReverseString();
        }
        else if(cc.equals("4")){
            CountWords();
        }
        else if(cc.equals("5")){
            System.out.println("thanks for using this program!");
            break;
        }
        else{
            System.out.println("enter a valid number please");
        }
        }

        



    }
}
