import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum_item_sold = 0, sum_pelanggan = 0;

        System.out.print("Jumlah cabang cafe: ");
        int cabang = sc.nextInt();
        System.out.println("\n=== Input Penjualan per Cabang ===");
        for (int i = 1; i <= cabang; i++) {
            System.out.println("\n--- Cabang " + i + " ---");
            System.out.print("Jumlah pelanggan: ");
            int pelanggan = sc.nextInt();
            
            int item_terjual = 0;
            for (int j = 1; j <= pelanggan; j++) {
                System.out.print("- Pelanggan " + j + " : ");
                item_terjual += sc.nextInt();
            }

            sum_item_sold += item_terjual;
            sum_pelanggan += pelanggan;
        }

        System.out.println("\n=== Total Seluruh Cabang ===");
        System.out.println("Pelanggan: " + sum_pelanggan);
        System.out.println("Item terjual: " + sum_item_sold);

        sc.close();
    }
}
