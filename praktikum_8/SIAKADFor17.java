import java.util.Scanner;

public class SIAKADFor17 {
    public static void main(String[] args) {
        double nilai, terendah =100, tertinggi = 0;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i +" : ");
            nilai = sc.nextDouble();
            
            if (nilai > tertinggi) {
                tertinggi = nilai;
            } else if(nilai < terendah) {
                terendah = nilai;
            }
        }

        System.out.println("Nilai tertinggi adalah " + tertinggi);
        System.out.println("Nilai terendah adalah " + terendah);
    }
}