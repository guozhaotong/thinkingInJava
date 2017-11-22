package chapter8;

/**
 * @author 郭朝彤
 * @date 2017/11/22.
 */
interface GrandFather {
    void print();
//    {
//        System.out.println("grandFather");
//    }
}

public class Father implements GrandFather {
    public void print(){
        System.out.println("father");
    }

    void printFather(){
        System.out.println("print father");
    }

    public static void main(String[] args){
        GrandFather father = new Father();
//        father.printFather();
        ((Father) father).printFather();
    }
}


class child implements GrandFather{

    public void print() {

    }
}