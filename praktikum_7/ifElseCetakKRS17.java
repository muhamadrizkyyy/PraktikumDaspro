package praktikum_7;

import java.util.Scanner;

public class ifElseCetakKRS17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Masukkan semester saat ini: ");
        int smt = sc.nextInt();

        if (smt == 1) {
            System.out.println("KRS semeseter 1 ditampilkan");
        } else if (smt == 2) {
            System.out.println("KRS semeseter 2 ditampilkan");
        } else if (smt == 3) {
            System.out.println("KRS semeseter 3 ditampilkan");
        } else if (smt == 4) {
            System.out.println("KRS semeseter 4 ditampilkan");
        } else if (smt == 5) {
            System.out.println("KRS semeseter 5 ditampilkan");
        } else if (smt == 6) {
            System.out.println("KRS semeseter 6 ditampilkan");
        } else if (smt == 7) {
            System.out.println("KRS semeseter 7 ditampilkan");
        } else if (smt == 8) {
            System.out.println("KRS semeseter 8 ditampilkan");
        } else {
            System.out.println("Semseter tidak valid!");
        }
    }
}
