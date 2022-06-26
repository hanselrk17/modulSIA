package view;
import controller.cariMK;
import controller.hitungMahasiswaGagal;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.user;
import model.mataKuliah;

public class printMahasiswaGagal {
    public printMahasiswaGagal(ArrayList<user> user, ArrayList<mataKuliah> matkul) {
        String codeMK = JOptionPane.showInputDialog(null, "masukkan code mata kuliah", "print jumlah mahasiswa gagal", JOptionPane.QUESTION_MESSAGE);
        if (codeMK != null) {
            cariMK cariMK = new cariMK();
            String namaMK = cariMK.cariCodeMK(matkul, codeMK);
            if (!namaMK.equals("")) {
                hitungMahasiswaGagal hitungMhsGagal = new hitungMahasiswaGagal();
                int[] mahasiswaGagal = hitungMhsGagal.hitungMhsGagal(user, codeMK);
                JOptionPane.showMessageDialog(null, "<" + mahasiswaGagal[0] + "> dari <" + mahasiswaGagal[1] + ">" + " gagal pada mata kuliah <" + namaMK + ">", "print jumlah mahasiswa gagal", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "mata kuliah yang ada didata user tidak ditemukan", "eror", 0);
            }
        }
    }
}