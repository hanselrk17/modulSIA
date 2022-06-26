package view;
import controller.dataUser;
import controller.hitungPendapatanPekerja;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.staff;
import model.user;

public class printPendapatanStaff {
    public printPendapatanStaff(ArrayList<user> user) {
        String nik = JOptionPane.showInputDialog(null, "masukkan NIK", "print pendapatan staff", JOptionPane.QUESTION_MESSAGE);
        if (nik != null) {
            dataUser data = new dataUser();
            staff staff = data.cariDataByNIK(user, nik);
            hitungPendapatanPekerja hitung = new hitungPendapatanPekerja();
            double pendapatan = hitung.hitungPendapatanStaff(staff);
            JOptionPane.showMessageDialog(null, "total pendapatan: Rp " + pendapatan, "print pendapatan staff", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "staff yang dicari tidak ditemukan", "eror", 0);
        }
    }
}