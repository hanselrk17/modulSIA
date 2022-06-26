package model;
public class mataKuliahAmbil {
    mataKuliah mataKuliah;
    presensi[] presensi = new presensi[3];
    int nilai1;
    int nilai2;
    int nilai3;
    
    public mataKuliahAmbil(mataKuliah mataKuliah, int nilai1, int nilai2, int nilai3) {
        this.mataKuliah = mataKuliah;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
    }
    
    public mataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(mataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public presensi[] getPresensi() {
        return presensi;
    }

    public void setPresensi(presensi[] presensi) {
        this.presensi = presensi;
    }
    
    public void addPresensi(presensi presensi, int i) {
        this.presensi[i] = presensi;
    }

    public int getNilai1() {
        return nilai1;
    }

    public void setNilai1(int n1) {
        this.nilai1 = nilai1;
    }

    public int getNilai2() {
        return nilai2;
    }

    public void setNilai2(int n2) {
        this.nilai2 = nilai2;
    }

    public int getNilai3() {
        return nilai3;
    }

    public void setNilai3(int n3) {
        this.nilai3 = nilai3;
    }
    
    @Override
    public String toString() {
        return super.toString() + "MatkulAmbil {" + "mataKuliah = " + mataKuliah + ", presensi = " + presensi + ", nilai1 = " + nilai1 + ", nilai2 = " + nilai2 + ", nilai3 = " + nilai3 + '}';
    }
}