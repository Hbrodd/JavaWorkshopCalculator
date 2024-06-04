package se.lexicon;
import java.util.Scanner;
/**
 * Hello world!
 *
 */

public class App
{
    public static void main( String[] args ) {
        System.out.println("Hello World!");
        Scanner input = new Scanner(System.in);
        System.out.println("Write two number you want to either add or subtract or multiplay or ");
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        int resultat = 0;
        int numberThree = 0;

        while (true) {
            if (numberTwo == 0){
                System.out.println("You can't have a zero as the second write a new number");
                numberTwo = input.nextInt();
            }
            System.out.println("Write 1:If you want to add 2: If you want to subtract 3:If you want to multiply 4: If you want to divide or 5 if you want to exit the program");
            byte val = input.nextByte();
            if (val > 0 & val <= 5 & numberThree == 0) {
                switch (val) {
                    case 1:
                        resultat = numberOne + numberTwo;
                        break;
                    case 2:
                        resultat = numberOne - numberTwo;
                        break;
                    case 3:
                        resultat = numberOne * numberTwo;
                        break;
                    case 4:
                        resultat = numberOne / numberTwo;
                    case 5:
                        System.exit(0);
                        break;
                }
            }else if (val > 0 & val <= 5){
                    switch (val) {
                        case 1:
                            resultat = resultat + numberThree;
                            break;
                        case 2:
                            resultat = resultat - numberThree;
                            break;
                        case 3:
                            resultat = resultat * numberThree;
                            break;
                        case 4:
                            resultat = resultat / numberThree;
                            break;
                        case 5:
                            System.exit(0);
                            break;
                }
            }
            System.out.println(resultat);
            System.out.println("Write another number if you want to 1:If you want to add 2: If you want to subtract 3:If you want to multiply 4: If you want to divide or 5 if you want to exit the program\"");
            numberThree = input.nextInt();

        }


    }        }