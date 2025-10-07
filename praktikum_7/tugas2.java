package praktikum_7;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        int angka;

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }
    }
}
