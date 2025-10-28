import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int harga = 0;
        String namaMinuman;

        System.out.println("VENDING MACHINE");
        System.out.println("1. Kopi (Rp 5000)");
        System.out.println("2. Teh (Rp 3000)");
        System.out.println("3. Air Mineral (Rp 2000)");
        System.out.print("Pilih minuman (1-3): ");

        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                namaMinuman = "Kopi";
                harga = 5000;
                break;
            case 2:
                namaMinuman = "Teh";
                harga = 3000;
                break;
            case 3:
                namaMinuman = "Air Mineral";
                harga = 2000;
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                input.close();
                return;
        }

        System.out.println("Anda memilih " + namaMinuman + " seharga Rp " + harga);
        System.out.print("Masukkan jumlah uang (Rp): ");
        int uangMasuk = input.nextInt();

        if (uangMasuk < harga) {
            System.out.println("Maaf, uang Anda tidak cukup.");
            System.out.println("Uang Anda dikembalikan: Rp " + uangMasuk);
        } else {
            int kembalian = uangMasuk - harga;
            System.out.println("Terima kasih!");
            System.out.println("Silakan ambil " + namaMinuman + " Anda.");
            if (kembalian > 0) {
                System.out.println("Kembalian Anda: Rp " + kembalian);
            }
        }

        input.close();
    }
}