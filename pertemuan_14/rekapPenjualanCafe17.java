import java.util.Scanner;

public class rekapPenjualanCafe17 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah menu tersedia : ");
        int jmlMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari : ");
        int jmlHari = sc.nextInt();
        System.out.println("============================================");

        int[][] dp = salesInput(jmlMenu, jmlHari);

        System.out.println("============================================");
        showData(dp);
        System.out.println("============================================");
        favoriteMenu(dp);
        System.out.println("============================================");
        showAverage(dp);
        System.out.println("============================================");
    }

    static int[][] salesInput(int m, int n) {
        int[][] dataPenjualan = new int[m][n];

        for (int i = 0; i < dataPenjualan.length; i++) {
            System.out.println("Menu ke-" + (i + 1));
            System.out.println("------------------------------------------");
            for (int j = 0; j < dataPenjualan[i].length; j++) {
                System.out.print("Masukkan jumlah penjualan hari ke-" + (j+ 1) + " : ");
                dataPenjualan[i][j] = sc.nextInt();
            }
            System.out.println("============================================");
        }

        return dataPenjualan;
    }

    static void showData(int[][] dataPenjualan) {

        System.out.print("          \t");
        for (int i = 0; i < dataPenjualan[0].length; i++) {
            System.out.print("Hari " + (i + 1) + "\t");
        }

        System.out.println();

        for (int i = 0; i < dataPenjualan.length; i++) {
            System.out.print("Menu ke-" + (i + 1) + " \t");
            for (int j = 0; j < dataPenjualan[i].length; j++) {
                System.out.print(dataPenjualan[i][j] + " \t");
            }
            System.out.println();
        }
    }

    static void favoriteMenu(int[][] dataPenjualan) {
        int totalMax = 0;
        int favoriteMenu = 0;

        for (int i = 0; i < dataPenjualan.length; i++) {
            int sum = 0;
            for (int j = 0; j < dataPenjualan[i].length; j++) {
                sum += dataPenjualan[i][j];
            }

            // pengecekan menu dengan penjualan tertinggi selama hari ke- n
            if (sum > totalMax) {
                totalMax = sum;
                favoriteMenu = i;
            }
        }

        System.out.println("Menu terlaris adalah menu ke-" + (favoriteMenu + 1) + " dengan total penjualan " + totalMax + " porsi");
    }

    static void showAverage(int[][] dataPenjualan) {
        for (int i = 0; i < dataPenjualan.length; i++) {
            int sum = 0;
            for (int j = 0; j < dataPenjualan[i].length; j++) {
                sum += dataPenjualan[i][j];
            }
            int avg = sum / dataPenjualan[i].length;

            System.out.println("Rata-rata penjualan menu ke-" + (i + 1) + " adalah " + avg + " porsi per harinya");
        }
    }
}
