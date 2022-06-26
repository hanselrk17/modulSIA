package controller;
import java.util.ArrayList;
import model.doktor;
import model.dosenTetap;
import model.dosenHonorer;
import model.karyawan;
import model.magister;
import model.sarjana;
import model.user;
import model.mataKuliahAmbil;
import model.presensi;

public class printDataUser {
    public printDataUser() {
    }

    public StringBuilder printDataUser(user data) {
        StringBuilder string = new StringBuilder();
        string.append("nama : ").append(data.getNama()).append("\n");
        string.append("alamat : ").append(data.getAlamat()).append("\n");
        string.append("TTL : ").append(data.getTTL()).append("\n");
        string.append("telepon : ").append(data.getTelepon()).append("\n");
        string.append("status : ");
        if (data instanceof dosenHonorer) {
            string.append("dosen honorer");
        } else if (data instanceof dosenTetap) {
            string.append("dosen tetap");
        } else if (data instanceof karyawan) {
            string.append("karyawan");
        } else if (data instanceof sarjana) {
            string.append("mahasiswa (sarjana)");
        } else if (data instanceof magister) {
            string.append("mahasiswa (magister)");
        } else if (data instanceof doktor) {
            string.append("mahasiswa (doktor)");
        }
        return string;
    }

    public StringBuilder printMatkulAmbil(user data) {
        ArrayList<mataKuliahAmbil> listMatkul;
        StringBuilder string = new StringBuilder();
        if (data instanceof sarjana) {
            sarjana sarjana = (sarjana) data;
            listMatkul = sarjana.getMatakuliah();
        } else {
            magister magister = (magister) data;
            listMatkul = magister.getMatakuliah();
        }
        for (mataKuliahAmbil matkul : listMatkul) {
            string.append("mata kuliah : ").append(matkul.getMataKuliah().getNama()).append(" (");
            string.append(matkul.getMataKuliah().getKode()).append(")\n");
            string.append("SKS : ").append(matkul.getMataKuliah().getSKS()).append("\n");
            string.append("presensi : \n");
            for (presensi presensi : matkul.getPresensi()) {
                String status = "Hadir";
                if (presensi.getStatus() == 0) {
                    status = "Alpha";
                }
                string.append(presensi.getTanggal()).append(" ").append(status).append("\n");
            }
        }
        return string;
    }
}