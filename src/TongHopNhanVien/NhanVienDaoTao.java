package TongHopNhanVien;

public class NhanVienDaoTao extends NhanVien{
    private String nganh;

    public NhanVienDaoTao(String nganh) {
        this.nganh = nganh;
    }

    public NhanVienDaoTao(String ten, int tuoi, String gioi_tinh, String sdt, String email, double luong, String ngang) {
        super(ten, tuoi, gioi_tinh, sdt, email, luong);
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
        return getTen() +"la 1"+getGioi_tinh()+" NhanVienDaoTao{" +
                "thuoc nganh='" + nganh +
                "co tuoi la "+getTuoi()+
                "co email"+getEmail()+
                "va co muc luong la" +getLuong()+'\'' +
                '}';
    }
}
