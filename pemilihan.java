import java.util.Scanner;
public class pemilihan {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("PROGRAM MENGHITUNG NILAI AKHIR");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        double nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUAS = sc.nextDouble();
        System.out.println();

        boolean valid = true;
        if (nilaiTugas < 0 || nilaiTugas > 100 ||
            nilaiKuis < 0 || nilaiKuis > 100 ||
            nilaiUTS < 0 || nilaiUTS > 100 ||
            nilaiUAS < 0 || nilaiUAS > 100) {
            valid = false;
            System.out.println("Nilai tidak valid.");
        }

        double nilaiAkhir;
        String nilaiHuruf;
        String kualifikasi;
        String status;
        if (valid) {
            nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.3 * nilaiUAS);

            double nilaiSetara;
            if(nilaiAkhir > 80 && nilaiAkhir <= 100){
                nilaiHuruf = "A"; nilaiSetara = 4.0; kualifikasi = "Sangat Baik"; status = "LULUS";
            } else if(nilaiAkhir > 73 && nilaiAkhir <= 80){
                nilaiHuruf = "B+"; nilaiSetara = 3.5; kualifikasi = "Lebih dari Baik"; status = "LULUS";
            } else if(nilaiAkhir > 65 && nilaiAkhir <= 73){
                nilaiHuruf = "B"; nilaiSetara = 3.0; kualifikasi = "Baik"; status = "LULUS";
            } else if(nilaiAkhir > 60 && nilaiAkhir <= 65){
                nilaiHuruf = "C+"; nilaiSetara = 2.5; kualifikasi = "Lebih dari Cukup"; status = "LULUS";
            } else if(nilaiAkhir > 50 && nilaiAkhir <= 60){
                nilaiHuruf = "C"; nilaiSetara = 2.0; kualifikasi = "Cukup"; status = "LULUS";
            } else if(nilaiAkhir > 39 && nilaiAkhir <= 50){
                nilaiHuruf = "D"; nilaiSetara = 1.0; kualifikasi = "Kurang"; status = "TIDAK LULUS";
            } else {
                nilaiHuruf = "E"; nilaiSetara = 0; kualifikasi = "Gagal"; status = "TIDAK LULUS";
            }
        System.out.println("==============================");
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
        System.out.println("==============================");

        if (status.equals("LULUS")) {
                System.out.println("SELAMAT ANDA LULUS!");
            } else {
                System.out.println("MOHON MAAF, ANDA TIDAK LULUS.");
            }
        }
    }
}
