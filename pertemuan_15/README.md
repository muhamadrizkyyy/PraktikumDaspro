# 🧪 PRAKTIKUM 11

Berisi hasil percobaan dari praktikum dasar pemrograman minggu ke 11

## 👤 Identitas Mahasiswa

| Keterangan | Data                  |
| ---------- | --------------------- |
| **Nama**   | Muhamad Rizky Hamdani |
| **NIM**    | 254107020027          |
| **Absen**  | 17                    |

## ✏️ Jawaban

### Jawaban Percobaan 2.1

1. fungsi yang memamnggil dirinya sendiri sehingga terjadi proses pemanggilan akan terjadi berulang - ulang
2. secara output sama. pada fungsi faktorialRekursif menggunakan pendekatan fungsi rekursif yang akan menghitung nilai faktorial dari sebuah bilangan dengan cara memanggil dirinya sendiri. Sedangkan pada fungsi faktorialIterasi menggunakan metode perulangan untuk menghitung nilai faktorial sesuai bilangan yang diinputkan user

### Jawaban Percobaan 2.2

1. fungsi rekursif akan terus menjalankan proses hingga mencapai base case nya yakni parameter y = 0 dan akan mengembalikan nilai 1.
2.

### Jawaban Percobaan 2.3

1. base case nya adalah ketika tahun bernilai 0 sehingga fungsi hitungLaba akan mengembalikan nilai saldo. kemudian untuk recursion call yakni pada bagian blok else

```java
return (1.11 * hitungLaba(saldo, tahun - 1));
```

2. pertama di cek tahun apakah sama dengan 0, jika tidak maka akan masuk ke blok else yakni (1.11 _ (1.11 _ (1.11 _ 100000))) 100000 diperoleh dari hasil return ketika tahun bernilai 0. kemudian dimulai perhitungan dari 1.11 _ 100000 = 111000, kemudian 111000 _ 1.11 = 122010, dan yang terakhir adalah 122010 _ 1.11 yang kemudian nilainya di return dan menghasilkan 135431
