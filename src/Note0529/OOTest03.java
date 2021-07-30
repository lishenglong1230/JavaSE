package Note0529;

public class OOTest03 {
    public static void main(String[] args) {
        //u是引用
        //u是局部变量
        OOTest02.User u=new OOTest02.User();

        //上一个版本中编写的
        //u.addr=new Address();

        //a是引用
        //a是局部变量
        OOTest02.Address a=new OOTest02.Address();
        u.addr=a;
        System.out.println(u.addr.city);//null
        a.city="天津";
        System.out.println(u.addr.city);//天津
    }
}
