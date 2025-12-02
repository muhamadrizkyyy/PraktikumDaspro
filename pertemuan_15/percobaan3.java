import java.util.Scanner;

public class percobaan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan saldo awal: ");
        double SaldoAwal = sc.nextDouble();
        System.out.print("Masukkan tahun: ");
        int tahun = sc.nextInt();
        System.out.println("Saldo setelah " + tahun + " tahun: " + hitungLaba(SaldoAwal, tahun));
    }

    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return saldo;
        } else {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }
}
