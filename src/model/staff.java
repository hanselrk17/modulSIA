package model;
public class staff extends user {
    String NIK;
    
    public staff (String NIK, String nama, String alamat, String TTL, String telepon) {
        super(nama, alamat, TTL, telepon);
        this.NIK = NIK;
    }
    
    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }
    
    @Override
    public String toString() {
        return super.toString() + "staff {" + "NIK = " + NIK + '}';
    }
}