package model;
import java.util.ArrayList;
public class sarjana extends mahasiswa {
    ArrayList<mataKuliahAmbil> mkAmbil = new ArrayList<>();
    
    public sarjana(String NIM, String jurusan, String nama, String alamat, String TTL, String telepon) {
        super(NIM, jurusan, nama, alamat, TTL, telepon);
    }
    
    public ArrayList<mataKuliahAmbil> getMatakuliah() {
        return mkAmbil;
    }
    
    public mataKuliahAmbil getMatakuliah(int i) {
        return this.mkAmbil.get(i);
    }
    
    public mataKuliahAmbil getMatakuliah(String kode) {
        int i = 0;
        for (mataKuliahAmbil element : mkAmbil){
            if (element.getMataKuliah().getKode().equals(kode)){
                return this.mkAmbil.get(i);
            }else{
                i++;
            }
        }
        return null;
    }

    public void setMatakuliah(ArrayList<mataKuliahAmbil> mkAmbil) {
        this.mkAmbil = mkAmbil;
    }
    
    public void addMatakuliah(mataKuliahAmbil mkAmbil) {
        this.mkAmbil.add(mkAmbil);
    }
    
    @Override
    public String toString() {
        return super.toString() + "sarjana {" + "mkAmbil = " + mkAmbil + '}';
    }
}