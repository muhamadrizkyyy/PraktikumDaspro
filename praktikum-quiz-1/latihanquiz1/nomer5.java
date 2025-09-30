import java.util.Scanner;

public class nomer5 {
    public static void main(String[] args) {
        int totalSaldo = 100000;
        int inputSaldo;
        byte pilihan;

        System.out.println("\n1.cek saldo \n2.tarik saldo \n3.setor tunai");

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan pilihan: ");
        pilihan = sc.nextByte();

        switch (pilihan) {
            case 1:
                System.out.println("Saldo saat ini adalah " + totalSaldo);
                break;
            case 2:
                System.out.print("Masukkan nominal yang ingin ditarik: ");
                inputSaldo = sc.nextInt();

                if (inputSaldo <= totalSaldo) {
                    totalSaldo -= inputSaldo;
                    System.out.println("berhasil menarik saldo | sisa saldo saat ini adalah " + totalSaldo);
                } else {
                    System.out.println("maaf saldo tidak mencukupi!");
                }
                break;
            case 3:
                System.out.print("masukkan nominal saldo yang ingin disimpan: ");
                inputSaldo = sc.nextInt();
                totalSaldo += inputSaldo;
                System.out.println("saldo saat ini adalah " + totalSaldo);
                break;
            default:
                break;
        }
    }
}
