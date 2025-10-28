import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random acak = new Random();

        int angkaRahasia = acak.nextInt(100) + 1;
        int sisaKesempatan = 7;
        boolean sudahMenang = false;

        System.out.println("PERMAINAN TEBAK ANGKA");
        System.out.println("Saya telah memilih angka antara 1 s.d. 100.");
        System.out.println("Anda punya " + sisaKesempatan + " kesempatan untuk menebak.");

        while (sisaKesempatan > 0) {
            System.out.print("Masukkan tebakan Anda: ");
            int tebakan = input.nextInt();

            if (tebakan == angkaRahasia) {
                sudahMenang = true;
                break;
            } else if (tebakan < angkaRahasia) {
                System.out.println("Tebakan terlalu rendah!");
            } else {
                System.out.println("Tebakan terlalu tinggi!");
            }

            sisaKesempatan--;
            if (sisaKesempatan > 0) {
                System.out.println("Sisa kesempatan: " + sisaKesempatan);
            }
        }

        if (sudahMenang) {
            System.out.println("SELAMAT! Anda berhasil menebak angka " + angkaRahasia + ".");
        } else {
            System.out.println("GAME OVER, Anda gagal.");
            System.out.println("Angka rahasia yang benar adalah: " + angkaRahasia);
        }

        input.close();
    }
}