package com.rui.regularExpression;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFilterStr {
    @BeforeEach
    @DisplayName("用例开始执行前")
    void start(){

    }

    @AfterEach
    @DisplayName("用例执行后")
    void end(){
        System.out.println("用例执行完~~~~");
    }

    @Test
    public void testIsLetter(){
        String str = "13bacd44...";
        FilterStr filterStr = new FilterStr();
        assertEquals("bacd",filterStr.isLetter(str),"英文字母过滤");
    }

    @Test
    public void testIsNumber(){
        String str = "13bacd44...";
        FilterStr filterStr = new FilterStr();
        assertEquals("1344",filterStr.isNumber(str),"数字过滤");
    }

    @Test
    public void testIsChineseCharacter(){
        String str = "张瑞6666";
        FilterStr filterStr = new FilterStr();
        assertEquals("张瑞",filterStr.isChineseCharacter(str),"中文过滤");
    }
}
