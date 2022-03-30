package com.syntax.Class24;
/*
Create a class File that will have the following behaviors:
open, edit, close.
Edit and close are implemented method while open is an abstract.
Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open
 behaviour: Example: to open .java file we need notepad++ or sublime text, to open .doc file
  we need Microsoft Word to be installed etc
*/
abstract class File{
    abstract void open();
  void edit(){
      System.out.println("Editing a class");
  }
  void close(){
      System.out.println("Closing the file");
  }

}
class JavaFile extends File{
    @Override
    void open(){
        System.out.println("Use inteligie to open java file");
    }

}
class WordFile extends File{
    @Override
    void open(){
        System.out.println("Use microsoft word to open this file");
    }
}
class PDFFile extends File{
    @Override
    void open(){
        System.out.println("Use adobe reader to open the file");
    }
}
public class Task {
   /* File[] file={new JavaFile(),new PDFFile(),new WordFile()};
    file[0].
*/
    //if a method not present inside the parent class we cannot call that method using polymorphism





}