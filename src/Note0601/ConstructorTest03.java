package Note0601;

public class ConstructorTest03 {
    public static void main(String[] args) {
        Customer c1=new Customer();
        System.out.println(c1.getNo());
        System.out.println(c1.getName());
        System.out.println(c1.getBirth());

        Customer c2=new Customer(1111,"zhangsan","1980-1-11");
        System.out.println(c2.getNo());
        System.out.println(c2.getName());
        System.out.println(c2.getBirth());
    }
}
