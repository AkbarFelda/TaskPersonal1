package soal3;

public class Mahasiswa {

    private String nama;
    private String nim;
    private String jurusan;
    private double ipk;

    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    public String checkApproval() {
        return (ipk >= 3.00) ? "Lulus" : "Belum Lulus";
    }

    public String calculatePredicate() {
        if (ipk >= 3.75) return "Dengan Pujian";
        else if (ipk >= 3.50) return "Sangat Memuaskan";
        else if (ipk >= 3.00) return "Memuaskan";
        else return "Perlu Perbaikan";
    }

    public void tampilkanInfo() {
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("IPK: " + ipk);
        System.out.println("Status: " + checkApproval());
        System.out.println("Predikat: " + calculatePredicate());
    }
}