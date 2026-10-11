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


        totalHarga = jumlahCup * hargaperCup;
        diskon = 0;
        

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }
        
        totalBayar = totalHarga - diskon;

        System.out.println("Total harga: " + totalHarga);
        System.out.println("Total Diskon: " + diskon);
        System.out.println("Total bayar: " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian: Rp" + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang anda kurang: Rp" + kurang);
        }

        sc.close();
    }
}
