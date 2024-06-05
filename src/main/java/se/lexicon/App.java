package se.lexicon;
import java.util.Scanner;
/**
 * Hello world!
 *
 */

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Write two number you want to either add or subtract or multiply or divide");
            int numberOne = getnumber();
            int numberTwo = getnumber();
            displayMeny();
            byte val = input.nextByte();
            if (val == 5){
                System.out.println("Exit the program ");
                break;
            }
            int result = operations(val, numberOne, numberTwo);
            System.out.println("Your result is " + result);
        }while (true);
    }

    public static void displayMeny() {
        System.out.println("Select Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.println("Enter your choice: ");
    }

    public static int getnumber() {
        Scanner input = new Scanner(System.in);
        int numb = input.nextInt();
        return numb;
    }

    public static int operations(byte val, int num1, int num2) {
        int resultat = 0;
        switch (val) {
            case 1:
                resultat = num1 + num2;
                break;
            case 2:
                resultat = num1 - num2;
                break;
            case 3:
                resultat = num1 * num2;
                break;
            case 4:
                resultat = num1 / num2;
            default:
                System.out.println("Invalid choice");
        }
        return resultat;
    }
}