import java.util.Scanner;

public class nomer2 {
    public static void main(String[] args) {
        int biaya_ttp = 50000, trf_kwh = 1500;
        double ppn = 0.1, totTarif, kwh_digunakan, biaya_listrk;

        Scanner sc= new Scanner(System.in);
        System.out.print("Masukkan banyak kWh yang digunakan: ");
        kwh_digunakan = sc.nextDouble();

        biaya_listrk = trf_kwh * kwh_digunakan;
        totTarif = (biaya_listrk*ppn) + biaya_listrk + biaya_ttp;

        System.out.println("Nominal yang harus dibayar adalah = " + totTarif);
    }
}
