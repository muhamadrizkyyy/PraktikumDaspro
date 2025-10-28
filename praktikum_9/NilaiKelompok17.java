import java.util.Scanner;

public class NilaiKelompok17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int totalNilai, nilai, rataNilai = 0, nilaiTertinggi = 0, kelompokTertinggi = 0;
        while (i <= 5) {
            System.out.println("Kelompok " + i);

            totalNilai = 0;
            for (int j = 0; j < 5; j++) {
                System.out.print("Nilai dari kelompok penilai " + (j+1) + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;

            if (rataNilai > nilaiTertinggi) {
                nilaiTertinggi = rataNilai;
                kelompokTertinggi = i;
            }

            System.out.println("Kelompok " + i + " : Rata-rata nilai kelompok " + i + " adalah " + rataNilai);
            i++;
        }

        System.out.println("Kelompok dengan rata-rata nilai tertinggi adalah kelompok " + kelompokTertinggi + " dengan rata-rata nilai " + nilaiTertinggi);
    }
}
