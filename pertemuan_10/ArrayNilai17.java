import java.util.Scanner;

public class ArrayNilai17 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai ke- " + i +" : ");
            nilaiAkhir[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Nilai ke- "+i+" adalah " + nilaiAkhir[i]);
            }
        }
    }
}
