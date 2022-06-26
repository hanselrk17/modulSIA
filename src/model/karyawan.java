package model;
public class karyawan extends staff {
    int salary;
    presensiStaff[] presensi = new presensiStaff[5];

    public karyawan(String NIK, String nama, String alamat, String TTL, String telepon, int salary) {
        super(NIK, nama, alamat, TTL, telepon);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public presensiStaff[] getPresensi() {
        return presensi;
    }

    public void setPresensi(presensiStaff[] presensi) {
        this.presensi = presensi;
    }

    public void addPresensi(presensiStaff presensi, int i) {
        this.presensi[i] = presensi;
    }

    @Override
    public String toString() {
        return super.toString() + "karyawan {" + "salary = " + salary + ", presensi = " + presensi + '}';
    }
}