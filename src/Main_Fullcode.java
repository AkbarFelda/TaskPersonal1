import java.util.Scanner;

public class Main_Fullcode {

    public static void main(String[] args) {
        // Array of Object (minimal 3, di sini pakai 5 sesuai contoh)
        Mahasiswa[] daftar = new Mahasiswa[5];

        daftar[0] = new Mahasiswa("Andi Pratama", "2440001", "Teknik Informatika", 3.75);
        daftar[1] = new Mahasiswa("Budi Santoso", "2440002", "Sistem Informasi", 3.40);
        daftar[2] = new Mahasiswa("Citra Lestari", "2440003", "Teknik Informatika", 3.90);
        daftar[3] = new Mahasiswa("Joni Suhartono", "2440004", "Teknik Industri", 3.00);
        daftar[4] = new Mahasiswa("Bulan Suci", "2440005", "Akuntansi", 3.20);

        Scanner input = new Scanner(System.in);

        // Menampilkan semua data (Soal 1) + status + predikat (Soal 2 & 3)
        tampilkanSemuaMahasiswa(daftar);

        // Loop agar user bisa coba ulang tanpa run ulang
        boolean ulang = true;
        while (ulang) {
            System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
            String nimCari = input.nextLine().trim();

            Mahasiswa target = cariMahasiswaByNim(daftar, nimCari);

            if (target == null) {
                System.out.println("Maaf, data yang anda cari tidak tersedia.\n");
            } else {
                double ipkBaru = bacaDouble(input);
                target.updateIpk(ipkBaru);

                System.out.println("Data berhasil diperbarui!\n");

                // Tampilkan data mahasiswa yang diupdate + status + predikat
                System.out.println("=== Data Mahasiswa (Setelah Update) ===");
                target.tampilkanInfo();
                System.out.println("Status: " + target.cekKelulusan());
                System.out.println("Predikat: " + target.hitungPredikat());
                System.out.println("IPK terbaru (via getter): " + target.getIpk()); // bukti getter dipakai
                System.out.println();
            }

            System.out.print("Apakah ingin mencoba lagi? (y/n): ");
            String jawab = input.nextLine().trim();
            if (!jawab.equalsIgnoreCase("y")) {
                ulang = false;
            }
            System.out.println();
        }

        System.out.println("Program selesai.");
        input.close();
    }

    // Method bantu: tampilkan seluruh data mahasiswa dengan loop
    private static void tampilkanSemuaMahasiswa(Mahasiswa[] daftar) {
        System.out.println("=== Data Mahasiswa ===");
        for (Mahasiswa m : daftar) {
            m.tampilkanInfo();
            System.out.println("Status: " + m.cekKelulusan());
            System.out.println("Predikat: " + m.hitungPredikat());
            System.out.println();
        }
    }

    // Method bantu: cari mahasiswa berdasarkan NIM
    private static Mahasiswa cariMahasiswaByNim(Mahasiswa[] daftar, String nimCari) {
        for (Mahasiswa m : daftar) {
            if (m.getNim().equals(nimCari)) {
                return m;
            }
        }
        return null;
    }

    // Method bantu: baca input double yang aman (hindari error Scanner)
    private static double bacaDouble(Scanner input) {
        while (true) {
            System.out.print("Masukkan IPK baru (0.0 - 4.0): ");
            String text = input.nextLine().trim();
            try {
                return Double.parseDouble(text);
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Masukkan angka yang benar.\n");
            }
        }
    }
}