package view;
import controller.dataUser;
import controller.printDataUser;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.user;
public class printData {
    public printData(ArrayList<user> user){
        String nama = JOptionPane.showInputDialog(null, "masukkan nama user", "print data user",JOptionPane.QUESTION_MESSAGE);
        if(nama != null){
            dataUser dataUserDicari = new dataUser();
            user data = dataUserDicari.dataUserDicari(user,nama);
            if(data == null){
                JOptionPane.showMessageDialog(null, "data tidak ada", "eror", 0);
            } else {
                printDataUser dataUserPrint = new printDataUser();
                StringBuilder string = dataUserPrint.printDataUser(data);
                JOptionPane.showMessageDialog(null, string, "print data user", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}