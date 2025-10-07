package praktikum_7;

import java.util.Scanner;

public class nestedUjianSkripsi17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;

        System.out.print("Apakah kamu sudah bebas kompen? (iya/tidak): ");
        String bebasKompen = sc.nextLine().trim();

        System.out.print("Masukkan jumlah log bimbingan pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukkan jumlah log bimbingan pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua persyaratan terpenuhi. Mahasiswa boleh mengikuti ujian";
            } else if(bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = "Gagal! log bimbingan P1 kurang dari 8 dan bimbingna P2 kurang dari 4";
            } else if (bimbinganP1 < 8) {
                pesan = "Gagal! log bimbingan P1 kurang dari 8";
            } else {
                pesan = "Gagal! log bimbingan P2 kurang dari 4";
            }
        } else {
            pesan = "Mahasiswa punya tanggungan kompen";
        }

        System.out.println(pesan);
    }
}
