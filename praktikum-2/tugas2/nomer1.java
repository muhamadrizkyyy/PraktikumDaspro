package tugas2;

public class nomer1 {
    public static void main(String[] args) {
        int gajiPokok = 3000000, tunjanganAnak = 150000, gajiBersih;
        byte jumlahAnak = 3;
        double persentaseDanaPensiun = 0.05;

        gajiBersih = (int) (gajiPokok *(1-persentaseDanaPensiun)) + (jumlahAnak * tunjanganAnak);
        System.out.println("Gaji bersih = " + gajiBersih);
    }
}
