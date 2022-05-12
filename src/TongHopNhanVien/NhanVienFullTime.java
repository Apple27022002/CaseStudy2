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
                +getTuoi()+" Tuổi "
                +" Là 1 "+getGioi_tinh()+" Nam "
                +" có sdt là \n|"+getSdt()
                +" có email là "+getEmail()
                +" có mức lương là "+getLuong()
                +" thuộc ngành "+getNganh()
                +"\n______________________________________________________";
    }
}
