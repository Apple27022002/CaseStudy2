package system;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class QLUser { private UserFile userFile;
    List<User> userList=new ArrayList<>();
    public static Calendar curentusers=null;


    public QLUser() throws FileNotFoundException {
        userList=UserFile.readFromFile();
    }

    public QLUser(List<User> userList) {
        this.userList = userList;
    }
    public void add(User user) throws FileNotFoundException {
        userList.add(user);
        System.out.println("Bạn đã đăng kí thành công ");
        UserFile.writeToFile(userList);
    }

    public int find(String username,String pass) {
        for (int i = 0; i < userList.size(); i++) {
            if (username.equals(userList.get(i).getName()) && (userList.get(i).getPass().equals(pass))) {
                return i;
            }
        }
        return -1;
    }
    public String display(String name,String pass){
        String str = "name";
        for (User user : userList) {
            if (name.equals(user.getName())&&(user.getPass().equals(pass)))
                str += user.getName();
        }
        return str;
    }
    public void displayInfor(String name,String pass){
        for (User user : userList) {
            if (name.equals(user.getName())&&(user.getPass().equals(pass)))
                System.out.println(user);;
        }
    }
    public void edit(String name,String pass, User user) {
        int index = find(name, pass);
        userList.set(index, user);
    }


}
