import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        int targetKalDay; //deklarasi variabel untuk menyimpan target kalori harian
        double bb; //deklarasi variabel berat badan
        double dur_lari, dur_spd, dur_renang; //deklarasi variabel durasi setiap olahraga
        double kec_lari, kec_renang, kec_spd; //deklarasi variabel kecepatan setiap olahraga
        double ket_lari, ket_renang, ket_spd; //deklarasi variabel ketinggian lokasi setiap olahraga
        double presentaseGoals, kal_lari, kal_renang, kal_spd, totKal, meanKal, totDur; //deklarasi variabel untuk presentase goals kalori harian, kalori lari, kalori renang, kalori sepeda, total kalori dan rata rata kalori setiap menit
        double KLari = 0.05, KRenang = 0.04, Kspd = 0.03; //deklarasi dan inisialisasi value dari target per hari, koefisien lari, renang, dan sepeda

        Scanner sc = new Scanner(System.in); //deklarasi dan inisialisasi variabel untuk inputan

        // bagian untuk proses inputan mulai dari berat badan,target kalori harian, durasi, kecepatan, dan ketinggian lokasi setiap olahraga
        System.out.print("Masukkan berat badan (kg): ");
        bb = sc.nextDouble(); //menyimpan berat badan yang diinputkan user
        System.out.print("Masukkan target kalori per hari : ");
        targetKalDay = sc.nextInt(); //menyimpan target kalori yang diinputkan user

        System.out.print("Masukkan durasi berlari (menit): ");
        dur_lari = sc.nextInt(); // menyimpan durasi olahraga yang diinputkan user
        System.out.print("Masukkan kecepatan berlari(km/jam): ");
        kec_lari = sc.nextDouble(); //menyimpan kecepatan yang diinputkan user
        System.out.print("Masukkan ketinggian lokasi berlari(mdpl): ");
        ket_lari = sc.nextDouble(); //menyimpan ketinggian lokasi tempat olahraga yang diinputkan user

        System.out.print("Masukkan durasi berenang (menit): ");
        dur_renang = sc.nextInt(); // menyimpan durasi olahraga yang diinputkan user
        System.out.print("Masukkan kecepatan berenang(km/jam): ");
        kec_renang = sc.nextDouble(); //menyimpan kecepatan yang diinputkan user
        System.out.print("Masukkan ketinggian lokasi berenang(mdpl): ");
        ket_renang = sc.nextDouble(); //menyimpan ketinggian lokasi tempat olahraga yang diinputkan user

        System.out.print("Masukkan durasi bersepeda (menit): ");
        dur_spd = sc.nextInt(); // menyimpan durasi olahraga yang diinputkan user
        System.out.print("Masukkan kecepatan Bersepeda(km/jam): ");
        kec_spd = sc.nextDouble(); //menyimpan kecepatan yang diinputkan user
        System.out.print("Masukkan ketinggian lokasi bersepada(mdpl): ");
        ket_spd = sc.nextDouble(); //menyimpan ketinggian lokasi tempat olahraga yang diinputkan user

        kal_lari = (dur_lari * KLari * bb) + (kec_lari * 0.5) + (ket_lari * 0.01); // proses untuk menghitung kalori lari
        kal_renang = (dur_renang * KRenang * bb) + (kec_renang * 0.5) + (ket_renang * 0.01); // proses untuk menghitung kalori renang
        kal_spd = (dur_spd * Kspd * bb) + (kec_spd * 0.5) + (ket_spd * 0.01); //proses untuk menghitung kalori bersepeda

        totKal = kal_lari + kal_renang + kal_spd; //proses untuk menghitung total kalori yang terbakar seluruh olahraga
        totDur = dur_lari + dur_renang + dur_spd; //prose total durasi dari setiap olahrgaa

        meanKal =totKal / totDur; //proses menghitung rata rata kalori yang terbakar per menit seluruh olaharaga

        presentaseGoals = (totKal / targetKalDay) * 100; //proses menghitung presentase ketercapaian target harian 

        // menampilkan kalori setiap olahraga, total kalori, rata rata kalori tiap menit, dan presentase ketercapaian
        System.out.println("\n--------------------------------------");
        System.out.printf("Kalori terbakar saat berlari: %.2f",kal_lari);
        System.out.printf("\nKalori terbakar saat berenang: %.2f",kal_renang);
        System.out.printf("\nKalori terbakar saat bersepeda: %.2f",kal_spd);
        System.out.println("\n--------------------------------------");
        System.out.println("total kalori seluruh olahraga: " + totKal);
        System.out.println("rata - rata kalori yang dikeluarkan per menit: " + meanKal);
        System.out.println("\n--------------------------------------");
        System.out.printf("total kalori = %.2f | target harian = %d | presentase ketercapaian = %.2f", totKal, targetKalDay, presentaseGoals);
        System.out.print("%");

    }
}