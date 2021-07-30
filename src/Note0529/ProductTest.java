package Note0529;
/*
    每一个类中都可以编写主方法，但是一般情况下，
    一个系统只有一个入口，所有主方法一般写一个。
 */
public class ProductTest {//商品测试类
    //程序入口
    public static void main(String[] args) {
        //创建对象，商品对象
        //iphone7局部变量
        //iphone7引用
        //iphone7变量中保存内存地址指向堆内存当中的商品对象
        Product iphone7=new Product();
        //访问实例变量的语法：引用.变量
        //读取：引用.变量名
        System.out.println("商品的编号："+iphone7.productNo);
        System.out.println("商品的单价："+iphone7.price);

        //修改：引用.变量名=
        iphone7.productNo=111;
        iphone7.price=6800.0;
        System.out.println("商品的编号："+iphone7.productNo);
        System.out.println("商品的单价："+iphone7.price);

        //编译报错：实例变量必须先创建对象，通过引用.的方式访问，不能直接使用类名.的方式访问
        /*
        System.out.println(Product.productNo);
        System.out.println(Product.price);
         */
    }

    public static class Product {
        //编号
        int productNo;
        //单价【通常是一个数字，但是数字可能带有小数，所以采用浮点型数据doube表示】
        //price是基本数据类型
        double price;
    }
}
