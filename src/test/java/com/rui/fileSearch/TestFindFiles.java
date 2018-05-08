package com.rui.fileSearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFindFiles {
    @Test
    public void testFindFile(){
        String baseDirName = "G://";
        String fileName = "Test1.py";
        findFiles find = new findFiles();
        String result = find.findFile(baseDirName,fileName);
        assertEquals("G:\\python\\workspace\\think\\Test1.py",result,"文件查找");
    }
}
