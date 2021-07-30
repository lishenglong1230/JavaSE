package Note0605;

public class FinalTest03 {
    public static void main(String[] args) {
        User u = new User(100);
        //程序执行到此处表示以上对象已变成垃圾数据，等待垃圾回收器的回收。
        u = new User(200);

        final User user=new User(30);
        System.out.println(user.id);//30
        //final修饰的应用，一旦指向某个对象之后，不能在指向其它对象，那么被指向的对象无法被垃圾回收期回收。
        //user=new User(50);
        //user=null;
        user.id=50;//final修饰的引用虽然指向某个对象之后不能指向其它对象，但是所指向的对象内部的内存是可以被修改的。
        System.out.println(user.id);//50

    }
}
