package com.lamda.Filter;

import java.io.File;
import java.io.FileFilter;

public class FileFilterAnonymous {

  public static void main(String[] args) {
   
    
    FileFilter fileFilter = new FileFilter() {

      @Override
      public boolean accept(File file) {
        return file.getName().endsWith(".java");
      }
    };
    

    File dir= new File("D:\\report");

    File [] javaFiles= dir.listFiles(fileFilter);

    for(File file: javaFiles){
      
      System.out.println(file.getName());
    }
  }


}
