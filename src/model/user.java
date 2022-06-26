package model;
public class user {
    String nama;
    String alamat;
    String TTL;
    String telepon;

    public user(String nama, String alamat, String TTL, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.TTL = TTL;
        this.telepon = telepon;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTTL() {
        return TTL;
    }

    public void setTTL(String TTL) {
        this.TTL = TTL;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
    
    @Override
    public String toString() {
        return "user {" + "nama = " + nama + ", alamat = " + alamat + ", TTL = " + TTL + ", telepon = " + telepon + '}';
    }
}