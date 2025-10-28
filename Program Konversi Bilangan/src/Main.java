import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan desimal (basis 10): ");
        int desimal = input.nextInt();

        System.out.print("Pilih konversi [1=Biner, 2=Oktal]: ");
        int pilihan = input.nextInt();

        String hasilKonversi = "";
        int desimalAsli = desimal;

        if (pilihan == 1) {
            int basis = 2;
            if (desimal == 0) {
                hasilKonversi = "0";
            }
            while (desimal > 0) {
                int sisa = desimal % basis;
                hasilKonversi = sisa + hasilKonversi;
                desimal = desimal / basis;
            }
            System.out.println("Hasil konversi " + desimalAsli + " (desimal) ke Biner adalah: " + hasilKonversi);

        } else if (pilihan == 2) {
            int basis = 8;
            if (desimal == 0) {
                hasilKonversi = "0";
            }
            while (desimal > 0) {
                int sisa = desimal % basis;
                hasilKonversi = sisa + hasilKonversi;
                desimal = desimal / basis;
            }
            System.out.println("Hasil konversi " + desimalAsli + " (desimal) ke Oktal adalah: " + hasilKonversi);

        } else {
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}