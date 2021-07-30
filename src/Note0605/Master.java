package Note0605;
//主人类
    //这种方法没有使用java语言当中的多态机制，存在的缺点：Master的扩展力很差，因为只要加一个新的宠物，Master类就需要添加新的方法。
    /*public void feed(Cat4 c){
        c.eat();
    }
    public void feed(Dog d){
        d.eat();
    }
     */
    //Master和Cat、Dog这两个类型的关联程度很强。
    //降低程序的耦合度【解耦合】，提高程序的扩展力【软件开发的一个很重要的目标】

public class Master {
    //Master主人类面向的是一个抽象的Pet，不再面向具体的宠物
    public void feed(Pet pet){//Pet pet 是一个父类型的引用
        pet.eat();
    }
}
