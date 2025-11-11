import java.util.Scanner;

public class BioskopWithScanner17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baris, kolom, pilih;
        String nama, next = "y";
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama penonton: ");
            nama = input.nextLine();
            System.out.print("Masukkan nomor baris: ");
            baris = input.nextInt();
            System.out.print("Masukkan nomor kolom: ");
            kolom = input.nextInt();

            penonton[baris - 1][kolom - 1] = nama;
            input.nextLine();

            System.out.print("Masukkan data lagi? (y/n) ");
            next = input.nextLine();
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
