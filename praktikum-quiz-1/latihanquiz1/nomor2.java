import java.util.Scanner;

public class nomor2 {
    public static void main(String[] args) {
        int subtotal;
        double diskon, total;

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan subtotal belanja: ");
        subtotal = sc.nextInt();

        if (subtotal > 250000) {
            diskon = 0.15;
            total = (int) subtotal - (diskon * subtotal);
        } else if (subtotal > 150000) {
            diskon = 0.1;
            total = (int) subtotal - (subtotal * diskon);
        } else {
            diskon = 0;
            total = subtotal;
        }

        System.out.println("yang harus dibayar adalah " + total + " | diskon = " + diskon);
    }
}
