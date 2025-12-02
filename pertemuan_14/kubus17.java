import java.util.Scanner;

public class kubus17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vol,luasPermukaan;
        System.out.print("Masukkan sisi kubus: ");
        int s = sc.nextInt();
        vol = hitungVolume(s);
        luasPermukaan = hitungLuasPermukaan(s);
        System.out.println("Volume kubus: " + vol);
        System.out.println("Luas permukaan kubus: " + luasPermukaan);
        sc.close();
    }

    static int hitungVolume(int s) {
        return s*s*s;
    }

    static int hitungLuasPermukaan(int s) {
        return 6*s*s;
    }
}
