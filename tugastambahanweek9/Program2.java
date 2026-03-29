package tugastambahanweek9;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nilai 1: ");
        double n1 = input.nextDouble();
        System.out.print("Nilai 2: ");
        double n2 = input.nextDouble();
        System.out.print("Nilai 3: ");
        double n3 = input.nextDouble();

        double rata = (n1 + n2 + n3) / 3;

        System.out.println("Rata-rata: " + rata);
    }
}