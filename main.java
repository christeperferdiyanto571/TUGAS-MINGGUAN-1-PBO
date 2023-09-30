import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulangi;

        do {
            int m, n;
            System.out.print("Masukkan jumlah baris matriks: ");
            m = input.nextInt();
            System.out.print("Masukkan jumlah kolom matriks: ");
            n = input.nextInt();

            int[][] nilai = new int[m][n];
            int total = 0;

            // Meminta pengguna untuk memasukkan elemen-elemen matriks.
            System.out.println("Masukkan elemen-elemen matriks:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("Masukkan nilai baris ke-" + (i + 1) + " kolom ke-" + (j + 1) + ": ");
                    nilai[i][j] = input.nextInt();
                    total += nilai[i][j];
                }
            }

            // Menghitung rata-rata nilai matriks.
            double rata_rata = (double) total / (m * n);

            // Menampilkan matriks yang dimasukkan oleh pengguna.
            System.out.println("Matriks yang dimasukkan:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(nilai[i][j] + " ");
                }
                System.out.println();
            }

            // Menampilkan rata-rata nilai matriks.
            System.out.println("Rata-rata nilai matriks: " + rata_rata);

            // Meminta pengguna apakah ingin menghitung rata-rata lagi.
            System.out.print("Hitung rata-rata lagi? (y/n): ");
            ulangi = input.next().charAt(0);
        } while (ulangi == 'y' || ulangi == 'Y');

        input.close();
    }
}
