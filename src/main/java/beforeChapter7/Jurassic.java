package beforeChapter7;

/**
 * @author 郭朝彤
 * @date 2017/11/18.
 */
final class Dinosaur{
    int i = 7;
    int j = 9;
    void f(){}
    public String toString(){
        return "i="+this.i+", j="+this.j;
    }
}

public class Jurassic {
    public static void main(String[] args){
        Dinosaur dinosaur = new Dinosaur();
        dinosaur.f();
        dinosaur.i = 40;
        dinosaur.j = 90;
        System.out.println(dinosaur.toString());
    }
}
