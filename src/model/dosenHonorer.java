package model;
public class dosenHonorer extends dosen{
    int honorPerSKS;
    
    public dosenHonorer (String NIK, String nama, String alamat, String TTL, String telepon, String departemen, int honorPerSKS) {
        super(NIK, nama, alamat, TTL, telepon, departemen);
        this.honorPerSKS = honorPerSKS;
    }
    
    public int getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(int honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }
    
    @Override
    public String toString() {
        return super.toString() + "dosenHonorer {" + "honorPerSKS = " + honorPerSKS + '}';
    }
}