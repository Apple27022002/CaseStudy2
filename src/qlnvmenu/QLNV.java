package qlnvmenu;

import tonghopnhanvien.NhanVien;
import tonghopnhanvien.NhanVienFullTime;
import tonghopnhanvien.NhanVienPartTime;
import tonghopnhanvien.NhanVienTuyenSinh;

import java.util.*;

public class QLNV {
    public static void addNhanVien(){
        while (true){
            System.out.println("_____________________________________");
            System.out.println("|  1.Thêm nhân viên đào tạo         |");
            System.out.println("|___________________________________|");
            System.out.println("|  2.Thêm nhân viên tuyển sinh      |");
            System.out.println("|___________________________________|");
            System.out.println("|  3.Thoát                          |");
            System.out.println("_____________________________________");
            int choice=-1;
            try {
                choice= sc.nextInt();
            }catch (InputMismatchException e){
                System.out.println("nhap lai deeeeee");
                sc.nextLine();
            }
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
            int choice = -1;
          try {
              choice= sc.nextInt();
          }catch (InputMismatchException e){
              System.out.println("nhap lai deeeeee");
              sc.nextLine();
          }
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
            System.out.println("!Tên không tồn tại!");
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
                System.out.println("Hãy lựa tiếp" );
            }
        }
    }

    public static void sortByName(){/////Chức Năng 5
        System.out.println("Tính năng đang bảo trì ! Vui lòng lựa tính năng khác");
//        Collections.sort(list, new Comparator<NhanVien>() {
//            @Override
//            public int compare(NhanVien o1, NhanVien o2) {
//                int a =o1.getTen().compareToIgnoreCase(o2.getTen());
//                    if (a==0){
//                        int b=o1.getTen().compareToIgnoreCase(o2.getTen());
//                        return b;
//                }
//                    return a;
//            }
//        });
    }

//        list.sort(Comparator.comparing(o->((NhanVien)o).getTen()));
    public static void sortByDoanhThu(){//Chức Năng 6
//        list.sort(Comparator.comparing(o->((NhanVien)o).doanhThu()));
        Collections.sort(list, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
               if(o1.doanhThu()< o2.doanhThu()){
                   return -1;
               }
               else if(o1.doanhThu()>o2.doanhThu()){
                   return 1;
               }
               else {
                   return 0;
               }
            }
        });
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
        sc.nextLine();
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
                System.out.println("! Tuổi phải là số lớn hơn 18 !");
            }
            catch (Exception e){
                System.out.println("! Tuổi phải là số lớn hơn 18 !");
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
                System.out.println(" Email này đã có rồi , mời nhập lại email khác ");
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
                System.out.println("! Giới tình chỉ có thể là Nam hoặc Nữ !");
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
                System.out.println("! Ngành chỉ có thể là đầu bếp phục vụ hoặc chạy bàn !\n! Vui lòng nhập lại !");
            }
        }

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
            double gio_lam_viec=sc.nextInt();
            if (gio_lam_viec==1|| gio_lam_viec==2||gio_lam_viec==3)return gio_lam_viec;
            } catch (InputMismatchException e){
                System.out.println("Vui lòng nhập lại ca làm ");
                sc.nextLine();
            }

//            try {
//                choice= sc.nextInt();
//            }catch (InputMismatchException e){
//                System.out.println("nhap lai deeeeee");
//                sc.nextLine();
//            }
        }

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
            System.out.println("_____________________________________");
            System.out.println("|   1.Thêm nhân viên full time      |");
            System.out.println("|___________________________________|");
            System.out.println("|   2.Thêm nhân viên parttime       |");
            System.out.println("|___________________________________|");
            System.out.println("|   3.Thoát                         |");
            System.out.println("_____________________________________");
            int choice=-1;
            try {
                choice= sc.nextInt();
            }catch (InputMismatchException e){
                System.out.println("nhap lai deeeeee");
                sc.nextLine();
            }
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

//    Phuong thuc xoa
    public static void removeNhanVienDaotao(){
        System.out.println("Nhập tên nhân viên cần đuổi");
        String nameRemove=sc.nextLine();
        int check=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTen().equals(nameRemove)&&list.get(i).toString().contains("NhanVienDaoTao")){
                list.remove(i);
                i--;
                check++;
            }
        }if (check==0) System.out.println("Không có người này trong danh sách nhân viên này \n Xin vui lòng lựa lại" );
    }
    public static void removeNhanVienTuyenSinh(){
        System.out.println("Nhập vào tên nhân viên bạn cần đuổi");
        String nameRemove=sc.nextLine();
        int check=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTen().equals(nameRemove)&&list.get(i).toString().contains("NhanVienTuyenSinh")){
                list.remove(i);
                i--;
                check++;
                System.out.println("! Đã bị đuổi việc !");
            }
        }if (check==0) System.out.println("Không có người này tronng danh sách nhân viên \n Xin vui lòng lựa lại");

    }
    public static void menu(){
        while (true){
            System.out.println("_______________________________________");
            System.out.println("|   1.Thêm nhân viên                  |");
            System.out.println("_______________________________________");
            System.out.println("|   2.Đuổi nhân viên                  |");
            System.out.println("_______________________________________");
            System.out.println("|   3.Hiển thị doanh thu nhân viên    |");
            System.out.println("_______________________________________");
            System.out.println("|   4.Tìm kiếm nhân viên              |");
            System.out.println("_______________________________________");
            System.out.println("|   5.Sắp xếp nhân viên theo tên      |");
            System.out.println("_______________________________________");
            System.out.println("|   6.Sắp xếp nhân viên theo doanh thu|");
            System.out.println("_______________________________________");
            System.out.println("|   7.Hiển thị toàn bộ nhân viên      |");
            System.out.println("_______________________________________");
            System.out.println("|   8.Thoát                           |");
            System.out.println("_______________________________________");
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
                    System.err.println("! Số vừa nhập không hợp!");
                    continue;
            }
        }
    }
}
