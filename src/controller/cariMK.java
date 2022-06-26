package controller;
import java.util.ArrayList;
import model.mataKuliah;

public class cariMK {
    public cariMK() {
    }

    public String cariCodeMK(ArrayList<mataKuliah> matkul, String Code) {
        for (mataKuliah mataKuliah : matkul) {
            if (mataKuliah.getKode().equals(Code)) {
                return mataKuliah.getNama();
            }
        }
        return "";
    }
}