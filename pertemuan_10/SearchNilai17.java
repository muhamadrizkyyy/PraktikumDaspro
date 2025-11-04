import java.util.Scanner;

public class SearchNilai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();

        int[] nilai = new int[jmlMhs];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
        
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();
        int hasil = 0;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                hasil = i;

                System.out.println();
                System.out.println("Nilai " + key + " ditemukan yang merupakan nilai mahasiswa ke-" + hasil);
                System.out.println();
                break;
            } else {
                System.out.println();
                System.out.println("Nilai yang dicari tidak ditemukan!");
                System.out.println();
                break;
            }
        }
    }
}
