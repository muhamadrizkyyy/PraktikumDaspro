import java.util.Scanner;

public class nilaiMahasiswa17 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println();
        System.out.println("=====================");
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        int[] data = inputNilai(n);
        do {
            System.out.println("=====================");
            System.out.println("1.Tampilkan data \n2. Hitung total nilai \n3. Keluar");
            System.out.println("=====================");
            System.out.print("Pilih menu: ");
            int pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    tampilData(data);
                    break;
                case 2:
                    int totalNilai = sumNilai(data);
                    System.out.println("=====================");
                    System.out.println("Total nilai: " + totalNilai);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("=====================");
                    System.out.println("pilihan salah");
                    break;
            }
            if (pilih == 3) {
                break;
            }
        } while (true);
    }

    static int[] inputNilai(int n) {
        int[] data = new int[n];
        // Scanner sc = new Scanner(System.in);

        for (int i = 0; i < data.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            data[i] = sc.nextInt();
        }
        return data;
    }

    static void tampilData(int[] data) {
        int index = 0;
        System.out.println("=====================");
        for(int i : data) {
            System.out.println("Nilai mahasiswa ke-" + (index + 1) + ": " + i);
        }
        System.out.println("=====================");
    }

    static int sumNilai(int[] data) {
        int total = 0;
        for(int i : data) {
            total += i;
        }
        return total;
    }
}
