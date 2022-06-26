package model;
public class doktor extends mahasiswa {
    String judulDisertasi;
    int sidang1;
    int sidang2;
    int sidang3;
    
    public doktor(String NIM, String jurusan, String nama, String alamat, String TTL, String telepon, String judulDisertasi, int sidang1, int sidang2, int sidang3) {
        super(NIM, jurusan, nama, alamat, TTL, telepon);
        this.judulDisertasi = judulDisertasi;
        this.sidang1 = sidang1;
        this.sidang2 = sidang2;
        this.sidang3 = sidang3;
    }
    
    public String getJudulDisertasi() {
        return judulDisertasi;
    }

    public void setJudulDisertasi(String judulDisertasi) {
        this.judulDisertasi = judulDisertasi;
    }

    public int getSidang1() {
        return sidang1;
    }

    public void setSidang1(int sidang1) {
        this.sidang1 = sidang1;
    }

    public int getSidang2() {
        return sidang2;
    }

    public void setSidang2(int sidang2) {
        this.sidang2 = sidang2;
    }
    
    public int getSidang3() {
        return sidang3;
    }

    public void setSidang3(int sidang3) {
        this.sidang3 = sidang3;
    }
    
    @Override
    public String toString() {
        return super.toString() + "doktor {" + "judulDisertasi = " + judulDisertasi + ", sidang1 = " + sidang1 + ", sidang2 = " + sidang2 + ", sidang3 = " + sidang3 + '}';
    }
}