package praktikum_7;

import java.util.Scanner;

public class switchCetakKRS17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Masukkan semester saat ini: ");
        int smt = sc.nextInt();

        switch (smt) {
            case 1:
                System.out.println("KRS semeseter 1 ditampilkan");
                break;
            case 2:
                System.out.println("KRS semeseter 2 ditampilkan");
                break;
            case 3:
                System.out.println("KRS semeseter 3 ditampilkan");
                break;
            case 4:
                System.out.println("KRS semeseter 4 ditampilkan");
                break;
            case 5:
                System.out.println("KRS semeseter 5 ditampilkan");
                break;
            case 6:
                System.out.println("KRS semeseter 6 ditampilkan");
                break;
            case 7:
                System.out.println("KRS semeseter 7 ditampilkan");
                break;
            case 8:
                System.out.println("KRS semeseter 8 ditampilkan");
                break;
            default:
                System.out.println("Semseter tidak valid!");
                break;
        }
    }
}
