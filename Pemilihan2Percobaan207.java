import java.util.Scanner;

public class Pemilihan2Percobaan207 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);

        int pilihan_menu;
        double diskon,harga ,total_bayar;
        String member, pembayaran;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("masukkan angka dari menu yang di pilih = ");
        pilihan_menu = input07.nextInt();
        input07.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input07.nextLine();
        System.out.print("Pembayaran cash / QRIS = ");
        pembayaran = input07.nextLine();
        System.out.println("--------------------------------------");

        if (member.equals("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
                
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            total_bayar = harga - (harga * diskon);
            if (pembayaran.equalsIgnoreCase("QRIS")) {
                System.out.println("Potongan harga(QRIS) = 1000");
                total_bayar = total_bayar - 1000;
                System.out.println("Total Bayar = " + total_bayar);           
            }
            System.out.println("Total bayar setelah diskon = " + total_bayar);
        } else if (member.equals("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
                
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = " + harga);
                
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            if (pembayaran.equals("QRIS")) {
                System.out.println("Potongan harga(QRIS) = 1000");
                harga = harga - 1000;         
            }
            System.out.println("Total bayar" + harga);


        } else {
            System.out.println("Member tidak valid");
        }
        
        System.out.println("--------------------------------------");
    }
}



