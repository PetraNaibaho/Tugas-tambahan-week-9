package tugastambahanweek9;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi: ");
        int sisi = input.nextInt();

        int luas = sisi * sisi;

        System.out.println("Luas persegi: " + luas);
    }
}