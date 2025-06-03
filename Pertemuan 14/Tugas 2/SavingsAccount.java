package Pertemuan_14;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    // Error: Cannot override the final method from BankAccount
    /*
    @Override
    public void displayAccountInfo() {
        System.out.println("Savings Account Information");
    }
    */
    
    // Alternatif tanpa meng-override method final
    public void displaySavingsInfo() {
        super.displayAccountInfo(); // Memanggil method final dari parent
        System.out.println("Account Type: Savings");
    }
}

/*
*	Diskusi Error:

Compiler akan menampilkan error: displayAccountInfo() in SavingsAccount cannot override displayAccountInfo() in BankAccount; overridden method is final

Solusi: Gunakan komposisi (panggil method parent via super) atau buat method baru di subclass untuk fungsionalitas tambahan.
*/