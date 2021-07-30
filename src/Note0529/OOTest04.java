package Note0529;

public class OOTest04 {
    public static void main(String[] args) {
        //创建一个丈夫对象
        Husband huangXiaoMing=new Husband();
        huangXiaoMing.name="黄晓明";
        //创建一个妻子对象
        Wife baby=new Wife();
        baby.name="baby";
        //结婚【能通过丈夫找到妻子，通过妻子也可以找到丈夫】
        huangXiaoMing.w=baby;
        baby.h=huangXiaoMing;
        //得到以上“黄晓明”的妻子的名字
        System.out.println(huangXiaoMing.name+"的妻子的名字叫："+baby.name);
        System.out.println(huangXiaoMing.name+"的妻子的名字叫："+huangXiaoMing.w.name);
    }

    //丈夫类
    public static class Husband {
        //姓名
        String name;
        //丈夫对象当中含有妻子对象的内存地址
        Wife w;
    }

    //妻子类
    public static class Wife {
        //姓名
        String name;

        //妻子对象当中还有丈夫引用
        Husband h;
    }
}
