package chapter14;

import chapter10.BigEgg2;

import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * @author 郭朝彤
 * @date 2017/11/29.
 */
public class ShowMethods {
    public static void main(String[] args) throws ClassNotFoundException {
        Method[] methods = Class.forName("chapter10.BigEgg2").getMethods();//要用类的全称，包括包名的。除非是同一个包下面。
        Pattern pattern = Pattern.compile("\\w+\\.");
//        for(Method m : methods){
//            System.out.println(pattern.matcher(m.toString()).replaceAll(""));
//        }
        BigEgg2 bigEgg2 = new BigEgg2();
        Method g = null;
        try {
            g = bigEgg2.getClass().getDeclaredMethod("main");
            g.setAccessible(true);
            g.invoke(bigEgg2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
