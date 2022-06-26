package view;
import controller.dataUser;
import controller.hitungNilaiAkhir;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.user;
import model.doktor;
import model.mahasiswa;

public class printNilaiAkhir {
    public printNilaiAkhir(ArrayList<user> user) {
        dataUser dataMahasiswa = new dataUser();
        String nimMahasiswa = JOptionPane.showInputDialog(null, "masukkan NIM", "print nilai akhir", JOptionPane.QUESTION_MESSAGE);
        if (nimMahasiswa != null) {
            user mahasiswa = dataMahasiswa.cariDataByNIM(user, nimMahasiswa);
            if (mahasiswa != null) {
                hitungNilaiAkhir nilai = new hitungNilaiAkhir();
                double nilaiAkhir = 0;
                if (mahasiswa instanceof doktor) {
                    nilaiAkhir = nilai.hitungNA((doktor) mahasiswa);
                } else {
                    String kodeMatkul = JOptionPane.showInputDialog(null, "masukkan kode matkul", "print nilai akhir", JOptionPane.QUESTION_MESSAGE);
                    if (kodeMatkul != null) {
                        int[] semuaNilai = dataMahasiswa.cariNilaiMK((mahasiswa) mahasiswa, kodeMatkul);
                        nilaiAkhir = nilai.hitungNA(semuaNilai);
                    }
                }
                if (nilaiAkhir != 0) {
                    JOptionPane.showMessageDialog(null, "nilai akhir: " + nilaiAkhir, "print nilai akhir", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "matkul yang ada didata user tidak ditemukan", "eror", 0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "mahasiswa salah", "eror", 0);
            }
        }
    }
}