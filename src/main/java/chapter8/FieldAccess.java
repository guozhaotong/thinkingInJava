package chapter8;


/**
 * @author 郭朝彤
 * @date 2017/11/20.
 */
class Super {
    public int field = 0;
    public int getField(){return this.field;}
}

class Sub extends Super{
    public int field = 1;
    public int getField(){return this.field;}
    public int getSuperField(){return super.field;}
}


public class FieldAccess {
    public static void main(java.lang.String[] args){
        Super sup = new Sub();
        System.out.println("sup.field = "+sup.field + ", sup.getField() = " + sup.getField());
        Sub sub = new Sub();
        System.out.println("sub.field = "+sub.field + ", sub.getField() = " + sub.getField() + ", sub.getSuperField() = " + sub.getSuperField());
    }
}
