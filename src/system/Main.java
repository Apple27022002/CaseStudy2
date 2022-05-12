package system;

import qlnvmenu.QLNV;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        QLUser qlUser = new QLUser();
        Scanner scanner = new Scanner(System.in);
        String flag;
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("=================1.Đăng Nhập======================");
            System.out.println("==                                              ==");
            System.out.println("=================2.Đăng kí========================");
            System.out.println("==                                              ==");
            System.out.println("=================0.Thoát==========================");
            System.out.println("==                                              ==");
            System.out.println("=================Nhập lựa chon====================");
            try {
                choice = scanner.nextInt();
//      bắt ngoại lệ1
            } catch (InputMismatchException a) {
                System.err.println("nhập sai , trở lại menu");
                scanner.nextLine();
            }
            switch (choice) {
                case 1:
                    System.out.println("Mời bạn đăng nhập : ");
                    System.out.println("                                     ");
                    System.out.println("Nhập username : ");
                    String name = sc.nextLine();
                    System.out.println("Nhập userpass : ");
                    String pass = sc.nextLine();
                    if (qlUser.find(name, pass) != -1) {
                        System.out.println("===========BẠN ĐÃ ĐĂNG NHẬP THÀNH CÔNG============");
                        QLNV.menu();
                        break;
                    }



                case 2:
                        System.out.println("======Chào mừng bạn đến với trang đăng kí !=======");
                        System.out.println("==                                              ==");
                        System.out.println("Nhập username : ");
                        name= sc.nextLine();
                        System.out.println("Nhập userpass : ");
                        pass = sc.nextLine();
                       qlUser.add(new User(name, pass));
                        do {
                            System.out.println("Bạn muốn đăng kí tiếp không y/n");
                            flag = sc.nextLine();
                        } while (!flag.equals("y") && !flag.equals("n"));
                    break;
            }
        }while (choice!=3);
    }
}
