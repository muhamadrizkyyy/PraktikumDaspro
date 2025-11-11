import java.util.Scanner;

public class BioskopWithScanner17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baris, kolom, pilih;
        String nama, next = "y";
        String[][] penonton = new String[4][2];

        do {
            System.out.println("\n\n\n\n\n===================================");
            System.out.println("Menu 1: input data penonton");
            System.out.println("Menu 2: tampil data penonton");
            System.out.println("Menu 3: exit");
            System.out.print("Masukkan menu: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    while (true) {
                        System.out.println("\n\n===================================");
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
                    break;
                case 2:
                    System.out.println("\n\n===================================");
                    for (String[] list : penonton) {
                        for (String data : list) {
                            System.out.println(data);
                        }
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Menu tidak ada");
            }
        } while (true);
    }
}
