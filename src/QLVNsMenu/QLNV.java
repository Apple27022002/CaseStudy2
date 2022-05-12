package QLVNsMenu;

import TongHopNhanVien.NhanVien;
import TongHopNhanVien.NhanVienFullTime;
import TongHopNhanVien.NhanVienPartTime;
import TongHopNhanVien.NhanVienTuyenSinh;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class QLNV {
    public static void addNhanVien(){
        while (true){
            System.out.println("1.Thêm nhân viên đào tạo");
            System.out.println("_____________________________________");
            System.out.println("2.Thêm nhân viên tuyển sinh");
            System.out.println("_____________________________________");
            System.out.println("3.Thoát");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    addNhanVienDaoTao();
                    break;
                case 2:
                    addNhanVienTuyenSinh();
                    break;
                case 3:
                    break;
            }if (choice==3) break;
        }
    }
    public static void removeNhanVien(){//Chức Năng 2
        while (true){System.out.println("1.Xóa nhân viên đào tạo");
            System.out.println("_____________________________________");
            System.out.println("2.Xóa nhân viên tuyển sinh");
            System.out.println("_____________________________________");
            System.out.println("3.Thoát");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    removeNhanVienDaotao();
                    break;
                case 2:
                    removeNhanVienTuyenSinh();
                    break;
                case 3:
                    break;
            }if (choice==3) break;
        }
    }
    //    Phuong Thuc hien tien luong-Chức Năng 3----
    static QLNV qlnv = new QLNV();
    public static void showDoanhThu() {
        System.out.println("Nhập tên");
        String nameDoanhThu = sc.nextLine();
        int khongCo = qlnv.timKiemTheoTen(nameDoanhThu);
        if (khongCo == -1) {
            System.out.println("khong co ten nay");
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getTen().equals(nameDoanhThu)) {
                    System.out.println("Doanh thu của " + nameDoanhThu + " là " + list.get(i).doanhThu());
                }
            }
        }
    }
    public int timKiemTheoTen(String name) {
        for (int i = 0; i<  list.size(); i++) {
            if (list.get(i).getTen().equals(name)) {
                return i;
            }
        }
        return -1;
    }
    //    Phuong thuc tim kiem-Chức Năng 4
    public static void findNhanVienByName(){
        System.out.println("Nhập tên nhân viên cần tìm");
        String nameFind=sc.nextLine();
        for (NhanVien nhanvien:list) {
            if (nhanvien.getTen().equals(nameFind)){
                System.out.println(nhanvien);
            }
        }
    }

    public static void sortByName(){/////Chức Năng 5
        list.sort(Comparator.comparing(o->((NhanVien)o).getTen()));
    }
    public static void sortByDoanhThu(){//Chức Năng 6
        list.sort(Comparator.comparing(o->((NhanVien)o).doanhThu()));
    }
    public static void showNhanVien(){//Chức Năng 7
        for (NhanVien nhanvien:list) {
            System.out.println(nhanvien);
        }
    }
    static ArrayList<NhanVien> list = new ArrayList<>();
    static Scanner sc= new Scanner(System.in);
    public static String nhapTen(){
        System.out.println("Nhập tên nhân viên");
        String ten=sc.nextLine();
        return ten;
    }
    public static String nhapSDT(){
        System.out.println("Nhập số điện thoại");
        String sdt=sc.nextLine();
        return sdt;
    }
    public static int nhapTuoiNhanVien() {
        while (true) {
            System.out.print("Nhập tuổi nhân viên: ");
            try{int tuoi = Integer.parseInt(sc.nextLine());
                if (tuoi < 18) throw new InputMismatchException("tuổi không được nhỏ hơn 18");
                else return tuoi;
            }
            catch (InputMismatchException e){
                System.out.println("Tuổi phải là số lớn hơn 18");
            }
            catch (Exception e){
                System.out.println("Tuổi phải là số lớn hơn 18");
            }
        }
    }
    public static String nhapEmail() {
        while (true) {
            System.out.println("Nhập email nhân viên");
            try {String email = sc.nextLine();
                if (list.size()>0) {
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getEmail().equals(email))
                            throw new InputMismatchException();
                    }
                }
                return email;
            }
            catch (InputMismatchException e){
                System.out.println("Email này đã có rồi , mời nhập email khác");
            }
        }
    }
    public static double nhapLuong(){
        while (true) {
            try {System.out.println("Nhập lương");
                double luong = Double.parseDouble(sc.nextLine());
                return luong;}
            catch (Exception e){
                System.out.println("Lương phải là 1 số");
            }
        }
    }
    public static String nhapGioiTinh() {
        while (true) {
            try {System.out.println("Nhập giới tính nhân viên \uD83D\uDC49(Nam/Nu): ");
                String gender = sc.nextLine();
                if (gender.equals("Nam") || gender.equals("Nu")) return gender;
                else throw new InputMismatchException();}
            catch (InputMismatchException e){
                System.out.println("Giới tình chỉ có thể là Nam hoặc Nữ");
            }
        }
    }
    public static String nhapNganh(){
        while (true){
            try { System.out.println("Nhập ngành \uD83D\uDC49  Đầu bếp -Dau Bep \uD83D\uDC49 Phục Vụ -Phuc Vu\uD83D\uDC49 Chạy Bàn-Chay Ban");
                String nganh = sc.nextLine();
                if (nganh.equals("Dau Bep")|| nganh.equals("Phuc Vu") ||nganh.equals("Chay Ban"))return nganh;
                else throw new InputMismatchException();}
            catch (InputMismatchException e){
                System.out.println("Ngành chỉ có thể là đầu bếp phục vụ hoặc chạy bàn");
            }
        }
//        System.out.println("Nhập ngành");
//        String nganh = sc.nextLine();
//
//        return nganh;
    }
    public static int nhapSoTuyenSinh(){
        System.out.println("Nhập số tuyển sinh được");
        int so_tuyen_sinh = Integer.parseInt(sc.nextLine());
        return so_tuyen_sinh;
    }
    public static double nhapGioLamViec(){
        while (true){
            try {
            System.out.println("Nhập giờ làm việc : ca 1-6h\uD83D\uDC49 8h :ca 2 -10h \uD83D\uDC49 14h:ca 3 16h\uD83D\uDC49 20h ️");
            double gio_lam_viec=Double.parseDouble(sc.nextLine());
            if (gio_lam_viec==1|| gio_lam_viec==2||gio_lam_viec==3)return gio_lam_viec;
            else throw new InputMismatchException();}
            catch (InputMismatchException e){
                System.out.println("Vui long nhap lai gio lam");
            }


        }
//        System.out.println("Nhập giờ làm việc");
//        double gio_lam_viec=Double.parseDouble(sc.nextLine());
//        return gio_lam_viec;
    }
//    Phuong Thuc Them Nhan Vien-Cách hoạt động chức năng 2////////////////////
    //PART
    public static void addNhanVienPartTime(){
        NhanVien nhanVien = new NhanVienPartTime( nhapTen(), nhapTuoiNhanVien(),  nhapGioiTinh(),  nhapSDT(),  nhapEmail(),  nhapLuong(),  nhapNganh(),  nhapGioLamViec());
        list.add(nhanVien);
    }
    //FULL
    public static void addNhanVienFullTime(){
        NhanVien nhanVien = new NhanVienFullTime( nhapTen(),  nhapTuoiNhanVien(),  nhapGioiTinh(),  nhapSDT(),  nhapEmail(),  nhapLuong(),  nhapNganh());
        list.add(nhanVien);
    }
    //TUYENSINH
    public static void addNhanVienTuyenSinh(){
        NhanVien nhanVien = new NhanVienTuyenSinh( nhapTen(),  nhapTuoiNhanVien(),  nhapGioiTinh(),  nhapSDT(),  nhapEmail(),  nhapLuong(),  nhapSoTuyenSinh());
        list.add(nhanVien);
    }
    public static void addNhanVienDaoTao(){
        while (true){
            System.out.println("1.Thêm nhân viên full time");
            System.out.println("_____________________________________");
            System.out.println("2.Thêm nhân viên parttime");
            System.out.println("_____________________________________");
            System.out.println("3.Thoát");
            int choice=Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    addNhanVienFullTime();
                    break;
                case 2:
                    addNhanVienPartTime();
                    break;
                case 3:
                    break;
            }if (choice==3) break;
        }
    }
//    public static void addNhanVien(){
//        while (true){
//            System.out.println("1.Thêm nhân viên đào tạo");
//            System.out.println("_____________________________________");
//            System.out.println("2.Thêm nhân viên tuyển sinh");
//            System.out.println("_____________________________________");
//            System.out.println("3.Thoát");
//            int choice = Integer.parseInt(sc.nextLine());
//            switch (choice){
//                case 1:
//                    addNhanVienDaoTao();
//                    break;
//                case 2:
//                    addNhanVienTuyenSinh();
//                    break;
//                case 3:
//                    break;
//            }if (choice==3) break;
//        }
//    }
//    Phuong thuc xoa
    public static void removeNhanVienDaotao(){
        System.out.println("Nhập tên cần đuổi");
        String nameRemove=sc.nextLine();
        int check=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTen().equals(nameRemove)&&list.get(i).toString().contains("NhanVienDaoTao")){
                list.remove(i);
                i--;
                check++;
            }
        }if (check==0) System.out.println("Không có người này trong danh sách nhân viên này \n xin vui lòng lựa lại" );
    }
    public static void removeNhanVienTuyenSinh(){
        System.out.println("Nhập tên nhân viên bạn cần đuổi");
        String nameRemove=sc.nextLine();
        int check=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTen().equals(nameRemove)&&list.get(i).toString().contains("NhanVienTuyenSinh")){
                list.remove(i);
                i--;
                check++;
                System.out.println("đã đuổi việc");
            }
        }if (check==0) System.out.println("Không có người này tronng danh sách nhân viên \n Xin vui lòng lựa lại");

    }
////    Phuong Thuc hien tien luong-Chức Năng 3----
//    public static void showDoanhThu(){
//        System.out.println("Nhập tên");
//        String nameDoanhThu=sc.nextLine();
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getTen().equals(nameDoanhThu)){
//                System.out.println("Doanh thu của " + nameDoanhThu+" là "+ list.get(i).doanhThu());
//            }
//        }
//    }
////    Phuong thuc tim kiem-Chức Năng 4
//    public static void findNhanVienByName(){
//        System.out.println("Nhập tên nhân viên cần tìm");
//        String nameFind=sc.nextLine();
//        for (NhanVien nhanvien:list) {
//            if (nhanvien.getTen().equals(nameFind)){
//                System.out.println(nhanvien);
//            }
//        }
////    }
//    public static void sortByName(){
//        list.sort(Comparator.comparing(o->((NhanVien)o).getTen()));
//    }
//    public static void sortByDoanhThu(){
//        list.sort(Comparator.comparing(o->((NhanVien)o).doanhThu()));
//    }
//    public static void showNhanVien(){
//        for (NhanVien nhanvien:list) {
//            System.out.println(nhanvien);
//        }
//    }//Chức Năng 2
//    public static void removeNhanVien(){
//        while (true){System.out.println("1.Xóa nhân viên đào tạo");
//            System.out.println("_____________________________________");
//            System.out.println("2.Xóa nhân viên tuyển sinh");
//            System.out.println("_____________________________________");
//            System.out.println("3.Thoát");
//            int choice = Integer.parseInt(sc.nextLine());
//            switch (choice){
//                case 1:
//                    removeNhanVienDaotao();
//                    break;
//                case 2:
//                    removeNhanVienTuyenSinh();
//                    break;
//                case 3:
//                    break;
//            }if (choice==3) break;
//        }
//    }
    public static void menu(){
        while (true){
            System.out.println("_____________________________________");
            System.out.println("1.Thêm nhân viên");
            System.out.println("_____________________________________");
            System.out.println("2.Đuổi nhân viên");
            System.out.println("_____________________________________");
            System.out.println("3.Hiển thị doanh thu nhân viên");
            System.out.println("_____________________________________");
            System.out.println("4.Tìm kiếm nhân viên");
            System.out.println("_____________________________________");
            System.out.println("5.Sắp xếp nhân viên theo tên");
            System.out.println("_____________________________________");
            System.out.println("6.Sắp xếp nhân viên theo doanh thu");
            System.out.println("_____________________________________");
            System.out.println("7.Hiển thị toàn bộ nhân viên");
            System.out.println("_____________________________________");
            System.out.println("8.Thoát");
            System.out.println("_____________________________________");
            int choice = -1;
            try {
                choice = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("Chỉ nhập số ");
            }
            switch (choice){
                case 1:
                    addNhanVien();
                    break;
                case 2:
                    removeNhanVien();
                    break;
                case 3:
                    showDoanhThu();
                    break;
                case 4:
                    findNhanVienByName();
                    break;
                case 5:
                    sortByName();
                    break;
                case 6:
                    sortByDoanhThu();
                    break;
                case 7:
                    showNhanVien();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Số vừa nhập không hợp ");
                    continue;
            }
        }
    }
}
