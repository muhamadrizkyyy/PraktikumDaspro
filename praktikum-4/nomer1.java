import java.util.Scanner;

public class nomer1 {
    public static void main(String[] args) {
        int biaya_mbl = 300000, biaya_spr = 200000, biaya_bensin = 1000;
        int totBiaya_mbl;
        byte lama_hari;
        double jarak, totBiaya_sopir, totBiaya, totBiaya_bensin;

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan lama hari menyewa: ");
        lama_hari = sc.nextByte();
        System.out.print("Masukkan jarak yang ditempuh: ");
        jarak = sc.nextDouble();

        totBiaya_mbl = lama_hari * biaya_mbl;
        totBiaya_sopir = lama_hari * biaya_spr;
        totBiaya_bensin = jarak * biaya_bensin;
        totBiaya = totBiaya_mbl + totBiaya_sopir + totBiaya_bensin;

        System.out.println("Total yang harus dibayar adalah = " + totBiaya);
    }
}
