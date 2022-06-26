package controller;
import model.mataKuliahAjar;
import model.staff;
import model.dosen;
import model.dosenHonorer;
import model.dosenTetap;
import model.karyawan;

public class hitungPendapatanPekerja {
    public hitungPendapatanPekerja() {
    }

    public double hitungPendapatanStaff(staff staff) {
        double pendapatan = 0;
        if (staff instanceof karyawan) {
            karyawan karyawan = (karyawan) staff;
            pendapatan = hitungPendapatanKaryawan(karyawan);
        } else if (staff instanceof dosen) {
            dosen dosen = (dosen) staff;
            pendapatan = hitungPendapatanDosen(dosen);
        }
        return pendapatan;
    }

    public double hitungPendapatanKaryawan(karyawan karyawan) {
        hitungPresensi presensi = new hitungPresensi();
        int kehadiran = presensi.hitungJumlahKehadiran(karyawan.getPresensi());
        double pendapatan = (kehadiran * karyawan.getSalary()) / 22;
        return pendapatan;
    }

    public double hitungPendapatanDosen(dosen dosen) {
        double pendapatan = 0;
        int kehadiran = 0;
        hitungPresensi presensi = new hitungPresensi();
        for (mataKuliahAjar mkNgajar : dosen.getMatakuliah()) {
            kehadiran += presensi.hitungJumlahKehadiran(mkNgajar.getPresensi());
        }
        if (dosen instanceof dosenTetap) {
            dosenTetap dosenTetap = (dosenTetap) dosen;
            pendapatan = dosenTetap.getSalary() + (kehadiran * 25000);
        } else {
            dosenHonorer honorer = (dosenHonorer) dosen;
            pendapatan = kehadiran * honorer.getHonorPerSKS();
        }
        return pendapatan;
    }
}