package tugas3;
/*
 * input : double jarak, int biaya_bensin, double totBensinDigunakan,
 * output : biaya_bensin
 * data lain : harga = 10000
 */

import java.util.Scanner;

public class nomer2 {
    public static void main(String[] args) {
        int harga = 10000, biaya_bensin;
        double jarak, totBensinDigunakan;

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jarak : ");
        jarak = sc.nextDouble();
        
        totBensinDigunakan = jarak / 2;
        biaya_bensin = (int) (totBensinDigunakan * harga);

        System.out.println("Biaya bensin yang harus dibayar : " + biaya_bensin);
        sc.close();
    }
}
