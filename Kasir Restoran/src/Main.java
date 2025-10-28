import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long totalHarga = 0;
        int pilihanMenu;
        char tambahLagi = 'Y';

        while (tambahLagi == 'Y' || tambahLagi == 'y') {
            System.out.println("\nMenu Makanan/Minuman:");
            System.out.println("1. Nasi Goreng (Rp 15.000)");
            System.out.println("2. Mie Ayam (Rp 12.000)");
            System.out.println("3. Es Teh (Rp 3.000)");
            System.out.print("Masukkan pilihan (1-3): ");

            pilihanMenu = input.nextInt();

            switch (pilihanMenu) {
                case 1:
                    totalHarga += 15000;
                    System.out.println("Nasi Goreng ditambahkan.");
                    break;
                case 2:
                    totalHarga += 12000;
                    System.out.println("Mie Ayam ditambahkan.");
                    break;
                case 3:
                    totalHarga += 3000;
                    System.out.println("Es Teh ditambahkan.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }

            System.out.print("Total sementara: Rp " + totalHarga);
            System.out.print("\nAda tambahan pesanan? (Y/N): ");
            tambahLagi = input.next().charAt(0);
        }

        System.out.println("\nProses Perhitungan Tagihan...");

        double PPN_RATE = 0.11; // 11%
        double SERVICE_RATE = 0.05; // 5%

        long subtotal = totalHarga;
        long ppn = (long) (subtotal * PPN_RATE);
        long service = (long) (subtotal * SERVICE_RATE);
        long totalTagihan = subtotal + ppn + service;

        Locale indonesia = new Locale("id", "ID");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(indonesia);

        System.out.println("Subtotal: " + formatter.format(subtotal));
        System.out.println("PPN (11%): " + formatter.format(ppn));
        System.out.println("Service (5%): " + formatter.format(service));
        System.out.println("Total Tagihan: " + formatter.format(totalTagihan));

        input.close();
    }
}