public class SearchNilai17 {
    public static void main(String[] args) {
        int[] nilai = { 90, 85, 95, 80, 75 };
        int key = 95;
        int hasil = 0;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                hasil = i;
                break;
            }
        }

        System.out.println();
        System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + hasil);
        System.out.println();
    }
}
