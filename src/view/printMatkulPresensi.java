package view;
import controller.dataUser;
import controller.printDataUser;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.user;
import model.doktor;

public class printMatkulPresensi {
    public printMatkulPresensi(ArrayList<user> user) {
        String nim = JOptionPane.showInputDialog(null, "masukkan NIM", "print mata kuliah ambil dan presensi", JOptionPane.QUESTION_MESSAGE);
        if (nim != null) {
            dataUser cariData = new dataUser();
            user mahasiswaDicari = cariData.cariDataByNIM(user, nim);
            if (mahasiswaDicari != null) {
                if (!(mahasiswaDicari instanceof doktor)) {
                    printDataUser dataUser = new printDataUser();
                    StringBuilder string = dataUser.printMatkulAmbil(mahasiswaDicari);
                    JOptionPane.showMessageDialog(null, string, "print mata kuliah ambil dan presensi", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "doktor yang dicari tidak memiliki mata kuliah ambil", "Error", 0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "mahasiswa yang dicari tidak ditemukan", "Error", 0);
            }
        }
    }
}