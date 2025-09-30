import java.util.Scanner;

public class nomer4 {
    public static void main(String[] args) {
        int biaya_cetak = 200;
        int biaya_jilid = 20000;
        double beratHrd_cvr = 250, berat_pack = 300;
        double totBerat, biaya_ongkir, totBiaya;
        int jml_hal, totBiaya_cetak;

        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah halaman yang dicetak: ");
        jml_hal = sc.nextInt();

        totBiaya_cetak = jml_hal*biaya_cetak + biaya_jilid;
        totBerat = beratHrd_cvr + berat_pack + (jml_hal / 2) * 3;
        biaya_ongkir = 15000 * (totBerat/1000);
        System.out.println(biaya_ongkir);
        totBiaya = totBiaya_cetak + biaya_ongkir;

        System.out.println("Total biaya cetak dan ongkir adalah " + totBiaya);
    }
}
