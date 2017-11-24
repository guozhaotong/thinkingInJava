package chapter10;

/**
 * @author 郭朝彤
 * @date 2017/11/23.
 */
class WithInner{
    class Inner {}
}

public class InheritInner extends WithInner.Inner{
    InheritInner(WithInner wi){wi.super();}
    public static void main(String[] args){
        WithInner withInner = new WithInner();
//        InheritInner inheritInner = new InheritInner(withInner);
    }
}
