import java.util.Scanner;

public class tugas1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah angka yang ingin dihitung (n): ");
        int n = sc.nextInt();
        int[] angka = new int[n];
        for (int i = n; i > 0; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            angka[i-1] = sc.nextInt();
        }

        System.out.println("Hasil penjumlahan dengan metode rekursif: " + sumRekursif(angka, n));
        System.out.println("Hasil penjumlahan dengan metode iteratif: " + sumIteratif(angka));
    }

    static int sumIteratif(int[] angka) {
        int sum = 0;
        for (int i : angka) {
            sum += i;
        }
        return sum;
    }

    static int sumRekursif(int[] angka, int n) {
        if (n == 1) {
            return angka[n-1];
        } else {
            return (angka[n-1] + sumRekursif(angka, n-1));
        }
    }
}
