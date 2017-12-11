package chapter15;


/**
 * @author 郭朝彤
 * @date 2017/12/4.
 */

interface GenericGetter <T extends GenericGetter<T>>{
    T get();
}

interface Getter extends GenericGetter<Getter>{}

public class GenericsAndReturnTypes {
    /**
     *  jkljlk
     * @param g jkljkl
     */
    void test(Getter g){
        Getter result = g.get();
        GenericGetter genericGetter = g.get();
    }
    public static void main(String[] args){

    }
}
