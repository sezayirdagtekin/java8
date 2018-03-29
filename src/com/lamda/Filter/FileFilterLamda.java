package com.lamda.Filter;

import java.io.File;
import java.io.FileFilter;

/**
 * 
 * @author dagtekin
 *
 */
public class FileFilterLamda {

  public static void main(String[] args) {


    FileFilter fileFilter = p -> p.getName().endsWith(".java");


    File dir = new File("D:\\report");
    File[] javaFiles = dir.listFiles(fileFilter);

    for (File file : javaFiles) {

      System.out.println(file.getName());
    }
  }


}
