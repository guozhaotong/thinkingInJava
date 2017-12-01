package chapter13;

import chapter10.BigEgg2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 郭朝彤
 * @date 2017/11/30.
 */
public class PriceMatch {
    public static void main(String[] args){
        String[] strings = {"", ""};
        String s = "The price of the shirt is 18$. ";
        Pattern pattern = Pattern.compile("\\w+\\$");
        Matcher matcher = pattern.matcher(s);
//        while (matcher.find()){
//            System.out.println(matcher.group());
//        }
        if(matcher.matches()){
            System.out.println("here.");
            System.out.println(matcher.group(0));
        }
        List<String> list = new ArrayList<>();

    }
}
