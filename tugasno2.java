import java.util.Scanner;
public class tugasno2 {
    static Scanner sc = new Scanner(System.in);

    public static void inputJadwal(String[][] jadwal, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Jadwal ke-" + (i+1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang            : ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari             : ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam              : ");
            jadwal[i][3] = sc.nextLine();

            System.out.println();
        }
    }

    public static void tampilJadwal(String[][] jadwal, int n) {
        System.out.println("\n===== JADWAL KULIAH MAHASISWA =====");
        System.out.printf("%-25s %-20s %-10s %-15s\n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-20s %-10s %-15s\n",
                jadwal[i][0],
                jadwal[i][1],
                jadwal[i][2],
                jadwal[i][3]);
        }
    }

    public static void cariHari(String[][] jadwal, int n, String hari) {
        boolean ditemukan = false;

        System.out.println("\n=== Jadwal Hari " + hari + "===");

        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println(jadwal[i][0] + " | " +
                                   jadwal[i][1] + " | " +
                                   jadwal[i][3]
                                   );
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal pada hari tersebut.");
        }
    }

    public static void cariMK(String[][] jadwal, int n, String mk){
        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.println("\n=== Detail Jadwal : ===");
                System.out.println("Mata Kuliah : " + jadwal[i][0]);
                System.out.println("Ruang       : " + jadwal[i][1]);
                System.out.println("Hari        : " + jadwal[i][2]);
                System.out.println("Jam         : " + jadwal[i][3]);

                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        System.out.print("Jumlah jadwal kuliah : ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, n);
        tampilJadwal(jadwal, n);

        System.out.print("\nCari jadwal berdasarkan hari : ");
        String hari = sc.nextLine();
        cariHari(jadwal, n, hari);

        System.out.print("\nCari jadwal berdasarkan nama Mata Kuliah : ");
        String mk = sc.nextLine();
        cariMK(jadwal, n, mk);
    }
}
