package controller;
import java.util.ArrayList;
import model.mahasiswa;
import model.sarjana;
import model.magister;
import model.user;

public class hitungMahasiswaGagal {
    public hitungMahasiswaGagal() {
    }

    public int[] hitungMhsGagal(ArrayList<user> user, String matkul) {
        int totalMahasiswa = 0;
        int gagal = 0;
        for (user object : user) {
            if (object instanceof magister || object instanceof sarjana) {
                dataUser dataMahasiswa = new dataUser();
                hitungNilaiAkhir hitung = new hitungNilaiAkhir();
                int[] semuaNilai = dataMahasiswa.cariNilaiMK((mahasiswa) object, matkul);
                double nilaiAkhir = hitung.hitungNA(semuaNilai);
                if (nilaiAkhir != 0) {
                    totalMahasiswa++;
                    if (nilaiAkhir < 56) {
                        gagal += 1;
                    }
                }
            }
        }
        int[] mahasiswaGagal = {gagal, totalMahasiswa};
        return mahasiswaGagal;
    }
}