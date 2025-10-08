import java.util.Scanner;

public class tugas3_2 {
    public static void main(String[] args) {
        String role_user;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nMasukkan role anda: ");
        role_user = sc.nextLine();

        if (role_user.equalsIgnoreCase("dosen")) {
            System.out.printf("Akses diberikan (%s)", role_user);
        } else if (role_user.equalsIgnoreCase("mahasiswa")) {
            System.out.print("Masukkan jumlah sks: ");
            int jml_sks = sc.nextInt();
            if (jml_sks >= 12) {
                System.out.printf("Akses diberikan (%s)", role_user);
            } else {
                System.out.println("Akses ditolak, sks kurang dari 12!");
            }
        } else {
            System.out.println("akses ditolak!");
        }
    }
}
