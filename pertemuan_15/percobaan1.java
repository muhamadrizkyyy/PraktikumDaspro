public class percobaan1 {
    public static void main(String[] args) {
        System.out.println(faktorialRekursif(5));
        System.out.println(faktorialIteratif(5));
    }

    static int faktorialRekursif(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (faktorialRekursif(n - 1) * n);
        }
    }

    static int faktorialIteratif(int n) {
        int faktor = 1;

        for (int i = n; i >= 1 ; i--) {
            faktor = faktor * i;
        }

        return faktor;
    }
}