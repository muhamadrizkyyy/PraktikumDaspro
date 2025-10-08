package praktikum_7;

import java.util.Scanner;

public class tugas3_1 {
    public static void main(String[] args) {
        int idc;
        boolean isRegist;

        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan id card mahasiswa: ");
        idc = sc.nextInt();
        System.out.print("apakah sudah registrasi online? (true/false): ");
        isRegist = sc.nextBoolean();

        if (idc != 0 || isRegist) {
            System.out.println("selamat datang!");
        } else {
            System.out.println("akses ditolak!");
        }

    }
}
