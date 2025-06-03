package Pertemuan_14;

public class DatabaseConnection {
    public static final String connectionString; // Konstanta static

    // Static block untuk inisialisasi kompleks
    static {
        String host = "jdbc:mysql://localhost:3306";
        String dbName = "my_database";
        connectionString = host + "/" + dbName;
        System.out.println("Static block: Inisialisasi koneksi database selesai!");
    }
}
