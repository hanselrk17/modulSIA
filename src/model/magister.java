package model;
import java.util.ArrayList;
public class magister extends mahasiswa {
    ArrayList<mataKuliahAmbil> mkAmbil = new ArrayList<>();
    String judulTesis;
    
    public magister(String NIM, String jurusan, String nama, String alamat, String TTL, String telepon, String judulTesis) {
        super(NIM, jurusan, nama, alamat, TTL, telepon);
        this.judulTesis = judulTesis;
    }
    
    public ArrayList<mataKuliahAmbil> getMatakuliah() {
        return mkAmbil;
    }

    public void setMatakuliah(ArrayList<mataKuliahAmbil> mkAmbil) {
        this.mkAmbil = mkAmbil;
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
    
    public String getJudulTesis() {
        return judulTesis;
    }

    public void setJudulTesis(String judulTesis) {
        this.judulTesis = judulTesis;
    }
    
    @Override
    public String toString() {
        return super.toString() + "magister {" + "mkAmbil = " + mkAmbil + ", judulTesis = " + judulTesis + '}';
    }
}