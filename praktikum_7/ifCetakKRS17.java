package praktikum_7;

import java.util.Scanner;

public class ifCetakKRS17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas: ");
        boolean uktLunas = sc.nextBoolean();

        // if (uktLunas) {
        //     System.out.println("Pembayaran UKT terverifikasi");
        //     System.out.println("Cetak KRS dan minta tanda tangan DPA");
        // } else {
        //     System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu”");
        // }

        System.out.println(uktLunas ? "Pembayaran UKT terverifikasi" : "Registrasi ditolak, silahkan lunasi ukt terlebih dahulu");
    }
}