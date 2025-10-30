package Tugas2;

public class Main {
    // Introduce Constant
    public static void main(String[] args) {
        PendaftaranPasien pasien = new PendaftaranPasien("Harvi", "dr. Andi", PendaftaranPasien.BIAYA_DOKTER_DEFAULT, PendaftaranPasien.BIAYA_ADMIN_DEFAULT);
        pasien.printDataPasien();
    }
}
