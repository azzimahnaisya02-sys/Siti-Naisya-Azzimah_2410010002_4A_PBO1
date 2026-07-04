package Manajemen_Inventaris_Toko_Sederhana;

public class Produk {
    private String nama;
    private double harga;

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() { return nama; }
    public double getHarga() { return harga; }

    public void setHarga(double harga) { this.harga = harga; }

    public void tampilInfo() {
        System.out.println("Produk: " + nama + ", Harga: " + harga);
    }
}
    

