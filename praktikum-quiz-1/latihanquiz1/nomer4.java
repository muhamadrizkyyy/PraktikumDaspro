import java.util.Scanner;

public class nomer4 {
    public static void main(String[] args) {
        byte pilihan;
        System.out.println("1. luas persegi \n2. luas persegi panjang \n3. luas segitiga\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan pilihan: ");
        pilihan = sc.nextByte();

        switch (pilihan) {
            case 1:
                int s;
                System.out.print("masukkan nilai sisi persegi: ");
                s = sc.nextInt();
                int luas = s *s;
                System.out.println(" luas persegi = " + luas);
                break;
            case 2:
                int p,l;
                System.out.print("masukkan nilai panjang persegi panjang: ");
                p = sc.nextInt();
                System.out.print("masukkan nilai panjang persegi panjang: ");
                l = sc.nextInt();
                int luas_persegiPanjang = p * l;
                System.out.println(" luas persegi panjang = " + luas_persegiPanjang);
                break;
            case 3:
                int a,t;
                System.out.print("masukkan nilai alas segitiga: ");
                a = sc.nextInt();
                System.out.print("masukkan nilai tinggi segitiga: ");
                t = sc.nextInt();
                double luasSegitiga = a * t * 0.5;
                System.out.println(" luas persegi panjang = " + luasSegitiga);
                break;
            default:
                System.out.println("tidak valid!");
                break;
        }

    }
}
