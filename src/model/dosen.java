package model;
import java.util.ArrayList;

public class dosen extends staff {
    String departemen;
    ArrayList<mataKuliahAjar> mkNgajar = new ArrayList<>();

    public dosen(String NIK, String nama, String alamat, String TTL, String telepon, String departemen) {
        super(NIK, nama, alamat, TTL, telepon);
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public ArrayList<mataKuliahAjar> getMatakuliah() {
        return mkNgajar;
    }

    public mataKuliahAjar getMatakuliah(int a) {
        return this.mkNgajar.get(a);
    }

    public mataKuliahAjar getMatakuliah(String kode) {
        int i = 0;
        for (mataKuliahAjar element : mkNgajar) {
            if (element.getMataKuliah().getKode().equals(kode)) {
                return this.mkNgajar.get(i);
            } else {
                i += 1;
            }
        }
        return null;
    }

    public void setMatakuliah(ArrayList<mataKuliahAjar> mkNgajar) {
        this.mkNgajar = mkNgajar;
    }

    public void addMatakuliah(mataKuliahAjar mkNgajar) {
        this.mkNgajar.add(mkNgajar);
    }

    @Override
    public String toString() {
        return super.toString() + "dosen {" + "departemen = " + departemen + ", mkAjar = " + mkNgajar + '}';
    }
}