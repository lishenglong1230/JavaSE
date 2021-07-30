package Note0603pm;

public class ChineseTest {
    public static void main(String[] args) {
        Chinese zhangsan=new Chinese("1","张三");
        System.out.println(zhangsan.id+","+zhangsan.name+","+Chinese.country);

        Chinese lisi=new Chinese("2","李四");
        System.out.println(lisi.id+","+lisi.name+","+Chinese.country);

        System.out.println(Chinese.country);
        System.out.println(zhangsan.country);//警告
        zhangsan=null;
        //所有的静态的数据都是可以采用类名.，也可以采用引用.，但是建议采用类名.的方式访问。
        System.out.println(zhangsan.country);//警告，但是不会发生空指针异常。
    }
}
