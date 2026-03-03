package soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Mahasiswa[] daftar = new Mahasiswa[3];

        daftar[0] = new Mahasiswa("Budi Santoso", "2440002", "Sistem Informasi", 3.40);
        daftar[1] = new Mahasiswa("Andi Pratama", "2440001", "Teknik Informatika", 3.75);
        daftar[2] = new Mahasiswa("Joni Suhartono", "2440004", "Teknik Industri", 2.80);

        Scanner input = new Scanner(System.in);
        boolean ulang = true;

        while (ulang) {

            System.out.print("\nMasukkan NIM mahasiswa yang ingin diupdate: ");
            String nimCari = input.nextLine();

            Mahasiswa ditemukan = null;

            // Cari mahasiswa
            for (Mahasiswa m : daftar) {
                if (m.getNim().equals(nimCari)) {
                    ditemukan = m;
                    break;
                }
            }

            if (ditemukan != null) {
                System.out.print("Masukkan IPK baru: ");
                double ipkBaru = Double.parseDouble(input.nextLine());

                ditemukan.updateIpk(ipkBaru);

                System.out.println("Data berhasil diperbarui!\n");
                System.out.println("=== Data Mahasiswa ===");
                ditemukan.showInfo();
            } else {
                System.out.println("Maaf, data yang anda cari tidak tersedia.");
            }

            // Tanya apakah mau ulang
            System.out.print("\nApakah ingin mencoba lagi? (y/n): ");
            String jawab = input.nextLine();

            if (!jawab.equalsIgnoreCase("y")) {
                ulang = false;
            }
        }

        System.out.println("Program selesai.");
        input.close();
    }
}