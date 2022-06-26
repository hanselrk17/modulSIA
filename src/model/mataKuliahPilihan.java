package model;
public class mataKuliahPilihan extends mataKuliah{
    int jumlahMinimumMahasiswa;
    
    public mataKuliahPilihan (String kode, int SKS, String nama, int jumlahMinimumMahasiswa) {
        super(kode, SKS, nama);
        this.jumlahMinimumMahasiswa = jumlahMinimumMahasiswa;
    }
    
    public int getJumlahMinimumMahasiswa() {
        return jumlahMinimumMahasiswa;
    }

    public void setJumlahMinimumMahasiswa(int minimumMahasiswa) {
        this.jumlahMinimumMahasiswa = minimumMahasiswa;
    }
    
    @Override
    public String toString() {
        return super.toString() + "mataKuliahPilihan {" + "jumlahMinimumMahasiswa = " + jumlahMinimumMahasiswa + '}';
    }
}