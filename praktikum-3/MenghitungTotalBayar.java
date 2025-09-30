import java.util.Scanner;

public class MenghitungTotalBayar {
    public static void main(String[] args) {
        double harga;
        double potongan, jml_bayar, diskon = 0.15;

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Harga Barang : ");
        harga = sc.nextInt();
        potongan = diskon * harga;
        jml_bayar = harga - potongan;
        System.out.println("Potongan : " + potongan);
        System.out.println("Jumlah Bayar : " + jml_bayar);
        sc.close();
    }
}
