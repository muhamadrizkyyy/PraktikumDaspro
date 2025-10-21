import java.util.Scanner;

public class cm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim, nHuruf1, nHuruf2,nHuruf3, stts1, stts2,stts3, stts_smt;
        byte nUTS1, nUAS1, nTGS1, nUTS2, nUAS2, nTGS2, nUTS3, nUAS3, nTGS3;
        double nAkhir1, nAkhir2, nAkhir3, mNilaiAkhir;

        System.out.println("========== IDENTITAS MAHASISWA ==========");
        System.out.print("Nama  : ");
        nama = sc.nextLine();
        System.out.print("NIM   : ");
        nim = sc.nextLine();

        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS   : ");
        nUTS1 = sc.nextByte();
        System.out.print("Nilai UAS   : ");
        nUAS1 = sc.nextByte();
        System.out.print("Nilai Tugas   : ");
        nTGS1 = sc.nextByte();

        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS   : ");
        nUTS2 = sc.nextByte();
        System.out.print("Nilai UAS   : ");
        nUAS2 = sc.nextByte();
        System.out.print("Nilai Tugas   : ");
        nTGS2 = sc.nextByte();

        System.out.println("\n--- Mata Kuliah 3: Basis Data ---");
        System.out.print("Nilai UTS   : ");
        nUTS3 = sc.nextByte();
        System.out.print("Nilai UAS   : ");
        nUAS3 = sc.nextByte();
        System.out.print("Nilai Tugas   : ");
        nTGS3 = sc.nextByte();

        // Menghitung nilai akhir matkul algoritma mahasiswa
        nAkhir1 = ((nUTS1*0.3) + (nUAS1*0.4) + (nTGS1*0.3));
        System.out.println(nAkhir1);
        // cek predikat nilai akhir matkul algoritma mahasiswa
        if (80 < nAkhir1 && nAkhir1 <= 100) {
            nHuruf1 = "A";
        } else if (nAkhir1 > 73 && nAkhir1 <= 80) {
            nHuruf1 = "B+";
        } else if(nAkhir1 > 65 && nAkhir1 <= 73){
            nHuruf1 = "B";
        } else if (nAkhir1 > 60 && nAkhir1 <= 65) {
            nHuruf1 = "C+";
        } else if (nAkhir1 > 50 && nAkhir1 <= 60) {
            nHuruf1 = "C";
        } else if (nAkhir1 > 39 && nAkhir1 <= 50) {
            nHuruf1 = "D"; 
        } else {
            nHuruf1 = "E";
        }

        // cek status kelulusan matkul algoritma mahasiswa
        if (nAkhir1 >= 60) {
            stts1 = "Lulus";
        } else {
            stts1 = "Tidak Lulus";
        }

        // Menghitung nilai akhir matkul struktur data mahasiswa
        nAkhir2 = (double) ((nUTS2*0.3) + (nUAS2*0.4) + (nTGS2*0.3));
        // cek predikat nilai akhir matkul struktur data mahasiswa
        if (80 < nAkhir2 && nAkhir2 <= 100) {
            nHuruf2 = "A";
        } else if (nAkhir2 > 73 && nAkhir2 <= 80) {
            nHuruf2 = "B+";
        } else if(nAkhir2 > 65 && nAkhir2 <= 73){
            nHuruf2 = "B";
        } else if (nAkhir2 > 60 && nAkhir2 <= 65) {
            nHuruf2 = "C+";
        } else if (nAkhir2 > 50 && nAkhir2 <= 60) {
            nHuruf2 = "C";
        } else if (nAkhir2 > 39 && nAkhir2 <= 50) {
            nHuruf2 = "D"; 
        } else {
            nHuruf2 = "E";
        }

        // cek status kelulusan matkul struktur mahasiswa
        if (nAkhir2 >= 60) {
            stts2 = "Lulus";
        } else {
            stts2 = "Tidak Lulus";
        }

        // Menghitung nilai akhir matkul basis data mahasiswa
        nAkhir3 = (double) ((nUTS3*0.3) + (nUAS3*0.4) + (nTGS3*0.3));

        // cek predikat nilai akhir matkul basis data mahasiswa
        if (80 < nAkhir3 && nAkhir3 <= 100) {
            nHuruf3 = "A";
        } else if (nAkhir3 > 73 && nAkhir3 <= 80) {
            nHuruf3 = "B+";
        } else if(nAkhir3 > 65 && nAkhir3 <= 73){
            nHuruf3 = "B";
        } else if (nAkhir3 > 60 && nAkhir3 <= 65) {
            nHuruf3 = "C+";
        } else if (nAkhir3 > 50 && nAkhir3 <= 60) {
            nHuruf3 = "C";
        } else if (nAkhir3 > 39 && nAkhir3 <= 50) {
            nHuruf3 = "D"; 
        } else {
            nHuruf3 = "E";
        }

        // cek status kelulusan matkul basis data mahasiswa
        if (nAkhir3 >= 60) {
            stts3 = "Lulus";
        } else {
            stts3 = "Tidak Lulus";
        }

        // menghitung rata rata ketiga matkul
        mNilaiAkhir = (nAkhir1 + nAkhir2+ nAkhir3) / 3;

        // cek status kelulusan semester mahasiswa
        if (stts1.equalsIgnoreCase("Lulus") && stts2.equalsIgnoreCase("Lulus") && stts3.equalsIgnoreCase("Lulus")) {
            if (mNilaiAkhir >= 70) {
                stts_smt = "LULUS";
            } else if (mNilaiAkhir >= 60 && mNilaiAkhir < 70) {
                stts_smt = "LULUS BERSYARAT";
            } else {
                stts_smt = "TIDAK LULUS";
            }
        } else {
            stts_smt = "TIDAK LULUS";
        }


        System.out.println("\n========== HASIL PENILAIAN AKADEMIK ==========");
        System.out.println("Nama  : " + nama);
        System.out.println("NIM : " + nim);

        System.out.println("");
        System.out.println("Mata Kuliah \t\t UTS \t UAS \t Tugas \t Nilai Akhir \t Nilai Huruf \t Status");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.printf("Algoritma Pemrograman\t %d\t %d\t %d\t %.2f\t\t %s\t %s", nUTS1, nUAS1, nTGS1, nAkhir1, nHuruf1, stts1);
        System.out.printf("\nStruktur Data\t\t %d\t %d\t %d\t %.2f\t\t %s\t %s", nUTS2, nUAS2, nTGS2, nAkhir2, nHuruf2, stts2);
        System.out.printf("\nBasis Data   \t\t %d\t %d\t %d\t %.2f\t\t %s\t %s", nUTS3, nUAS3, nTGS3, nAkhir3, nHuruf3, stts3);

        
        System.out.printf("\n\nRata-rata nilai akhir : %.2f", mNilaiAkhir);
        System.out.println("\nStatus Semester      : " + stts_smt);
    }
}