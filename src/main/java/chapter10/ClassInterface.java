package chapter10;

/**
 * @author 郭朝彤
 * @date 2017/11/23.
 */
public interface ClassInterface {
    void howdy();
    class Test implements ClassInterface {
        public void howdy(){
            System.out.println("Howdy!");
        }
        public static void main(String[] args){
            new Test().howdy();
        }
    }
}
