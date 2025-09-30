package tugas2;

import java.util.Scanner;

public class nomer2 {
    public static void main(String[] args) {
        int gajiPokok, tunjanganAnak, gajiBersih;
        byte jumlahAnak;
        double persentaseDanaPensiun = 0.05;

        Scanner sc = new Scanner(System.in);
        System.out.print("\nMasukkan gaji pokok = ");
        gajiPokok = sc.nextInt();
        System.out.print("Masukkan tunjangan anak = ");
        tunjanganAnak = sc.nextInt();
        System.out.print("Masukkan jumlah anak = ");
        jumlahAnak = sc.nextByte();

        gajiBersih = (int) (gajiPokok *(1-persentaseDanaPensiun)) + (jumlahAnak * tunjanganAnak);
        System.out.println("Gaji bersih = " + gajiBersih);
        sc.close();
    }
}
