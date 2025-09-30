import java.util.Scanner;

public class nomer3 {
    public static void main(String[] args) {
        int biaya_publ = 300000;
        int biaya_deko = 300000;
        int kons_panitia_juri = 500000;
        int hadiah = 400000;
        int biaya_ops = 500000;
        int kons_peserta = 25000;
        int biaya_regis = 50000;
        int honor_juri = 75000;
        double dana_poltek = 0.6, sisa_biaya;

        int banyak_tim,totAnggaran, totKons_peserta, totHonor_juri, totBiaya_regis;

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyak tim mendaftar: ");
        banyak_tim = sc.nextInt();

        totKons_peserta = banyak_tim * kons_peserta * 3;
        totHonor_juri = banyak_tim * honor_juri;
        totBiaya_regis = banyak_tim * biaya_regis;
        totAnggaran = biaya_deko + biaya_ops + biaya_publ + kons_panitia_juri + hadiah + totKons_peserta + totHonor_juri;

        System.out.println(totBiaya_regis);
        sisa_biaya = totAnggaran - (totAnggaran * dana_poltek) - totBiaya_regis;
        System.out.println("Biaya yang berasal dari sponsor = " + sisa_biaya);
    }
}
