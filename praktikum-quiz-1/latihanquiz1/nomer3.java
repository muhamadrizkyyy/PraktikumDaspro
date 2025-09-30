import java.util.Scanner;

public class nomer3 {
    public static void main(String[] args) {
        String usn, pass;
        String usn_true = "majapahit";
        String pass_true = "12345";

        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("masukkan username: ");
            usn = sc.nextLine();
            System.out.print("masukkan password: ");
            pass = sc.nextLine();

            if (!usn.equals(usn_true) && !pass.equals(pass_true)) {
                System.out.println("credentials isn`t correct!");
            } else {
                System.out.println("Welcome!");
            }
        } while (!usn.equals(usn_true) && !pass.equals(pass_true));
    }
}
