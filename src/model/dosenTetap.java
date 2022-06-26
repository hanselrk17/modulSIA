package model;
public class dosenTetap extends dosen{
    int salary;
    
    public dosenTetap (String NIK, String nama, String alamat, String TTL, String telepon, String departemen, int salary) {
        super(NIK, nama, alamat, TTL, telepon, departemen);
        this.salary = salary;
    }
    
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return super.toString() + "dosenTetap {" + "salary = " + salary + '}';
    }
}