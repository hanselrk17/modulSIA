package controller;
import java.util.ArrayList;
import model.doktor;
import model.magister;
import model.mahasiswa;
import model.sarjana;
import model.user;

public class hitungNilaiAkhir {
    public hitungNilaiAkhir() {
    }

    public double hitungNA(int[] nilai) {
        int total = nilai[0] + nilai[1] + nilai[2];
        return (double) total / 3;
    }

    public double hitungNA(doktor mahasiswa) {
        int totalNilai = mahasiswa.getSidang1() + mahasiswa.getSidang2() + mahasiswa.getSidang3();
        return (double) totalNilai / 3;
    }

    public double hitungRataRataNA(ArrayList<user> user, String matkul) {
        int banyakNilai = 0;
        double totalNilai = 0;
        for (user object : user) {
            if (object instanceof magister || object instanceof sarjana) {
                dataUser dataMahasiswa = new dataUser();
                int[] semuaNilai = dataMahasiswa.cariNilaiMK((mahasiswa) object, matkul);
                double nilaiAkhir = hitungNA(semuaNilai);
                if (nilaiAkhir != 0) {
                    totalNilai += nilaiAkhir;
                    banyakNilai++;
                }
            }
        }
        return totalNilai / banyakNilai;
    }
}