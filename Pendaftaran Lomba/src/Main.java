import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kuota = 5;

        System.out.println("PENDAFTARAN LOMBA");
        System.out.println("Sisa kuota pendaftaran: " + kuota);

        while (kuota > 0) {
            System.out.print("Masukkan nama pendaftar: ");
            String nama = input.nextLine();

            kuota--;

            System.out.println("Pendaftaran atas nama " + nama + " berhasil.");

            if (kuota > 0) {
                System.out.println("Sisa kuota sekarang: " + kuota);
            } else {
                System.out.println("Kuota telah habis.");
            }
        }

        System.out.println("PENDAFTARAN DITUTUP KUOTA SUDAH PENUH.");

        input.close();
    }
}