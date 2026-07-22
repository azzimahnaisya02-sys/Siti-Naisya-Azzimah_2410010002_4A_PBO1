# 📦 Manajemen Inventaris Toko Sederhana

Program Java sederhana untuk mengelola data produk pada sebuah toko.

Project ini dibuat sebagai tugas mata kuliah **Pemrograman Berorientasi Objek (PBO)** menggunakan bahasa **Java** dengan IDE **Apache NetBeans**.

---

## 👤 Identitas

- **Nama:** Siti Naisya Azzimah
- **NIM:** 2410010002
- **Kelas:** 4A
- **Mata Kuliah:** Pemrograman Berorientasi Objek (PBO)

---

## 📌 Deskripsi Program

Program digunakan untuk mengelola data produk sederhana.

Pengguna diminta memasukkan harga baru dari setiap produk, kemudian program akan menampilkan informasi produk yang telah diperbarui.

Program juga menerapkan validasi input sehingga apabila pengguna memasukkan data yang bukan angka, program akan menampilkan pesan kesalahan.

---

## 🚀 Fitur Program

- Input harga produk
- Menampilkan informasi produk
- Validasi input angka
- Update harga produk
- Mendukung produk elektronik menggunakan pewarisan class

---

## 📚 Konsep PBO yang Digunakan

### 1. Class
- Produk
- ProdukElektronik
- Main

### 2. Object
```java
Produk[] daftarProduk = new Produk[2];
```

### 3. Encapsulation

Attribute dibuat private.

```java
private String namaProduk;
private double harga;
```

Menggunakan Getter dan Setter.

### 4. Constructor

```java
public Produk(String nama, double harga)
```

### 5. Inheritance

```java
public class ProdukElektronik extends Produk
```

### 6. Polymorphism

Method `tampilInfo()` dioverride.

```java
@Override
public void tampilInfo()
```

### 7. Array Object

```java
Produk[] daftarProduk
```

### 8. Perulangan

Menggunakan perulangan `for`.

### 9. Seleksi

```java
if(hargaBaru >= 0)
```

### 10. Exception Handling

```java
try{
...
}catch(NumberFormatException e){
...
}
```

### 11. Input Output

Menggunakan Scanner.

```java
Scanner scanner = new Scanner(System.in);
```

---

## 📂 Struktur Project

```
src/
└── Manajemen_Inventaris_Toko_Sederhana/
    ├── Main.java
    ├── Produk.java
    └── ProdukElektronik.java
```

---

## ▶ Cara Menjalankan Program

1. Buka project menggunakan Apache NetBeans.
2. Jalankan file `Main.java`.
3. Masukkan harga baru setiap produk.
4. Program akan menampilkan data produk yang telah diperbarui.

---

## 💻 Contoh Output

```
Masukkan harga baru untuk Buku:
7000

Masukkan harga baru untuk Mouse:
175000

Produk: Buku, Harga: 7000.0
Elektronik: Mouse, Harga: 175000.0
```

---

## 🛠 Bahasa Pemrograman

- Java

## 🧰 IDE

- Apache NetBeans

---

## 📖 Kesimpulan

Project ini merupakan implementasi dasar konsep Pemrograman Berorientasi Objek (PBO) menggunakan Java. Program telah menerapkan berbagai konsep penting seperti Encapsulation, Inheritance, Polymorphism, Constructor, Object, Array, Percabangan, Perulangan, serta Exception Handling dalam sebuah studi kasus sederhana mengenai manajemen inventaris toko.

---

**Terima Kasih**
