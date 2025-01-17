import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj day: ");
        int b = 3;
        int c = 2;
        int day = input.nextInt();
        int numTries = 4;
                switch (day) {
                    case 1:
                        System.out.println(b + c);
                        break;
                    case 2:
                        System.out.println(b - c);
                        break;
                    case 3:
                        System.out.println(b * c);
                        break;
                    case 4:
                        System.out.println(b / c);
                        break;
                }

    }
}
