package Note0603;

public class User1Test {
    public static void main(String[] args) {
        User1 u1=new User1(100,"zhangsan");
        System.out.println(u1.getId());
        System.out.println(u1.getName());

        //想修改名字
        u1.setName("lsii");
        System.out.println(u1.getName());

    }

    /*
            "this."什么时候不能省略？
                用来区分局部变量和实例变量的时候，"this."不能省略。
         */
    public static class User1 {


        private int id;
        private String name;
        //构造方法
        public User1(int id, String name) {
            this.id = id;
            this.name = name;
        }

        //setter and getter
        /*public void setId(int a){
            id =a ;
        }
         */
        //以下程序的id和实例变量的id无关，不能采用这种方式
        /*
        public void setId(int id){
            id=id;
        }
         */
        public void setId(int id){
            //等号前边的this.id是实例变量id
            //等号后边的id是局部变量id
            this.id=id;
        }
        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
