package controller;
import model.dosen;
import model.mataKuliahAjar;
import model.presensiStaff;

public class hitungPresensi {
    public hitungPresensi() {
    }

    public int hitungJamKerjaDosen(dosen data) {
        int jamKerja = 0;
        for (mataKuliahAjar listMk : data.getMatakuliah()) {
            for (presensiStaff presensi : listMk.getPresensi()) {
                if (presensi.getStatus() == 1) {
                    jamKerja += presensi.getJam();
                }
            }
        }
        return jamKerja;
    }

    public int hitungJumlahKehadiran(presensiStaff[] presensi) {
        int unitPresensi = 0;
        for (presensiStaff unit : presensi) {
            if (unit.getStatus() == 1) {
                unitPresensi++;
            }
        }
        return unitPresensi;
    }
}