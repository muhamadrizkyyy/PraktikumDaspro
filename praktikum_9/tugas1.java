import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        System.out.print("Masukkan angka : ");
        int n = sc.nextInt();
        System.out.print("Jumlah kuadrat = ");
        for (int i = 1; i <= n; i++) {

            int kuadrat = i*i;

            System.out.print(kuadrat + " + ");
            total += kuadrat;

            // for(int j = 1; j <= i; j++){
            //     if (j == i) {
            //         int kuadrat = j*j;

            //         System.out.print(kuadrat + " + ");
            //         total += kuadrat;
            //     }
            // }
        }
        System.out.print(" = " + total);

        sc.close();
    }
}
