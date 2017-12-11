package chapter17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 郭朝彤
 * @date 2017/12/8.
 */
public class Unsupported {
    public static void main(String[] args){
        List<String> arrayList = Arrays.asList(new String[]{"1", "2"});
        arrayList.set(1,"3");
        System.out.println(arrayList);
    }
}
