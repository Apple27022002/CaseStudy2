package TongHopNhanVien;

public class NhanVienFullTime extends NhanVienDaoTao {
    public NhanVienFullTime(String nganh) {
        super(nganh);
    }

    public NhanVienFullTime(String ten, int tuoi, String gioi_tinh, String sdt, String email, double luong, String nganh) {
        super(ten, tuoi, gioi_tinh, sdt, email, luong, nganh);
    }

    @Override
    public double doanhThu() {
        return super.doanhThu();
    }

    @Override
    public String toString() {
        return super.toString()+"co ten la"
                +getTen()
                +getTuoi()+"Tuoi"
                +" La 1 "+getGioi_tinh()+" Nam "
                +" co sdt la "+getSdt()
                +" co email la "+getEmail()
                +" co muc luong la "+getLuong()
                +" va thuoc ngang "+getNganh()
                +"\n______________________________________________________";
    }
}
