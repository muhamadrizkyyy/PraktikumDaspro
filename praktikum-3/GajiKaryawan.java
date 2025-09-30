import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        int gajiPokok, tunjTransp = 600000, tunjMkn= 400000;
        double bonus,totGaji;

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan gaji pokok : ");
        gajiPokok = sc.nextInt();
        bonus = gajiPokok * 0.05;
        totGaji = gajiPokok + tunjTransp + tunjMkn + bonus - (gajiPokok * 0.1);

        System.out.println("bonus : " + bonus);
        System.out.println("Total gaji karyawan : " + (int) totGaji);
        sc.close();
    }
}
