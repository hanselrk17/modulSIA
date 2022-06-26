package model;
import java.time.LocalDate;
public class presensi implements status{
    LocalDate tanggal;
    int status;
    
    public presensi(LocalDate tanggal, int status) {
        this.tanggal = tanggal;
        this.status = status;
    }
    
    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return super.toString() + "presensi {" + "tanggal = " + tanggal + ", status = " + status + '}';
    }
}