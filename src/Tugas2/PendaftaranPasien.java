package Tugas2;

/**
 *Kelas ini digunakan untuk mencatat data pendaftaran pasien di rumah sakit.
 * Menyimpan nama pasien, nama dokter, biaya dokter, dan biaya administrasi.
 * Dilengkapi dengan method untuk menampilkan data pasien dan menghitung total biaya.
 *  @author Vira
 *  @version 1.0
 */

public class PendaftaranPasien {
    /** Biaya administrasi default */
    public static final int BIAYA_ADMIN_DEFAULT = 25000;
    /** Biaya dokter default */
    public static final int BIAYA_DOKTER_DEFAULT = 100000;
    private String namaPasien;
    private String namaDokter;
    private double biayaDokter;
    private double biayaAdmin;

    // Encapsulate Field

    /**
     * Mengambil nama pasien.
     * @return nama pasien
     */
    public String getNamaPasien() {
        return namaPasien;
    }

    /**
     * Mengatur nama pasien.
     * @param namaPasien nama pasien
     */

    public void setNamaPasien(String namaPasien) {
        this.namaPasien = namaPasien;
    }

    /**
     * Mengambil nama dokter.
     * @return nama dokter
     */

    public String getNamaDokter() {
        return namaDokter;
    }

    /**
     * Mengatur nama dokter.
     * @param namaDokter nama dokter
     */

    public void setNamaDokter(String namaDokter) {
        this.namaDokter = namaDokter;
    }

    /**
     * Mengambil biaya dokter.
     * @return biaya dokter
     */

    public double getBiayaDokter() {
        return biayaDokter;
    }

    /**
     * Mengatur biaya dokter.
     * @param biayaDokter biaya dokter
     */

    public void setBiayaDokter(double biayaDokter) {
        this.biayaDokter = biayaDokter;
    }

    /**
     * Mengambil biaya administrasi.
     * @return biaya administrasi
     */

    public double getBiayaAdmin() {
        return biayaAdmin;
    }

    /**
     * Mengatur biaya administrasi.
     * @param biayaAdmin biaya administrasi
     */

    public void setBiayaAdmin(double biayaAdmin) {
        this.biayaAdmin = biayaAdmin;
    }

    /**
     * Konstruktor untuk membuat objek pasien baru.
     * @param namaPasien nama pasien
     * @param namaDokter nama dokter
     * @param biayaDokter biaya dokter
     * @param biayaAdmin biaya administrasi
     */

    public PendaftaranPasien(String namaPasien, String namaDokter, double biayaDokter, double biayaAdmin) {
        this.setNamaPasien(namaPasien);
        this.setNamaDokter(namaDokter);
        this.setBiayaDokter(biayaDokter);
        this.setBiayaAdmin(biayaAdmin);
    }

    /**
     * Menampilkan data pasien beserta total pembayaran.
     */

    // Rename Method
    public void printDataPasien() {
        System.out.println("Nama Pasien: " + getNamaPasien());
        System.out.println("Dokter: " + getNamaDokter());
        System.out.println("Biaya Dokter: " + getBiayaDokter());
        System.out.println("Biaya Administrasi: " + getBiayaAdmin());
        System.out.println("Total Pembayaran: " + hitungTotalBiaya());
    }

    /**
     * Menghitung total biaya dokter dan administrasi.
     * @return total biaya
     */

    // Extract Method
    private double hitungTotalBiaya() {
        double total = getBiayaDokter() + getBiayaAdmin();
        return total;
    }

}

