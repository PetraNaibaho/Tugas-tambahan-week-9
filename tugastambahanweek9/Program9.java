package tugastambahanweek9;

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Harga barang: ");
        int harga = input.nextInt();

        System.out.print("Jumlah: ");
        int jumlah = input.nextInt();

        int total = harga * jumlah;

        System.out.println("Total bayar: " + total);
    }
}