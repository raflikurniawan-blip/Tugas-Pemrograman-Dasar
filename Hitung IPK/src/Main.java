import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalSKS = 0;
        double totalPoin = 0.0;

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = input.nextInt();

        for (int i = 1; i <= jumlahMatkul; i++) {
            System.out.println("Mata Kuliah ke-" + i);

            System.out.print("  Masukkan SKS: ");
            int sks = input.nextInt();

            System.out.print("  Masukkan Nilai Huruf (A, B, C, D, E): ");
            String nilaiHuruf = input.next().toUpperCase();

            double bobotNilai = 0.0;

            switch (nilaiHuruf) {
                case "A":
                    bobotNilai = 4.0;
                    break;
                case "B":
                    bobotNilai = 3.0;
                    break;
                case "C":
                    bobotNilai = 2.0;
                    break;
                case "D":
                    bobotNilai = 1.0;
                    break;
                case "E":
                    bobotNilai = 0.0;
                    break;
                default:
                    System.out.println("Nilai tidak valid, mata kuliah ini diabaikan.");
                    sks = 0;
                    break;
            }

            totalPoin += (bobotNilai * sks);
            totalSKS += sks;
        }

        System.out.println("Hasil Perhitungan:");

        if (totalSKS > 0) {
            double ips = totalPoin / totalSKS;
            DecimalFormat df = new DecimalFormat("#.##");

            System.out.println("Total Poin: " + totalPoin);
            System.out.println("Total SKS: " + totalSKS);
            System.out.println("Indeks Prestasi Semester (IPS): " + df.format(ips));
        } else {
            System.out.println("Tidak ada SKS yang dihitung.");
        }

        input.close();
    }
}