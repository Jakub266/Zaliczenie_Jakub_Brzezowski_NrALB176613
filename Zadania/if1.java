import java.util.InputMismatchException;
import java.util.Scanner;

import org.jcp.xml.dsig.internal.dom.Utils;

public class Main {
    public static void main(String[] args) {

        int numberone = Utils.inputInt("Pierwsza liczba");
        int numbertwo = Utils.inputInt("druga liczba");
        int numbertre = Utils.inputInt("trzecia liczba");

        int max;
        int min;

        if (numberone > numbertwo && numberone > numbertre){
            max = numberone;
        }else if (numbertwo > numberone && numbertwo > numbertre){
            max = numbertwo;
        } else{
            max = numbertre;
        }

        if (numberone < numbertwo && numberone < numbertre){
            min = numberone;
        }else if (numbertwo < numberone && numbertwo < numbertre){
            min = numbertwo;
        } else{
            min = numbertre;
        }
        System.out.println("Najwuększa liczba" + " " + max);
        System.out.println("Najwuększa liczba" + " " + min);
            }
            static double inputInt(String message) {
                try {
                    System.out.println(message);
                    Scanner scanner = new Scanner(System.in);
                    return scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Podano złą liczbę");
                    System.out.inputInt(message);
                }
                return 0;
        }
