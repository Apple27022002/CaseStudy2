package System;

import QLVNsMenu.QLNV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String userName ="Manh2002";
        String password ="2702";
        boolean checkLogin=false;
        do {
            System.out.println("Nhap tai khoan:");
            String usn=scanner.nextLine();
            System.out.println("Nhap mat khau :");
            String pw=scanner.nextLine();
           if (usn.equals(userName)&&pw.equals(password)){
               System.out.println("Dang nhap thanh cong");
               checkLogin=true;
           }else System.out.println("Sai cmnr");
        }while (!checkLogin);

        QLNV.menu();
    }

}
