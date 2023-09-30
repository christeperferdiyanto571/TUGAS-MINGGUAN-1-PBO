#include <iostream>
using namespace std;

int main() {
    char ulangi;

    do {
        int m, n;
        cout << "Masukkan jumlah baris matriks: ";
        cin >> m;
        cout << "Masukkan jumlah kolom matriks: ";
        cin >> n;

        int nilai[m][n];
        int total = 0;

        // Meminta pengguna untuk memasukkan elemen-elemen matriks.
        cout << "Masukkan elemen-elemen matriks:" << endl;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                cout << "Masukkan nilai baris ke-" << i + 1 << " kolom ke-" << j + 1 << ": ";
                cin >> nilai[i][j];
                total += nilai[i][j];
            }
        }

        // Menghitung rata-rata nilai matriks.
        double rata_rata = static_cast<double>(total) / (m * n);

		system("cls");
        // Menampilkan matriks yang dimasukkan oleh pengguna.
        cout << "Matriks yang dimasukkan:" << endl;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                cout << nilai[i][j] << " ";
            }
            cout << endl;
        }

        // Menampilkan rata-rata nilai matriks.
        cout << "Rata-rata nilai matriks: " << rata_rata << endl;

        // Meminta pengguna apakah ingin menghitung rata-rata lagi.
        cout << "Hitung rata-rata lagi? (y/n): ";
        cin >> ulangi;
    } while (ulangi == 'y' || ulangi == 'Y');

    return 0;
}
