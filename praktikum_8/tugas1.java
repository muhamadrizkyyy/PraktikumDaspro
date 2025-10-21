import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        int tiket_dibeli, tiket_terjual = 0, tot_pendapatan = 0;
        String pilihan = "";
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("masukkan jumlah tiket di beli: ");
            tiket_dibeli = sc.nextInt();
            if (tiket_dibeli > 10) {
                tot_pendapatan += tiket_dibeli * 50000 - ((tiket_dibeli * 50000) * 0.15);
            } else if (tiket_dibeli > 4) {
                tot_pendapatan += tiket_dibeli * 50000 - ((tiket_dibeli * 50000) * 0.1);
            } else if (tiket_dibeli < 0) {
                System.out.println("jumlah tiket tidak valid!");
            } else {
                tot_pendapatan += tiket_dibeli * 50000;
            }

            tiket_terjual += tiket_dibeli;

            sc.nextLine();
            System.out.print("apakah anda ingin memesan tiket lagi? (y/n): ");
            pilihan = sc.nextLine();

            System.out.println(pilihan);

            if (pilihan.equalsIgnoreCase("n")) {
                System.out.println("total tiket terjual: " + tiket_terjual);
                System.out.println("total pendapatan: " + tot_pendapatan);
                System.out.println("thank you!");
                
                break;
            }
        } while (true);
    }
}
