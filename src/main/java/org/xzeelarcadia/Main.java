package org.xzeelarcadia;
import java.util.Scanner;

class Buku {
    private String judulBuku;
    private String penulis;
    private int jumlahBuku;
    private int tahunTerbit;
    private String genre;
    private String jenisBuku;

    String BLUE = "\u001B[34m";
    String RESET = "\u001B[0m";

    public Buku(String judulBuku, String penulis, int jumlahBuku, int tahunTerbit, String genre, String jenisBuku) {
        this.judulBuku = judulBuku;
        this.penulis = penulis;
        this.jumlahBuku = jumlahBuku;
        this.tahunTerbit = tahunTerbit;
        this.genre = genre;
        this.jenisBuku = jenisBuku;
    }

    public String getJudulBuku() {
        return this.judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getPenulis() {
        return this.penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getJumlahBuku() {
        return this.jumlahBuku;
    }

    public void setJumlahBuku(int jumlahBuku) {
        this.jumlahBuku = jumlahBuku;
    }

    public int getTahunTerbit() {
        return this.tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getJenisBuku() {
        return this.jenisBuku;
    }

    public void setJenisBuku(String jenisBuku) {
        this.jenisBuku = jenisBuku;
    }

    public void tampilkanInfo() {
        System.out.println("Judul Buku\t\t\t: " + BLUE + getJudulBuku() + RESET);
        System.out.println("Penulis\t\t\t\t: " + BLUE + getPenulis() + RESET);
        System.out.println("Jumlah Buku\t\t\t: " + BLUE + getJumlahBuku() + RESET);
        System.out.println("Tahun Terbit\t\t: " + BLUE + getTahunTerbit() + RESET);
        System.out.println("Genre\t\t\t\t: " + BLUE + getGenre() + RESET);
        System.out.println("Jenis Buku\t\t\t: " + BLUE + getJenisBuku() + RESET);
        System.out.println();
    }
}

    public class Main {
        private static final int MAX_BUKU = 100;
        private static Buku[] daftarBuku = new Buku[MAX_BUKU];
        private static int jumlahBuku = 0;
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            String RED = "\u001B[31m";
            String GREEN = "\u001B[32m";
            String BLUE = "\u001B[34m";
            String RESET = "\u001B[0m";

            System.out.println(BLUE + "██████╗  █████╗ ████████╗ █████╗     ██████╗ ███████╗██████╗ ██████╗ ██╗   ██╗███████╗\n" +
                    "██╔══██╗██╔══██╗╚══██╔══╝██╔══██╗    ██╔══██╗██╔════╝██╔══██╗██╔══██╗██║   ██║██╔════╝\n" +
                    "██║  ██║███████║   ██║   ███████║    ██████╔╝█████╗  ██████╔╝██████╔╝██║   ██║███████╗\n" +
                    "██║  ██║██╔══██║   ██║   ██╔══██║    ██╔═══╝ ██╔══╝  ██╔══██╗██╔═══╝ ██║   ██║╚════██║\n" +
                    "██████╔╝██║  ██║   ██║   ██║  ██║    ██║     ███████╗██║  ██║██║     ╚██████╔╝███████║\n" +
                    "╚═════╝ ╚═╝  ╚═╝   ╚═╝   ╚═╝  ╚═╝    ╚═╝     ╚══════╝╚═╝  ╚═╝╚═╝      ╚═════╝ ╚══════╝\n" +
                    "\n                      Coded by Raihan, Widi, Chen su\n" + RESET);

            System.out.println("                Selamat datang di program " + BLUE + "Data Buku Perpustakaan" + RESET + "!\n");

            int pilihan;

            do {
                System.out.println("—————————— MENU PERPUSTAKAAN ——————————");
                System.out.println("1. Tambah Buku Pelajaran");
                System.out.println("2. Tambah Buku Novel");
                System.out.println("3. Total Buku");
                System.out.println("4. Tampil Semua Buku");
                System.out.println("5. Cari Buku Berdasarkan Judul");
                System.out.println("6. Hapus Buku Berdasarkan Judul");
                System.out.println("7. Edit Buku");
                System.out.println("8. Exit");
                System.out.print("Pilih menu (1-8) : ");

                pilihan = scanner.nextInt();
                scanner.nextLine();

                switch (pilihan) {
                    case 1:
                        tambahBuku("Pelajaran");
                        break;
                    case 2:
                        tambahBuku("Novel");
                        break;
                    case 3:
                        tampilkanTotal();
                        break;
                    case 4:
                        tampilkanSemuaBuku();
                        break;
                    case 5:
                        cariBuku();
                        break;
                    case 6:
                        hapusBuku();
                        break;
                    case 7:
                        editBuku();
                        break;
                    case 8:
                        System.out.println(GREEN + "\n👌 Program berhenti. Terima kasih!" + RESET);
                        break;
                    default:
                        System.out.println(RED + "\n⛔ Pilihan tidak valid! Silakan pilih antara 1-8.\n" + RESET);
                }
            } while (pilihan != 8);

            scanner.close();
        }

        private static void tambahBuku(String jenis) {
            String RED = "\u001B[31m";
            String GREEN = "\u001B[32m";
            String RESET = "\u001B[0m";

            System.out.print("\n🖊️ Masukkan Judul Buku : ");
            String judul = scanner.nextLine();

            System.out.print("️🖊️ Masukkan Nama Penulis : ");
            String penulis = scanner.nextLine();

            System.out.print("🖊️ Masukkan Jumlah Buku : ");
            int jumlah = scanner.nextInt();

            System.out.print("🖊️ Masukkan Tahun Terbit : ");
            int tahun = scanner.nextInt();
            scanner.nextLine();

            System.out.print("🖊️ Masukkan Genre : ");
            String genre = scanner.nextLine();

            Buku bukuBaru = new Buku(judul, penulis, jumlah, tahun, genre, jenis);
            if (jumlahBuku < MAX_BUKU) {
                daftarBuku[jumlahBuku] = bukuBaru;
                jumlahBuku++;
                System.out.println(GREEN + "\n✅ Buku " + jenis + " berhasil ditambahkan!\n" + RESET);
            } else {
                System.out.println(RED + "\n⛔ Kapasitas buku sudah penuh!\n" + RESET);
            }
        }

        private static void tampilkanTotal() {
            String RED = "\u001B[31m";
            String GREEN = "\u001B[32m";
            String BLUE = "\u001B[34m";
            String RESET = "\u001B[0m";

            int pelajaran = 0, novel = 0;
            for (int i = 0; i < jumlahBuku; i++) {
                if (daftarBuku[i].getJenisBuku().equals("Pelajaran")) {
                    pelajaran++;
                } else if (daftarBuku[i].getJenisBuku().equals("Novel")) {
                    novel++;
                }
            }

            System.out.println("\n—————————— JUMLAH JENIS BUKU ——————————");
            System.out.println("⬆️ Jumlah Buku Pelajaran\t: " + BLUE + pelajaran + RESET);
            System.out.println("⬆️ Jumlah Buku Novel\t\t: " + BLUE + novel + RESET);
            System.out.println("⬆️ Total Semua Buku\t\t\t: " + BLUE + jumlahBuku + RESET + "\n");
        }

        private static void tampilkanSemuaBuku() {
            String RED = "\u001B[31m";
            String GREEN = "\u001B[32m";
            String RESET = "\u001B[0m";

            System.out.println("\n—————————— DATA SEMUA BUKU ——————————");
            if (jumlahBuku == 0) {
                System.out.println(RED + "⛔ Belum ada data buku.\n" + RESET);
            } else {
                for (int i = 0; i < jumlahBuku; i++) {
                    System.out.println("Buku ke-" + (i + 1) + ":");
                    daftarBuku[i].tampilkanInfo();
                }
            }
        }

        private static void cariBuku() {
            String RED = "\u001B[31m";
            String GREEN = "\u001B[32m";
            String RESET = "\u001B[0m";

            System.out.print("\n🖊️ Masukkan judul buku yang dicari : ");
            String judulCari = scanner.nextLine();

            boolean ditemukan = false;
            for (int i = 0; i < jumlahBuku; i++) {
                if (daftarBuku[i].getJudulBuku().toLowerCase().contains(judulCari.toLowerCase())) {
                    System.out.println(GREEN + "\n✅ Buku ditemukan :" + RESET);
                    daftarBuku[i].tampilkanInfo();
                    ditemukan = true;
                }
            }

            if (!ditemukan) {
                System.out.println(RED + "\n⛔ Buku dengan judul '" + judulCari + "' tidak ditemukan.\n" + RESET);
            }
        }

        private static void hapusBuku() {
            String RED = "\u001B[31m";
            String GREEN = "\u001B[32m";
            String RESET = "\u001B[0m";

            System.out.print("\n🖊️ Masukkan judul buku yang akan dihapus : ");
            String judulHapus = scanner.nextLine();

            int index = -1;
            for (int i = 0; i < jumlahBuku; i++) {
                if (daftarBuku[i].getJudulBuku().equalsIgnoreCase(judulHapus)) {
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                for (int i = index; i < jumlahBuku - 1; i++) {
                    daftarBuku[i] = daftarBuku[i + 1];
                }
                jumlahBuku--;
                System.out.println(GREEN + "\n✅ Buku dengan judul '" + judulHapus + "' berhasil dihapus.\n" + RESET);
            } else {
                System.out.println(RED + "\n⛔ Buku dengan judul '" + judulHapus + "' tidak ditemukan.\n" + RESET);
            }
        }

        private static void editBuku() {
            String RED = "\u001B[31m";
            String GREEN = "\u001B[32m";
            String RESET = "\u001B[0m";

            System.out.print("\n🖊️ Masukkan judul buku yang akan diedit : ");
            String judulEdit = scanner.nextLine();

            int index = -1;
            for (int i = 0; i < jumlahBuku; i++) {
                if (daftarBuku[i].getJudulBuku().equalsIgnoreCase(judulEdit)) {
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                System.out.println("\n📝 Data Buku Saat Ini :");
                daftarBuku[index].tampilkanInfo();

                System.out.print("🖊️ Masukkan Judul Buku Baru : ");
                String judulBaru = scanner.nextLine();

                System.out.print("️🖊️ Masukkan Nama Penulis Baru : ");
                String penulisBaru = scanner.nextLine();

                System.out.print("🖊️ Masukkan Jumlah Buku Baru : ");
                int jumlahBaru = scanner.nextInt();

                System.out.print("🖊️ Masukkan Tahun Terbit Baru : ");
                int tahunBaru = scanner.nextInt();
                scanner.nextLine();

                System.out.print("🖊️ Masukkan Genre Baru : ");
                String genreBaru = scanner.nextLine();

                daftarBuku[index].setJudulBuku(judulBaru);
                daftarBuku[index].setPenulis(penulisBaru);
                daftarBuku[index].setJumlahBuku(jumlahBaru);
                daftarBuku[index].setTahunTerbit(tahunBaru);
                daftarBuku[index].setGenre(genreBaru);

                System.out.println(GREEN + "\n✅ Data buku berhasil diupdate!\n" + RESET);
            } else {
                System.out.println(RED + "\n⛔ Buku dengan judul '" + judulEdit + "' tidak ditemukan.\n" + RESET);
            }
        }
    }

