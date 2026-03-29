package tugastambahanweek9;

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hargaPerKg = 7000;

        System.out.print("Berat pakaian (kg): ");
        int berat = input.nextInt();

        int total = berat * hargaPerKg;

        System.out.println("Total biaya laundry: " + total);
    }
}