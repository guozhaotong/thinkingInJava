package chapter16;

import java.util.Arrays;

/**
 * @author 郭朝彤
 * @date 2017/12/5.
 */
public class ArraySearching {
    public static void main(String[] args){
        int[] a = {0,1,1,1,3};
        Arrays.sort(a);
        int b = Arrays.binarySearch(a,-1);
        System.out.println(b);
    }
}
