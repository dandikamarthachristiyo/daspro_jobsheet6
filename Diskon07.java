import java.util.Scanner;

public class Diskon07 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner (System.in);

        String jenisBuku;
        int jumlahBuku;
        double diskon;

        System.out.print("Masukkan jenis buku = ");
        jenisBuku = input07.nextLine();
        System.out.print("Masukkan jumlah buku = ");
        jumlahBuku = input07.nextInt();

        if ((jenisBuku.equalsIgnoreCase("kamus")) || (jenisBuku.equalsIgnoreCase("novel"))) {
            if (jenisBuku.equalsIgnoreCase("kamus")) {
                if (jumlahBuku > 2) {
                    diskon = 0.12;
                } else {
                    diskon = 0.10;
                }
            } else {
                if (jumlahBuku > 3) {
                    diskon = 0.09;
                } else {
                    diskon = 0.08;
                }
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 0.05;
            } else {
                diskon = 0;
            } 
        }
        System.out.println("Total diskon = " + diskon);
    }
}
