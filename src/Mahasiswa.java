public class Mahasiswa {
    // Semua atribut dibuat private (Soal1)
    private String nama;
    private String nim;
    private String jurusan;
    private double ipk; // wajib private (enkapsulasi)

    // Constructor: inisialisasi data mahasiswa (Soal1)
    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // Getter (soal2)
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public double getIpk() {
        return ipk;
    }

    // Setter IPK (dengan validasi) (soal2)
    public void setIpk(double ipk) {
        if (ipk < 0.0 || ipk > 4.0) {
            System.out.println("IPK tidak valid! (harus 0.0 - 4.0). Perubahan dibatalkan.");
            return;
        }
        this.ipk = ipk;
    }

    // Method menampilkan info mahasiswa (soal1)
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("IPK: " + ipk);
    }

    // Method cek kelulusan (soal2)
    public String cekKelulusan() {
        return (ipk >= 3.00) ? "Lulus" : "Belum Lulus";
    }

    // Method update IPK (soal2)
    public void updateIpk(double ipkBaru) {
        setIpk(ipkBaru);
    }

    // Method predikat akademik (soal 3)
    public String hitungPredikat() {
        if (ipk >= 3.75) return "Dengan Pujian";
        if (ipk >= 3.50) return "Sangat Memuaskan";
        if (ipk >= 3.00) return "Memuaskan";
        return "Perlu Perbaikan";
    }
}