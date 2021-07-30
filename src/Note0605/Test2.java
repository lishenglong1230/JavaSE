package Note0605;

public class Test2 {
    public static void main(String[] args) {
        //向上转型
        Animal a1=new Cat();
        Animal a2=new Bird();

        //向下转型
        if(a1 instanceof Cat){
            Cat c1=(Cat)a1;
        }
        if(a2 instanceof Bird){
            Bird b1=(Bird)a2;
        }
    }
}
