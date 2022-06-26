package model;
public class mahasiswa extends user {
    String NIM;
    String jurusan;
    
    public mahasiswa (String NIM, String jurusan, String nama, String alamat, String TTL, String telepon) {
        super(nama, alamat, TTL, telepon);
        this.NIM = NIM;
        this.jurusan = jurusan;
    }
    
    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    
    @Override
    public String toString() {
        return super.toString() + "mahasiswa {" + "NIM = " + NIM + ", jurusan = " + jurusan + '}';
    }
}