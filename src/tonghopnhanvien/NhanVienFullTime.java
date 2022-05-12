package tonghopnhanvien;

public class NhanVienFullTime extends NhanVienDaoTao {
    public NhanVienFullTime(String nganh) {
        super(nganh);
    }

    public NhanVienFullTime(String ten, int tuoi, String gioiTinh, String sdt, String email, double luong, String nganh) {
        super(ten, tuoi, gioiTinh, sdt, email, luong, nganh);
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
                +" Là 1 "+ getGioiTinh()+" Nam "
                +" có sdt là \n|"+getSdt()
                +" có email là "+getEmail()
                +" có mức lương là "+getLuong()
                +" thuộc ngành  "+getNganh()
                +"\n______________________________________________________";
    }
}
