import java.util.Scanner;

public class SIAKADFor17 {
    public static void main(String[] args) {
        double nilai, terendah =100, tertinggi = 0;
        int jml_mhs_lulus = 0, jml_mhs_tdkLulus = 0;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i +" : ");
            nilai = sc.nextDouble();
            
            if (nilai > tertinggi) {
                tertinggi = nilai;
            } else if(nilai < terendah) {
                terendah = nilai;
            }

            if (nilai < 60) {
                jml_mhs_tdkLulus++;
            } else {
                jml_mhs_lulus++;
            }
        }

        System.out.println("Nilai tertinggi adalah " + tertinggi);
        System.out.println("Nilai terendah adalah " + terendah);
        System.out.println("Jumlah mahasiswa yang lulus adalah " + jml_mhs_lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus adalah " + jml_mhs_tdkLulus);
    }
}