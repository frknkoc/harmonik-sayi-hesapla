import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number;
        double total = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen harmonik serisini hesaplamak istediğiniz sayıyı giriniz :");
        number = input.nextInt();

        for (int i = 1; i <= number; i++){
            total = total + (double) 1 / i;
        }
        System.out.println("Girdiğiniz " + number + " sayısının harmonik serisi sonucu : " + total);
    }
}