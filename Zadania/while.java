import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int count = input.nextInt();
        input.close();

        boolean done = false;

        while (!done) {
            try {
                int number = input.nextInt();
                if (number < 1) {
                    System.out.println("podana liczba powina być większa od zera");
                    done = true;
                }
                for (int i = 1; i <= number; i++) {
                    for (int j = 1; j <= number; j++) {
                        if (i < 10) {
                            System.out.println(j + ", ");
                        } else {
                            System.out.println(j);
                        }
                    }
                    System.out.println(" ");
                }
            } catch (InputMismatchException expection) {
                System.out.println("źle");

            }
        }
    }
