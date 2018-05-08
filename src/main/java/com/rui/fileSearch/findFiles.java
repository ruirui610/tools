package com.rui.fileSearch;

import java.io.File;

public class findFiles {
    //递归查找某个目录下面的文件
    //这个版本不考虑通配符情况，只是根据文件名来查找
    public String findFile(String baseDirName,String filename){
        File baseDir = new File(baseDirName);
        if (!baseDir.exists()||!baseDir.isDirectory()){
            return null;
        }
        String tempName = null;
        File tempFile;
        String result = null;

        File[] files = baseDir.listFiles();
        //如果目录为空
        if (files==null){
            return null;
        }
        for (int i=0;i<files.length;i++){
            tempFile = files[i];
            if (tempFile.isDirectory()){
                result = findFile(tempFile.getAbsolutePath(),filename);
            }else if (tempFile.isFile()){
                tempName = tempFile.getName();
                //如果能查找到文件，后续就不需要判断了
                if (tempName.equals(filename)){
                    return tempFile.getAbsolutePath();
                }
            }
            if (result!=null){
                return result;
            }
        }
        return null;
    }
}
