package controller;
import java.util.ArrayList;
import model.mahasiswa;
import model.magister;
import model.sarjana;
import model.staff;
import model.user;
import model.mataKuliahAmbil;

public class dataUser {
    public dataUser() {
    }

    public user dataUserDicari(ArrayList<user> user, String nama) {
        for (user object : user) {
            if (object.getNama().equals(nama)) {
                return object;
            }
        }
        return null;
    }

    public user cariDataByNIM(ArrayList<user> user, String NIM) {
        for (user object : user) {
            if (object instanceof mahasiswa) {
                if (((mahasiswa) object).getNIM().equals(NIM)) {
                    return object;
                }
            }
        }
        return null;
    }

    public staff cariDataByNIK(ArrayList<user> user, String NIK) {
        for (user object : user) {
            if (object instanceof staff) {
                if (((staff) object).getNIK().equals(NIK)) {
                    return (staff) object;
                }
            }
        }
        return null;
    }

    public int[] cariNilaiMK(mahasiswa mahasiswa, String mk) {
        int[] nilai = {0, 0, 0};
        if (mahasiswa instanceof sarjana) {
            sarjana sarjana = (sarjana) mahasiswa;
            mataKuliahAmbil matkul = sarjana.getMatakuliah(mk);
            if (matkul != null) {
                nilai[0] = matkul.getNilai1();
                nilai[1] = matkul.getNilai2();
                nilai[2] = matkul.getNilai3();

            }
        } else {
            magister magister = (magister) mahasiswa;
            mataKuliahAmbil matkul = magister.getMatakuliah(mk);
            if (matkul != null) {
                nilai[0] = matkul.getNilai1();
                nilai[1] = matkul.getNilai2();
                nilai[2] = matkul.getNilai3();
            }
        }
        return nilai;
    }
}