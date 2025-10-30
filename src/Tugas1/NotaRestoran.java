package Tugas1;
import java.util.Scanner;

public class NotaRestoran {
    public static void main(String[] args) { // ← hasil autocomplete 'psvm'
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan: "); // ← hasil autocomplete 'sout'
        String nama = input.nextLine();

        System.out.print("Masukkan jumlah menu yang dipesan: ");
        int jumlahMenu = input.nextInt();
        input.nextLine(); // bersihkan buffer

        String[] daftarMenu = new String[jumlahMenu];
        double[] hargaMenu = new double[jumlahMenu];

        // ← hasil autocomplete 'fori'
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Masukkan nama makanan ke-" + (i + 1) + ": ");
            daftarMenu[i] = input.nextLine();

            System.out.print("Masukkan harga makanan ke-" + (i + 1) + ": ");
            hargaMenu[i] = input.nextDouble();
            input.nextLine();
        }

        double total = 0;
        for (int i = 0; i < jumlahMenu; i++) {
            total += hargaMenu[i];

        }

        System.out.println("\n===== NOTA PEMESANAN =====");
        System.out.println("Nama Pelanggan : " + nama);
        System.out.println("Total Bayar    : Rp" + total);
    }
}
