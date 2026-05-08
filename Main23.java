import java.util.Scanner;
public class Main23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS23 antrian = new AntrianKRS23();
        int pilih;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampil Semua");
            System.out.println("4. Tampil Depan");
            System.out.println("5. Tampil Belakang");
            System.out.println("6. Cek Kosong");
            System.out.println("7. Cek Penuh");
            System.out.println("8. Kosongkan");
            System.out.println("9. Jumlah Antrian");
            System.out.println("10. Sudah Proses");
            System.out.println("11. Belum Proses");
            System.out.println("0. Keluar");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
case 1:
    System.out.print("NIM : ");
    String nim = sc.nextLine();
    System.out.print("Nama : ");
    String nama = sc.nextLine();
    System.out.print("Prodi : ");
    String prodi = sc.nextLine();
    System.out.print("Kelas : ");
    String kelas = sc.nextLine();
    Mahasiswa23 mhs =
    new Mahasiswa23(nim, nama, prodi, kelas);
    antrian.enqueue(mhs);
    break;
case 2:
    antrian.dequeue();
    break;
case 3:
    antrian.tampilSemua();
    break;
case 4:
    antrian.tampilDepan();
    break;
case 5:
    antrian.tampilBelakang();
    break;
case 6:
    if (antrian.isEmpty()) {
        System.out.println("Kosong");
        } else {
        System.out.println("Tidak kosong");}
break;
case 7:
    if (antrian.isFull()) {
        System.out.println("Penuh");
        } else {
        System.out.println("Belum penuh"); }
    break;
case 8:
    antrian.clear();
    break;
case 9:
    antrian.jumlahAntrian();
    break;
case 10:
    antrian.jumlahSudahProses();
    break;
case 11:
    antrian.belumProses();
    break;
case 0:
    System.out.println("Selesai");
    break; }
        } while (pilih != 0); } }