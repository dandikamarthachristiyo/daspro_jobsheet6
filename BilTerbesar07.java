import java.util.Scanner;

public class BilTerbesar07 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner (System.in);

        double bil1, bil2, bil3;

        System.out.print("Masukkan bilangan 1 = ");
        bil1 = input07.nextDouble();
        System.out.print("Masukkan bilangan 2 = ");
        bil2 = input07.nextDouble();
        System.out.print("Masukkan bilangan 3 = ");
        bil3 = input07.nextDouble();

        if ((bil1 > bil2) &&  (bil1 > bil3)) {
            System.out.println("Bilangan terbesar = " + bil1);
        } else if ((bil2 > bil1) &&  (bil2 > bil3))  {
            System.out.println("Bilangan terbesar = " + bil2);
        } else {
            System.out.println("Bilangan terbesar = " + bil3);
        }
    }
}
