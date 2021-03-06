package chapter8;

import java.util.List;

/**
 * @author 郭朝彤
 * @date 2017/11/20.
 */

class Meal{
    Meal(){
        System.out.println("Meal();");
    }
}

class Bread {
    Bread(){
        System.out.println("Bread();");
    }
}

class Cheese {
    Cheese(){
        System.out.println("Cheese();");
    }
}

class Lettuce {
    Lettuce (){
        System.out.println("Lettuce();");
    }
}

class Lunch extends Meal{
    Lunch(){
        System.out.println("Lunch();");
    }
}

class PortableLunch extends Lunch {
    PortableLunch (){
        System.out.println("PortableLunch();");
    }
}
public class Sandwich extends PortableLunch{
    private Bread bread = new Bread();
    private Cheese cheese = new Cheese();
    private Lettuce lettuce = new Lettuce();
    public Sandwich(){
        System.out.println("Sandwich();");
    }
    public static void main(String[] args){
        System.out.println("Hello world!");
        new Sandwich();
    }
}
