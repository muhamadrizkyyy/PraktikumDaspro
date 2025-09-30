package tugas2;

public class nomer3 {
    public static void main(String[] args) {
        int panjangTanah = 100, lebarTanah= 50;
        int dKolamLingkaran = 2, dKolamPersegi = 2;
        int luasTanah, luasKolamPersegi;
        double luasKolamLingkaran, luasRumput;

        luasTanah = panjangTanah * lebarTanah;
        luasKolamPersegi = dKolamPersegi * dKolamPersegi;
        luasKolamLingkaran = Math.PI * 0.25 * dKolamLingkaran;
        luasRumput = luasTanah - (luasKolamPersegi + luasKolamLingkaran);

        System.out.println("Luas tanah ditanami rumput: " + luasRumput);
    }
}
