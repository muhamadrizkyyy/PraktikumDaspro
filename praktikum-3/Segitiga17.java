import java.util.Scanner;

public class Segitiga17 {
    public static void main(String[] args) {
        int alas, tinggi;
        float luas;

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan alas : ");
        alas = sc.nextInt();
        System.out.print("Masukkan tinggi : ");
        tinggi = sc.nextInt();

        luas = (0.5f * alas * tinggi);
        System.out.println("Luas segitiga adalah " + luas);
        sc.close();
    }
}
