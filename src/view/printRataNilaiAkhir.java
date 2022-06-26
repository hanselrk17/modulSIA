package view;
import controller.hitungNilaiAkhir;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.user;

public class printRataNilaiAkhir {
    public printRataNilaiAkhir(ArrayList<user> user) {
        String kodeMatkul = JOptionPane.showInputDialog(null, "masukkan kode matkul", "print rata-rata nilai akhir", JOptionPane.QUESTION_MESSAGE);
        if (kodeMatkul != null) {
            hitungNilaiAkhir nilai = new hitungNilaiAkhir();
            double nilaiRataRataAkhir = nilai.hitungRataRataNA(user, kodeMatkul);
            if (nilaiRataRataAkhir != 0) {
                JOptionPane.showMessageDialog(null, "rata-rata nilai akhir: " + nilaiRataRataAkhir, "print rata-rata nilai akhir", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "matkul yang ada didata user tidak ditemukan", "eror", 0);
            }
        }
    }
}