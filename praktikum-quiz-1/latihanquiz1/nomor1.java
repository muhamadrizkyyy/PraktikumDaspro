import java.util.Scanner;

public class nomor1 {
    public static void main(String[] args) {
        double suhuAwal, suhuK, suhuF;

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan suhu dalam celsius: ");
        suhuAwal = sc.nextDouble();

        suhuF = (suhuAwal * 1.8) + 32;
        suhuK = suhuAwal + 273;

        System.out.println("Suhu dalam kelvin = " + suhuK + "k | suhu dalam farenheit = " + suhuF + "f");
    }
}