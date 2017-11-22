package chapter10;

/**
 * @author 郭朝彤
 * @date 2017/11/22.
 */
public class OutStaticInnerClass {
    class InnerClass1 {
        int i = 0;
    }

    static class InnerClass2 {
        int anInt = 2;
    }

    public static void main(String[] args){
        InnerClass2 innerClass2 = new InnerClass2();
//        InnerClass1 innerClass1 = new InnerClass1();
        OutStaticInnerClass outStaticInnerClass = new OutStaticInnerClass();
        InnerClass1 innerClass1 = outStaticInnerClass.new InnerClass1();
    }
}
