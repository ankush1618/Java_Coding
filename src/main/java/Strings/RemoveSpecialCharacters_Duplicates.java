package Strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveSpecialCharacters_Duplicates {


    public static String removeSpecial_Duplicates(String str){
            String newStr=str.replaceAll("[^0-9a-zA-Z]","");
            System.out.println("String after removing special Characters :"+newStr);
            Set<Character> set=new LinkedHashSet<>();
            StringBuilder sb=new StringBuilder();
            for(char ch:newStr.toCharArray()){
                if(set.add(ch)){
                    sb.append(ch);
                }
            }
            return sb.toString();
    }


    public static void main(String[] args) {
        String str="Hel@#$%l^&*/00oo";
        System.out.println("Original String :"+str);
        String newStr=removeSpecial_Duplicates(str);
        System.out.println("String after removing Duplicates :"+newStr);
    }
}
