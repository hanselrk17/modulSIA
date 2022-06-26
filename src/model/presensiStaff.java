package model;
import java.time.LocalDate;
public class presensiStaff extends presensi {
    int jam;
    
    public presensiStaff(LocalDate tanggal, int status, int jam) {
        super(tanggal, status);
        this.jam = jam;
    }
    
    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }
    
    @Override
    public String toString() {
        return super.toString() + "presensiStaff {" + "jam = " + jam + '}';
    }
}