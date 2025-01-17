import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczby");
        int numberone = input.nextInt();
        int numbertwo = input.nextInt();
        int numbertre = input.nextInt();

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
        }
