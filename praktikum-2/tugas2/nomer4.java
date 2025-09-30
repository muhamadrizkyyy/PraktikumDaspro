package tugas2;

import java.util.Scanner;

public class nomer4 {
    public static void main(String[] args) {
        int panjangTanah, lebarTanah;
        int dKolamLingkaran, dKolamPersegi;
        int luasTanah, luasKolamPersegi;
        double luasKolamLingkaran, luasRumput;

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang tanah: ");
        panjangTanah = sc.nextInt();
        System.out.print("Masukkan lebar tanah: ");
        lebarTanah = sc.nextInt();
        System.out.print("Masukkan diameter kolam persegi: ");
        dKolamPersegi = sc.nextInt();
        System.out.print("Masukkan diameter kolam lingkaran: ");
        dKolamLingkaran = sc.nextInt();

        luasTanah = panjangTanah * lebarTanah;
        luasKolamPersegi = dKolamPersegi * dKolamPersegi;
        luasKolamLingkaran = Math.PI * 0.25 * dKolamLingkaran;
        luasRumput = luasTanah - (luasKolamPersegi + luasKolamLingkaran);

        System.out.println("Luas tanah ditanami rumput: " + luasRumput);
        sc.close();
    }
}
