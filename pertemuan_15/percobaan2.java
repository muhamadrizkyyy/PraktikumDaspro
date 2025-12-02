import java.util.Scanner;

public class percobaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int bilangan = sc.nextInt();
        System.out.print("Masukkan pangkat: ");
        int pangkat = sc.nextInt();
        System.out.println(" = " + hitungPangkat(bilangan, pangkat));
    }

    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            System.out.print(y != 1 ? x + " x " : x); 
            return (x * hitungPangkat(x, y - 1));
        }
    }
}
