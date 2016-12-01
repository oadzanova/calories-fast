package week13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest {

	public static void main(String[] args) {
        String pattern = "(\\b[a-z]+)|(\\d{3})";
        String text = " I love CS211 very much ";
        String text2 = "cat Dinosour xxxxxxxxxxxxxxxxxx y";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        while (m.find()) {
           // System.out.println("Found :" + text.substring(m.start(), m.end()) );
           System.out.print(m.group(1));
           System.out.print("   ");	
           System.out.println(m.group(2));	
        }
//        m = p.matcher(text2);
//        while (m.find()) {
//          //  System.out.println("Found :" + text2.substring(m.start(), m.end()) );
//          System.out.println(m.group(0));
//        }        

    }
    private static void printArray(String[] strings){
        for (String s:strings){
            System.out.println("\t x" + s + "x");
        }
        System.out.println("-------------------");
    }

}
