package Manajemen_Inventaris_Toko_Sederhana;

public class ProdukElektronik extends Produk {
    public ProdukElektronik(String nama, double harga) { super(nama, harga); }
    
    @Override
    public void tampilInfo() {
        System.out.println("Elektronik: " + getNama() + ", Harga: " + getHarga());
    }
}

