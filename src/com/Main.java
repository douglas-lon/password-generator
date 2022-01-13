package com;

import com.utilities.Password;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Password pass = new Password();
        Scanner scan = new Scanner(System.in);
        boolean stopFirstWhile = false;
        boolean stopSecondWhile = false;

        int length;
        char choice;
        char upperCase;
        char number;
        char symbol;

        while (!stopFirstWhile){
            System.out.println("==================================================");
            System.out.println("Password Generator");
            System.out.println("==================================================");
            System.out.println("");

            System.out.print("Password length: ");
            length = scan.nextInt();
            System.out.println("");

            System.out.println("Do you want to choose the options? (Y/N)");
            choice = scan.next().charAt(0);
            choice = Character.toUpperCase(choice);
            System.out.println("");

            if (choice == 'Y'){

                System.out.print("Do you want UpperCase? (Y/N) ");
                upperCase = scan.next().charAt(0);
                upperCase = Character.toUpperCase(upperCase);
                System.out.println("");

                System.out.print("Do you want Numbers? (Y/N) ");
                number = scan.next().charAt(0);
                number = Character.toUpperCase(number);
                System.out.println("");

                System.out.print("Do you want Symbols? (Y/N) ");
                symbol = scan.next().charAt(0);
                symbol = Character.toUpperCase(symbol);
                System.out.println("");
            }
            else {

                upperCase = 'Y';
                number = 'Y';
                symbol = 'Y';
            }

            stopSecondWhile = false;
            while (!stopSecondWhile) {

                String password = pass.generator(length, (upperCase == 'Y'), (number == 'Y'), (symbol == 'Y'));
                System.out.println("==================================================");
                System.out.println("");
                System.out.println("Password: " + password);
                byte option = 0;

                System.out.println("");
                System.out.println("==================================================");
                System.out.println("1. Gerar outra senha.");
                System.out.println("2. Gerar outra senha com outros parâmetros.");
                System.out.println("3. Sair");
                System.out.println("==================================================");
                System.out.println("");

                System.out.print("Option: ");
                option = scan.nextByte();
                System.out.println("");
                
                switch (option) {

                    case 1:
                        break;

                    case 2:
                        stopSecondWhile = true;
                        break;

                    case 3:
                        stopSecondWhile = true;
                        stopFirstWhile = true;
                        break;
                        
                    default:
                        System.out.println("Type a valid option!");
                        System.out.println("");
                        break;
                }

            } //end second while
        } // end first while
        
        scan.close();
    } //end main method
}


