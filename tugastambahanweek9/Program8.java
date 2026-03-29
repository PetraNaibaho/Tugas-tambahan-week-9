package tugastambahanweek9;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("Umur: ");
        int umur = input.nextInt();

        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}
