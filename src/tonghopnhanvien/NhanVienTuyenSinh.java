package tonghopnhanvien;

public class NhanVienTuyenSinh extends NhanVien{
    private int soTuyenSinh;

    public NhanVienTuyenSinh() {
    }

    public NhanVienTuyenSinh(String ten, int tuoi, String gioiTinh, String sdt, String email, double luong) {
        super(ten, tuoi, gioiTinh, sdt, email, luong);
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
        return getTen()+"là 1"+ getGioiTinh()+"Nhân viên tuyển sinh"+getTuoi()+" tuổi " +super.toString()+
                "Có sđt là :"+getSdt()+
                "Có email là : "+getEmail()+
                "số người đã tuyển là" + soTuyenSinh
                +"có mức lương = "+getLuong()+
                '}';
    }

    @Override
    public double doanhThu() {
        double doanhthu=getLuong()*8+(soTuyenSinh*10);
        return doanhthu;
    }
}
