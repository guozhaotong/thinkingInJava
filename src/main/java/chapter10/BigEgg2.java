package chapter10;

/**
 * @author 郭朝彤
 * @date 2017/11/23.
 */
class Egg2{
    protected class Yolk{
        public Yolk(){
            System.out.println("Egg2().York()");
        }
        public void f(){
            System.out.println("Egg2.York.f()");
        }

    }
    private Yolk y;
//    private Yolk y = new Yolk();
    public Egg2(){
        System.out.println("New Egg2()");
    }
    public void insertYolk(Yolk yy){
        y = yy;
    }
    public void g(){
        y.f();
    }
}


public class BigEgg2 extends Egg2{
    public class Yolk extends Egg2.Yolk{
        public Yolk(){
            System.out.println("BigEgg2.Yolk()");
        }
        public void f(){
            System.out.println("BigEgg2.Yolk.f()");
        }
    }
    public BigEgg2(){
        insertYolk(new Yolk()) ;
    }

    public int anInt;

    public static void main(String[] args){
        Egg2 egg2 = new BigEgg2();
//        Egg2 egg2 = new Egg2();
        System.out.println();
        egg2.g();
    }
}
