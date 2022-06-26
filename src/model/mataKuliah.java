package model;
public class mataKuliah {
    String kode;
    int SKS;
    String nama;
    
    public mataKuliah(String kode, int SKS, String nama) {
        this.kode = kode;
        this.SKS = SKS;
        this.nama = nama;
    }
    
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public int getSKS() {
        return SKS;
    }

    public void setSKS(int SKS) {
        this.SKS = SKS;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    @Override
    public String toString() {
        return super.toString() + "mataKuliah {" + "kode = " + kode + ", SKS = " + SKS + ", nama = " + nama + '}';
    }
}