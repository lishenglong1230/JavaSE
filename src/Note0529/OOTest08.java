package Note0529;

public class OOTest08 {
    public static void main(String[] args) {
        //先创建人对象
        Ren zhangsan=new Ren();
        //不采用系统默认值
        //手动赋值
        zhangsan.id="456789110";
        zhangsan.name="张三";
        zhangsan.sex=true;
        zhangsan.age=100;
        //再创造别墅对象
        BieShu fangzi=new BieShu();
        //不采用系统默认值
        //手动赋值
        fangzi.mianJi=500.0;
        //让别墅有主人
        fangzi.zhuRen=zhangsan;

        //想知道房子主人的名字是什么？
        System.out.println(fangzi.zhuRen.name);//张三

        //房子换主人了
        //创建一个新的主人对象
        Ren lisi=new Ren();
        lisi.name="李四";
        fangzi.zhuRen=lisi;
        System.out.println(fangzi.zhuRen.name);//李四
    }
}
