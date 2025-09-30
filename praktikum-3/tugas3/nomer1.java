package tugas3;

import java.util.Scanner;

public class nomer1 {
    public static void main(String[] args) {
        int harga, uangMuka, lamaCicilan, jml_cicilan, sisaCicilan;
        double bunga = 0.01, bungaCicilan, totCicilan;

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan harga barang: ");
        harga = sc.nextInt();

        System.out.print("Masukkan uang muka: ");
        uangMuka = sc.nextInt();

        System.out.print("Masukkan lama cicilan: ");
        lamaCicilan = sc.nextInt();

        sisaCicilan = harga - uangMuka;
        bungaCicilan = sisaCicilan *bunga;
        totCicilan = sisaCicilan + bungaCicilan;
        jml_cicilan = (int) (totCicilan / lamaCicilan);

        System.out.println("Jumlah cicilan: " + jml_cicilan);
        sc.close();
    }
}
