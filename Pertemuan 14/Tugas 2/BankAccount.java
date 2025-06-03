package Pertemuan_14;

/*
 * Studi Kasus:

Dalam aplikasi perbankan, setiap rekening harus memiliki nomor rekening yang unik dan tidak berubah. 
Selain itu, informasi dasar rekening tidak boleh dimodifikasi oleh subclass untuk menghindari penyalahgunaan.

Tugas:

1. Buatlah kelas BankAccount yang memiliki:

- Variabel final accountNumber (String) yang diinisialisasi melalui constructor.

- Variabel balance (double) untuk menyimpan saldo.

- Method deposit(double amount) untuk menambah saldo.

- Method final displayAccountInfo() yang menampilkan nomor rekening dan saldo.

2. Buat subclass SavingsAccount yang mencoba meng-override displayAccountInfo().

- Tuliskan kode yang mengilustrasikan error akibat override method final.

- Diskusikan bagaimana cara menangani kebutuhan khusus pada subclass tanpa mengubah method final.
 */

public class BankAccount {
    private final String accountNumber; // Variabel final
    private double balance;

    // Constructor untuk inisialisasi accountNumber
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method final yang tidak bisa di-override
    public final void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}
