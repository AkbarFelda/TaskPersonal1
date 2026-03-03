package soal1;

public class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    double ipk;

    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.jurusan = jurusan;
        this.nim = nim;
        this.ipk = ipk;
    }

    public void showInfo(){
        System.out.println("Nama: "+ nama);
        System.out.println("NIM: "+ nim);
        System.out.println("Jurusan: "+ jurusan);
        System.out.println("IPK: "+ ipk);
        System.out.println();
    }
};

