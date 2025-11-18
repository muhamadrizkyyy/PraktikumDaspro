import java.util.Scanner;

public class kuis2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hasilDonasi[][]= new int[3][3];
        int wilayahDonasiTerbesar = 0;
        double totalDonasi = 0;

        // Memasukkan jumlah donasi per kategori dan wilayah
        for (int i = 0; i < hasilDonasi.length; i++) {
            System.out.println("Wilayah ke-" + (i+1));
            for (int j = 0; j < hasilDonasi[i].length; j++) {
                System.out.print("Masukkan jumlah donasi kategori ke-" + (j+1) + " : ");
                hasilDonasi[i][j] = sc.nextInt();
                totalDonasi += hasilDonasi[i][j];
            }           
        }

        System.out.println("=============================");
        System.out.println("Total donasi yang diterima");

        // Menghitung total donasi per wilayah dan 
        for (int i = 0; i < hasilDonasi.length; i++) {
            int totalDonasiWilayah = 0;
            int donasiTerbesar = 0;
            for (int j = 0; j < hasilDonasi[i].length; j++) {
                totalDonasiWilayah += hasilDonasi[i][j];
            }

            if (totalDonasiWilayah > donasiTerbesar) {
                wilayahDonasiTerbesar = i;
            }

            System.out.println("Total donasi wilayah ke-" + (i+1) + " adalah " + totalDonasiWilayah);
        }
        System.out.println("=============================");
        System.out.println("Wilayah dengan donasi terbesar adalah wilayah ke-" + (wilayahDonasiTerbesar+1));
        System.out.println("=============================");

        System.out.println();

        System.out.println("=============================================");
        System.out.println("Persentase donasi yang terkumpul per kategori");
        System.out.println("=============================================");
        for (int i = 0; i < hasilDonasi.length; i++) {
            double totalDonasiPerKategori = 0;
            for (int j = 0; j < hasilDonasi[i].length; j++) {
                totalDonasiPerKategori += hasilDonasi[j][i];
            }
            System.out.println("Persentase kategori ke-" + (i+1) + " adalah " + (totalDonasiPerKategori/totalDonasi)*100 + "% > (" + totalDonasiPerKategori + ")");
        }
    }
}