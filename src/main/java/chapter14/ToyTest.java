package chapter14;

import static java.lang.Class.forName;

/**
 * @author 郭朝彤
 * @date 2017/11/29.
 */

interface HasBatteries{}
interface WaterProof{}
interface Shoots{}
class TT {
    TT(){}
}
class Toy extends TT{
    Toy(){
        System.out.println("Constructed without params");
    }
    Toy(int i){
        System.out.println("Constructed with a param");
    }
}


public class ToyTest extends Toy implements HasBatteries, WaterProof, Shoots {
    ToyTest(){
        super(1);
    }
    void print(){
        System.out.println("here");
    }
    public static void main(String[] args) throws Exception{
        TT tt = new ToyTest();
        Class<ToyTest> toyTestClass = ToyTest.class;
        Toy toyTest = toyTestClass.newInstance();
        Class<? super ToyTest> up = toyTestClass.getSuperclass();
        Object toy = up.newInstance();
        System.out.println(tt instanceof ToyTest);
        ((ToyTest)tt).print();
        Class c = Toy.class;
        System.out.println(c.isInstance(toyTest));
//        tt.print();
    }
}
