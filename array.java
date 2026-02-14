import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("PROGRAM MENGHITUNG IP SEMESTER");
        System.out.println("=============================");

        String [] mk = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking and Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        int[] sks = new int[mk.length];
        int[] nilaiAngka = new int[mk.length];
        double[] nilaiSetara = new double[mk.length];

        for(int i = 0; i < mk.length; i++) {
            System.out.println("\nMata Kuliah : " + mk[i]);

            System.out.print("Masukkan SKS : ");
            sks[i] = sc.nextInt();

            System.out.print("Masukkan Nilai Angka : ");
            nilaiAngka[i] = sc.nextInt();
        }

        double totalBobot = 0;
        int totalSKS = 0;

        for (int i = 0; i < mk.length; i++) {

            if (nilaiAngka[i] >= 80 && nilaiAngka[i] <= 100) {
                nilaiSetara[i] = 4.0;
            } else if (nilaiAngka[i] >= 73) {
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] >= 65) {
                nilaiSetara[i] = 3.0;
            } else if (nilaiAngka[i] >= 60) {
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] >= 50) {
                nilaiSetara[i] = 2.0;
            } else if (nilaiAngka[i] >= 39) {
                nilaiSetara[i] = 1.0;
            } else {
                nilaiSetara[i] = 0.0;
            }

            totalBobot += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }

        double ip = totalBobot / totalSKS;

        System.out.println("\n===== HASIL KONVERSI =====");
        System.out.printf("%-40s %-10s %-10s\n", "Mata Kuliah", "Nilai", "Bobot");

        for (int i = 0; i < mk.length; i++) {
            System.out.printf("%-40s %-10d %-10.2f\n",
                    mk[i], nilaiAngka[i], nilaiSetara[i]);
        }

        System.out.println("================================");
        System.out.printf("IP Semester : %.2f\n", ip);
    }
}
