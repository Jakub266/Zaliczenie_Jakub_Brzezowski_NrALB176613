import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wysokość twoich zarobków:");
        double many = input.nextInt();

            if (many >= 85.528){
                double procenty = (many + 18) / 100;
                double y = many - procenty - 556.02;
                System.out.println(y);
            }
            else if (many <= 85.528) {
                double procentx = (many + 32) / 100;
                double x = many - 14.839 + procentx;
                System.out.println(x);
        }
    }
}
