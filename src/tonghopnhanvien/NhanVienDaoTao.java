package tonghopnhanvien;

public class NhanVienDaoTao extends NhanVien{
    private String nganh;

    public NhanVienDaoTao(String nganh) {
        this.nganh = nganh;
    }

    public NhanVienDaoTao(String ten, int tuoi, String gioiTinh, String sdt, String email, double luong, String ngang) {
        super(ten, tuoi, gioiTinh, sdt, email, luong);
        this.nganh = ngang;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    @Override
    public String toString() {
        return getTen() +"là 1"+ getGioiTinh()+" Nhân viên đào tạo" +
                " thuộc ngành:' " + nganh +
                " có tuổi là "+getTuoi()+
                " có email "+getEmail()+
                "  có mức lương = " +getLuong()+'\'' +
                '}';
    }
}
