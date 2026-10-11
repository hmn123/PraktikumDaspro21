import java.util.Scanner;

public class StudiKasus1_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int hargaperCup = 18000;
        int jumlahCup, uangBayar;
        int totalBayar, diskon, totalHarga;
        int kembalian, kurang;

        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang bayar: ");
        uangBayar =sc.nextInt();

        sc.close();
    }
}
