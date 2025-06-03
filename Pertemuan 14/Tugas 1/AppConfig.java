package Pertemuan_14;

/*
 * Studi Kasus:

	Dalam sebuah aplikasi, terdapat banyak informasi konfigurasi yang nilainya tidak akan berubah selama runtime. 
Misalnya, URL base, versi aplikasi, dan timeout koneksi.
	Tugas:

1. Buatlah kelas AppConfig yang menyimpan variabel-variabel berikut sebagai konstanta:

- BASE_URL (String) → misal, `"https://www.myapp.com/api"`

- APP_VERSION (String) → misal, "1.0.0"

- DEFAULT_TIMEOUT (int) → misal, 5000 (dalam milidetik)

2. Pastikan variabel-variabel tersebut dideklarasikan dengan modifier static final.

3. Buatlah kelas TestAppConfig dengan method main yang mencetak nilai-nilai konstanta tersebut ke layar.
 */

public class AppConfig {
    // Deklarasi konstanta global dengan static final
    public static final String BASE_URL = "https://www.myapp.com/api";
    public static final String APP_VERSION = "1.0.0";
    public static final int DEFAULT_TIMEOUT = 5000;
}
