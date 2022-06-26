package view;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import model.mataKuliah;
import model.user;
public class mainMenu {
    public mainMenu(ArrayList<user> user, ArrayList<mataKuliah> matkul) {
        boolean selesai = false;
        do {
            int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "pilih menu yang diinginkan\n"
                    + "1. Print Data User \n"
                    + "2. Print Nilai Akhir \n"
                    + "3. Print Rata-rata Nilai Akhir \n"
                    + "4. Print Mahasiswa Tidak Lulus \n"
                    + "5. Print Mata Kuliah & Presensi Mahasiswa \n"
                    + "6. Print Jam Kerja Dosen \n"
                    + "7. Print Total Pendapatan Staff \n"
                    + "8. Exit", "Main Menu", JOptionPane.QUESTION_MESSAGE));
            switch (menu) {
                case 1:
                    new printData(user);
                    break;
                case 2:
                    new printNilaiAkhir(user);
                    break;
                case 3:
                    new printRataNilaiAkhir(user);
                    break;
                case 4:
                    new printMahasiswaGagal(user, matkul);
                    break;
                case 5:
                    new printMatkulPresensi(user);
                    break;
                case 6:
                    new printJamKerjaDosen(user);
                    break;
                case 7:
                    new printPendapatanStaff(user);
                    break;
                case 8:
                    selesai = true;
            }
        } while (!selesai);
    }
}