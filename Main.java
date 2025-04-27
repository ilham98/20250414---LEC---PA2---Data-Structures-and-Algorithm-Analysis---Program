import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentDatabase database = new StudentDatabase();
        int choice;

        do {
            System.out.println("1. Push data mahasiswa");
            System.out.println("2. Menampilkan semua daftar mahasiswa");
            System.out.println("3. Pop semua data mahasiswa");
            System.out.println("4. Keluar dari program");
            System.out.print("Pilih langkah: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String name = scanner.nextLine();
                    System.out.print("Masukkan Jurusan: ");
                    String major = scanner.nextLine();
                    database.pushStudent(nim, name, major);
                    break;
                case 2:
                    database.displayStudents();
                    break;
                case 3:
                    database.popAllStudents();
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
