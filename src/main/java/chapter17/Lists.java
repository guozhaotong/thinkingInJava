package chapter17;

import java.util.ArrayList;

/**
 * @author 郭朝彤
 * @date 2017/12/11.
 */
public class Lists {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println(arrayList);
        arrayList.remove(3);
        arrayList.set(3,1);
        System.out.println(arrayList);
    }
}
