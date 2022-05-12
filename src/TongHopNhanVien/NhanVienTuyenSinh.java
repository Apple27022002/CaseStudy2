package TongHopNhanVien;

public class NhanVienTuyenSinh extends NhanVien{
    private int soTuyenSinh;

    public NhanVienTuyenSinh() {
    }

    public NhanVienTuyenSinh(String ten, int tuoi, String gioi_tinh, String sdt, String email, double luong) {
        super(ten, tuoi, gioi_tinh, sdt, email, luong);
    }

    public NhanVienTuyenSinh(String nhapTen, int nhapTuoiNhanVien, String nhapGioiTinh, String nhapSDT, String nhapEmail, double nhapLuong, int nhapSoTuyenSinh) {
    }

    public int getSoTuyenSinh() {
        return soTuyenSinh;
    }

    public void setSoTuyenSinh(int soTuyenSinh) {
        this.soTuyenSinh = soTuyenSinh;
    }

    @Override
    public String toString() {
        return getTen()+"la 1"+getGioi_tinh()+"NhanVienTuyenSinh"+"co tuoi la"+getTuoi() +super.toString()+
                "Co sdt la"+getSdt()+
                "Co email la "+getEmail()+
                "soTuyenSinh=" + soTuyenSinh
                +"co muc luong "+getLuong()+
                '}';
    }

    @Override
    public double doanhThu() {
        double doanhthu=getLuong()*8+(soTuyenSinh*10);
        return doanhthu;
    }
}
