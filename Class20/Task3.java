package com.syntax.Class20;
/*Write a Java program called Teacher.
Identify features and behaviour of that Class. Create 3 subclasses MathTeacher,
ChemistryTeacher and PianoTeacher that would have it their own features
and behaviour. Test all 4 classes
*/
public class Task3 {
    public static void main(String[] args) {
        MathTeacher math=new MathTeacher();
        math.name="Tefyr";
      math.teschCalculus();
    }
}
class TeacherA{
    String name;
    int age;
    double weight;
    void printName(){
        System.out.println(name);
    }
}
class MathTeacher extends TeacherA{
    boolean canTeachCalculus=true;
    void teschCalculus(){
        System.out.println("Teaching ca");
    }
        }
class ChimistryTeachers extends TeacherA {
    boolean canTeachChamistry=true;
    void teschCalculus() {
        System.out.println("Teaching Chamistry");
    }
}class PianiTeacher extends TeacherA {
    boolean canTeachPiano=true;
    void teschCalculus() {
        System.out.println("Teaching Piano");
    }
}
