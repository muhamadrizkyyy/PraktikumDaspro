import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        int jenis, durasi, total = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Masukkan jenis kendaraan (1 = mobil, 2 = motor, 0 = keluar): ");
            jenis = input.nextInt();
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = input.nextInt();
                if (durasi > 5) {
                    total += (durasi * 12500);
                } else {
                    if (jenis == 1) {
                        total += (durasi * 3000);
                    } else {
                        total += (durasi * 2000);
                    }
                }
            }
        } while (jenis != 0);

        System.out.println( "Total biaya parkir: " + total);
    }
}
