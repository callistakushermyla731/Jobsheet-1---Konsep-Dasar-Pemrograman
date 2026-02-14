public class fungsi {
    public static int hitungPendapatan(int[] stok, int[] harga) {
        int total = 0;

        for (int i = 0; i < stok.length; i++) {
            total += stok[i] * harga[i];
        }

        return total;
    }

    public static void tampilStatus(int pendapatan) {
        if (pendapatan > 1500000) {
            System.out.println("Status : Sangat Baik");
        } else {
            System.out.println("Status : Perlu Evaluasi");
        }
    }

    public static void main(String[] args) {

        int[][] stok = {
            {10, 5, 15, 7},   
            {6, 11, 9, 12},   
            {2, 10, 10, 5},   
            {5, 7, 12, 9}     
        };

        int[] harga = {75000, 50000, 60000, 10000};

        for (int i = 0; i < stok.length; i++) {

            System.out.println("RoyalGarden " + (i + 1));

            int pendapatan = hitungPendapatan(stok[i], harga);

            System.out.println("Pendapatan : Rp " + pendapatan);

            tampilStatus(pendapatan);

            System.out.println("---------------------------");
        }

    }    
}
