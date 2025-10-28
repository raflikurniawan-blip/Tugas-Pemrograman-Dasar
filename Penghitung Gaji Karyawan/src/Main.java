import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long gajiPokok;
        int jamLembur;
        String golongan;

        long tunjanganJabatan = 0;
        long uangLembur = 0;
        final long TARIF_LEMBUR_PER_JAM = 50000;

        System.out.println("KALKULATOR GAJI KARYAWAN");

        System.out.print("Masukkan Gaji Pokok (Rp): ");
        gajiPokok = input.nextLong();

        System.out.print("Masukkan Golongan (A/B/C): ");
        golongan = input.next().toUpperCase();

        System.out.print("Masukkan Jumlah Jam Lembur: ");
        jamLembur = input.nextInt();

        switch (golongan) {
            case "A":
                tunjanganJabatan = 1000000;
                break;
            case "B":
                tunjanganJabatan = 500000;
                break;
            case "C":
                tunjanganJabatan = 0;
                break;
            default:
                System.out.println("Golongan tidak valid, tunjangan diabaikan.");
                break;
        }

        uangLembur = jamLembur * TARIF_LEMBUR_PER_JAM;

        long gajiBersih = gajiPokok + tunjanganJabatan + uangLembur;

        Locale indonesia = new Locale("id", "ID");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(indonesia);

        System.out.println("\nRINCIAN GAJI");
        System.out.println("Gaji Pokok: " + formatter.format(gajiPokok));
        System.out.println("Tunjangan Golongan " + golongan + ": " + formatter.format(tunjanganJabatan));
        System.out.println("Uang Lembur (" + jamLembur + " jam): " + formatter.format(uangLembur));
        System.out.println("Total Gaji Bersih: " + formatter.format(gajiBersih));

        input.close();
    }
}