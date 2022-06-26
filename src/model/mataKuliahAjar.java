package model;
import java.util.Arrays;

public class mataKuliahAjar {
    mataKuliah mataKuliah;
    presensiStaff[] presensi = new presensiStaff[3];

    public mataKuliahAjar(mataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public mataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(mataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public presensiStaff[] getPresensi() {
        return presensi;
    }

    public void setPresensi(presensiStaff[] presensi) {
        this.presensi = presensi;
    }

    public void addPresensi(presensiStaff presensi, int i) {
        this.presensi[i] = presensi;
    }

    public String toString() {
        return "MatkulAjar {" + "mataKuliah = " + mataKuliah + ", presensi = " + Arrays.toString(presensi) + '}';
    }
}
