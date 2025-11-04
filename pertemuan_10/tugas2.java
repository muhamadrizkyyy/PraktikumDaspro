import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();

        sc.nextLine();
        String[] namaMenu = new String[jumlahPesanan];
        int[] hargaMenu = new int[jumlahPesanan];
        int total = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("nama menu: ");
            namaMenu[i] = sc.nextLine();

            System.out.print("harga menu ke-" + (i + 1) + ": ");
            hargaMenu[i] = sc.nextInt();
            total += hargaMenu[i];

            sc.nextLine();
        }

        System.out.println();
        System.out.println("-----------------------");

        for(int i = 0; i < jumlahPesanan; i++) {
            System.out.println(namaMenu[i] + " " + hargaMenu[i]);
        }
        
        System.out.println("-----------------------");
        System.out.println("total: " + total);
    }
}
