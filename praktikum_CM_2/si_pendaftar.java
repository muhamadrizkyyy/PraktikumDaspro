import java.util.Scanner;

public class si_pendaftar {
    // inisialisasi variabel sc untuk menangani inputan dari user
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String data_pendaftar[][] = new String[0][6];

        do {
            System.out.println("=============================================");
            // menampilkan menu utama
            System.out.println("==== Sistem Pendaftaran Magang Mahasiswa ====");
            System.out.println("=============================================");
            System.out.println("1. Tambah Data Magang");
            System.out.println("2. Tampilkan Semua Pendaftar Magang");
            System.out.println("3. Cari Pendaftar Berdasarkan Program Studi");
            System.out.println("4. Hitung Jumlah Pendaftar Untuk Setiap Status");
            System.out.println("5. Keluar");
            System.out.println("=============================================");
            System.out.print("Pilih menu (1-5) : ");
            int pilihan = sc.nextInt();
            System.out.println("=============================================");
            switch (pilihan) {
                case 1:
                    data_pendaftar = addData(data_pendaftar);
                    break;
                case 2:
                    showData(data_pendaftar, "");
                    break;
                case 3:
                    // inputan untuk user memasukkan filter prodi yang diinginkan
                    sc.nextLine();
                    System.out.print("Masukkan program studi yang dicari : ");
                    String prodi = sc.nextLine();
                    showData(data_pendaftar, prodi);
                    break;
                case 4:
                    countData(data_pendaftar);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }

            // blok if untuk menghentikan looping ketika user pilih menu 5 (exit)
            if (pilihan == 5) {
                break;
            }
        } while (true);
    }

    static String[][] addData(String[][] data) {
        // inisialisasi array temporary untuk memperbesar size array original
        String[][] tempArr = new String[data.length + 1][6];
        // copy data array original ke array temporary
        System.arraycopy(data, 0, tempArr, 0, data.length);

        // menambahkan data baru ke array
        sc.nextLine();
        System.out.print("Nama : ");
        tempArr[tempArr.length - 1][0] = sc.nextLine();
        System.out.print("NIM : ");
        tempArr[tempArr.length - 1][1] = sc.nextLine();
        System.out.print("Program Studi : ");
        tempArr[tempArr.length - 1][2] = sc.nextLine();
        System.out.print("Perusahaan tujuan magang : ");
        tempArr[tempArr.length - 1][3] = sc.nextLine();
        System.out.print("Semester saat ini (6 atau 7) : ");
        String semester = sc.nextLine();
        // pengecekan semester harus 6 atau 7
        if (semester.equals("6") || semester.equals("7")) {
            tempArr[tempArr.length - 1][4] = semester;
        } else {
            System.out.println("Pendafataran tidak berhasil, semester tidak valid");
            return data;
        }
        System.out.print("Status magang (Diterima / Menunggu / Ditolak): ");
        String stts = sc.nextLine();
        // pengecekan status harus diterima / menunggu / ditolak
        if (stts.equalsIgnoreCase("diterima") || stts.equalsIgnoreCase("menunggu")
                || stts.equalsIgnoreCase("ditolak")) {
            tempArr[tempArr.length - 1][5] = stts;
        } else {
            System.out.println("Pendafataran tidak berhasil, status tidak valid");
            return data;
        }

        // menampilkan notifikasi keberhasilan dan total pendaftar
        System.out.println("Data berhasil ditambahkan. Total pendaftar : " + tempArr.length);

        return tempArr;
    }

    static void showData(String[][] data, String filter) {
        int dataFound = 0;
        // menampilkan data
        System.out.println("\n========================================================");
        System.out.println(
                "Nama\t\tNIM\t\tProgram Studi\t\t\tPerusahaan\t\tSemester\tStatus magang");
        System.out.println("===========================================================\n");

        if (data.length == 0) {
            System.out.println("Tidak ada data");
        } else {
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    // pengecekan apakah filter kosong atau tidak
                    if (filter.equals("")) {
                        System.out.print(data[i][j] + "\t\t");
                    } else {
                        // pengecekan data yang ditampilkan harus sesuai filter prodi yang diinputkan
                        if (filter.equalsIgnoreCase(data[i][2])) {
                            System.out.print(data[i][j] + "\t\t");
                            dataFound++;
                        }
                    }
                }
                System.out.println();
            }
            // blok if untuk menampilkan keterangan jika data tidak ditemukan sesuai prodi
            if (dataFound == 0 && !filter.equals("")) {
                System.out.println("Data tidak ditemukan");
            }
        }

        System.out.println("\n=============================================\n");
    }

    static void countData(String[][] data) {
        // inisialisasi variabel untuk menyimpan jumlah pendaftar berdasarkan statusnya
        int accept = 0, wait = 0, reject = 0;

        // perulangan untuk menjumlahkan sesuai dengan statusnya
        for (int i = 0; i < data.length; i++) {
            if (data[i][5].equalsIgnoreCase("Diterima")) {
                accept++;
            } else if (data[i][5].equalsIgnoreCase("Menunggu")) {
                wait++;
            } else {
                reject++;
            }
        }

        // menampilkan total pendaftar dan jumlah sesuai statusnya
        System.out.println("Jumlah Pendaftar : " + data.length);
        System.out.println("=== Status Pendaftar ===");
        System.out.println("Diterima : " + accept);
        System.out.println("Menunggu : " + wait);
        System.out.println("Ditolak : " + reject);
    }
}
