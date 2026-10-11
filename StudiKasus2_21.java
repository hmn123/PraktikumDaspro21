import java.util.Scanner;

public class StudiKasus2_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama Mahasiswa: ");
        String nama = sc.nextLine();
        System.out.print("jenis kegiatan (BELMAWA / BAKORMA / MANDIRI / PKM / LAINNYA): ");
        String jenisKegiatan = sc.nextLine();
        System.out.print("Masukkan jumlah dokumen : ");
        int jumlahDokumen = sc.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("peringkat Juara : ");
            int peringkat = sc.nextInt();

        if (peringkat >= 1 && peringkat <= 3) {
            if (jumlahDokumen == 4) {
                System.out.print("Status : Dokumen lengkap. Dana penghargaan diberikan");
            }else {
                int kurang = 4  - jumlahDokumen;
                System.out.print("Status : Dokumen Tidak lengkap. (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan");
            }
            
        }else {
            System.out.print("Status : Tidak meraih juara 1, 2, atau 3 Dana penghargaan tidak diberikan");

        }
        
        }
    }
 }
