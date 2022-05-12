package tonghopnhanvien;

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

    public NhanVienPartTime(String ten, int tuoi, String gioiTinh, String sdt, String email, double luong, String ngang, double gioLamViec) {
        super(ten, tuoi, gioiTinh, sdt, email, luong, ngang);
        this.gioLamViec = gioLamViec;
    }

    public NhanVienPartTime(String nganh) {
        super(nganh);
    }

    public NhanVienPartTime(String ten, int tuoi, String gioiTinh, String sdt, String email, double luong, String ngang) {
        super(ten, tuoi, gioiTinh, sdt, email, luong, ngang);
    }

    @Override
    public String toString() {
        return super.toString()+getTen()+"là 1 "+ getGioiTinh()+" nhân viên PartTime " +
                " thuộc ngành "+getNganh()+
                " làm ở mốc giờ " + gioLamViec +
                " ở độ tuổi "+getTuoi()+
                " có email là "+getEmail()+
                "có mức lương ="+getLuong()+
                "\n ca 1-6h->10h, ca 2 12h->16h,ca 3 17h->22h "+
                '}';
    }

    @Override
    public double doanhThu() {
        double doanhthu=getLuong()*gioLamViec;
        return doanhthu;
    }
}
