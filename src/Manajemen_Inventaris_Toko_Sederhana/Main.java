package Manajemen_Inventaris_Toko_Sederhana;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Produk[] daftarProduk = new Produk[2];
        daftarProduk[0] = new Produk("Buku", 5000);
        daftarProduk[1] = new ProdukElektronik("Mouse", 150000);

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < daftarProduk.length; i++) {
            try {
                System.out.println("Masukkan harga baru untuk " + daftarProduk[i].getNama() + ": ");
                double hargaBaru = Double.parseDouble(scanner.nextLine());
                
                if (hargaBaru >= 0) {
                    daftarProduk[i].setHarga(hargaBaru);
                } else {
                    System.out.println("Harga tidak boleh negatif!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input salah, masukkan angka!");
            }
        }

        for (Produk p : daftarProduk) {
            p.tampilInfo();
        }
        
        scanner.close();
    }
}
    

