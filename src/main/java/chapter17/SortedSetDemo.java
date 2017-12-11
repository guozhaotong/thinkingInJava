package chapter17;

import java.util.*;

/**
 * @author 郭朝彤
 * @date 2017/12/11.
 */
public class SortedSetDemo {
    public static void main(String[] args){
//        SortedSet<String> sortedSet = new TreeSet<>();
//        Collections.addAll(sortedSet, "one two three four five six seven eight".split(" "));
//        System.out.println(sortedSet);
//        String low = sortedSet.first();
//        String high = sortedSet.last();
//        System.out.println(low);
//        System.out.println(high);
//        Iterator<String> it = sortedSet.iterator();
//        for(int i = 0; i <= 6; i++){
//            if(i == 3){
//                low = it.next();
//            }
//            if(i == 6){
//                high = it.next();
//            }
//            else {
//                it.next();
//            }
//        }
//        System.out.println(low);
//        System.out.println(high);
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(0);
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(4);
        linkedHashSet.add(5);
        linkedHashSet.add(2);
        System.out.println(linkedHashSet);
    }
}
