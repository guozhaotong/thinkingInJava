package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static java.util.Collections.sort;

/**
 * @author 郭朝彤
 * @date 2017/11/23.
 */
public class AddingGroups {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        Collections.addAll(arrayList, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        arrayList.addAll(Arrays.asList(0,1,2,5,3,4));
//        arrayList.remove(2);
//        System.out.println(arrayList.get(2));
        sort(arrayList);
        arrayList.add(3,3);
        arrayList.forEach( i ->System.out.println(i));
    }
}
