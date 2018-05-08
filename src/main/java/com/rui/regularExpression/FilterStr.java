package com.rui.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilterStr {
    //匹配字母
    public String isLetter(String str){
        String regEx = "[^a-zA-Z]";
        Pattern pattern = Pattern.compile(regEx);
        Matcher m = pattern.matcher(str);
        return m.replaceAll("").trim();
    }

    //匹配数字
    public String isNumber(String str){
        String regEx = "[^0-9]";
        Pattern pattern = Pattern.compile(regEx);
        Matcher m = pattern.matcher(str);
        return m.replaceAll("").trim();
    }

    //匹配汉字
    public String isChineseCharacter(String str){
        String regEx = "[^(\\u4e00-\\u9fa5)]";
        Pattern pattern = Pattern.compile(regEx);
        Matcher m = pattern.matcher(str);
        return m.replaceAll("").trim();
    }

    //匹配任意字符
    public String isPattern(String target,String pattern){
        Pattern patt = Pattern.compile(pattern);
        Matcher m = patt.matcher(target);
        return m.replaceAll("").trim();
    }
}
