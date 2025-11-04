import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlMhs;

        System.out.print("Masukkan jumlah mahasiswa : ");
        jmlMhs = sc.nextInt();
        int[] nilaiMhs = new int[jmlMhs];
        double total = 0, rata2, nilaiTertinggi = 0, nilaiTerendah = 100;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " + (i+1) +" : ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];

            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            } else if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }

        rata2 = total / nilaiMhs.length;
        System.out.println("Nilai tertinggi adalah : " + nilaiTertinggi);
        System.out.println("Nilai terendah adalah : "+ nilaiTerendah);
        System.out.println("Rata-rata nilai mahasiswa adalah : " + rata2);

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai mahasiswa ke- " + (i+1) + " adalah : " + nilaiMhs[i]);
        }
    }
}
