import java.util.Scanner;

public class TokoSepatu07 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner (System.in);

        String kategori, merk;
        int ukuran;
        double harga = 0;

        System.out.print("Masukkan merk sepatu = ");
        merk = input07.nextLine();
        System.out.print("Masukkan kategori sepatu = ");
        kategori = input07.nextLine();
        System.out.print("Masukkan ukuran = ");
        ukuran = input07.nextInt();

        if (merk.equalsIgnoreCase("specs")) {
            if (kategori.equalsIgnoreCase("slip on")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 800000;
                    }
                } else {
                    System.out.println("Ukuran tidak tersedia");
                }
            } else if (kategori.equalsIgnoreCase("high top")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1200000;
                    }
                } else {
                    System.out.println("Ukuran tidak tersedia");
                }
            } else {
                System.out.println("Kategori tidak tersedia");
            }
        } else if (merk.equalsIgnoreCase("910")) {
            if (kategori.equalsIgnoreCase("woman")) {
                if (ukuran >= 36) {
                    if (ukuran <= 41) {
                        harga = 1000000;                       
                    }
                } else {
                    System.out.println("Ukuran tidak tersedia");
                }
            } else if (kategori.equalsIgnoreCase("man")) {
                if (ukuran >= 41) {
                    if (ukuran <= 44) {
                        harga = 1800000;
                    }
                } else {
                    System.out.println("Ukuran tidak tersedia");
                }
            } else {
                System.out.println("Kategori tidak tersedia");
            }
        } else if (merk.equalsIgnoreCase("ortus")) {
            if (kategori.equalsIgnoreCase("kids")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 750000;
                    }
                } else {
                    System.out.println("Ukuran tidak tersedia");
                }
            } else if (kategori.equalsIgnoreCase("adult")){
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1500000;
                    }
                } else {
                    System.out.println("Ukuran tidak tersedia");
                }
            } else {
                System.out.println("Kategori tidak tersedia");
            }
        } else {
            System.out.println("Merk tidak tersedia");
        }

        System.out.println("Harga sepatu = " + harga);
    }
}
