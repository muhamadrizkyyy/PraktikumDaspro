import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        boolean isFound = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama menu yang dicari: ");
        String cari = sc.nextLine();

        for(String i : menu) {
            if (i.equalsIgnoreCase(cari)) {
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("menu tidak tersedia!");
        } else {
            System.out.println("menu tersedia!");
        }
    }
}
