package TongHopNhanVien;

public class NhanVienPartTime extends NhanVienDaoTao{
    private double gioLamViec;

    public double getGioLamViec() {
        return gioLamViec;
    }

    public void setGioLamViec(double gioLamViec) {
        this.gioLamViec = gioLamViec;
    }

    public NhanVienPartTime(String nganh, double gioLamViec) {
        super(nganh);
        this.gioLamViec = gioLamViec;
    }

    public NhanVienPartTime(String ten, int tuoi, String gioi_tinh, String sdt, String email, double luong, String ngang, double gioLamViec) {
        super(ten, tuoi, gioi_tinh, sdt, email, luong, ngang);
        this.gioLamViec = gioLamViec;
    }

    public NhanVienPartTime(String nganh) {
        super(nganh);
    }

    public NhanVienPartTime(String ten, int tuoi, String gioi_tinh, String sdt, String email, double luong, String ngang) {
        super(ten, tuoi, gioi_tinh, sdt, email, luong, ngang);
    }

    @Override
    public String toString() {
        return super.toString()+"NhanVienPartTime{" +
                "gioLamViec=" + gioLamViec +
                '}';
    }

    @Override
    public double doanhThu() {
        double doanhthu=getLuong()*gioLamViec;
        return doanhthu;
    }
}
