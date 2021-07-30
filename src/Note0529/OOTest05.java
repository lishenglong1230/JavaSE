package Note0529;

//测试程序
public class OOTest05 {
    public static void main(String[] args) {
        Customer c=new Customer();
        System.out.println(c.id);//0

        c=null;
        //以下程序编译可以通过，因为符合语法
        //运行出现空指针异常
        //空引用访问“实例”相关的数据一定会出现空指针异常
        //java.lang.NullPointerException
        System.out.println(c.id);///
    }

    //顾客类
    public static class Customer {
        //id
        int id;
    }
}
