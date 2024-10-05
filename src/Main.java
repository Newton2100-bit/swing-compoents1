//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("hello dear user welcome to this appliaction \n lets hope it will be a good journey ");
        int age;
        String name;
        String regNumber;
        byte yearOfStudy;
        byte semesterInYourYearOfStudy;
        String coureOfStudy;
        String ageString = JOptionPane.showInputDialog(null,"please enter your age","Getting the users age",JOptionPane.QUESTION_MESSAGE);
        age = Integer.parseInt(ageString);
        String yearOfStudyString = JOptionPane.showInputDialog(null,"please enter your age","Getting the users current year of study",JOptionPane.QUESTION_MESSAGE);
      yearOfStudy = Byte.parseByte(yearOfStudyString);
      String semesterString =  JOptionPane.showInputDialog(null,"please enter your semester","Getting the users semester",JOptionPane.QUESTION_MESSAGE);
       semesterInYourYearOfStudy = Byte.parseByte(semesterString);
      name = JOptionPane.showInputDialog(null,"please enter your name","Getting the users name",JOptionPane.QUESTION_MESSAGE);
        coureOfStudy =  JOptionPane.showInputDialog(null,"please enter your course of study","Getting the users cousre of study",JOptionPane.QUESTION_MESSAGE);
        regNumber =  JOptionPane.showInputDialog(null,"please enter your regNumber","Getting the users regNumber",JOptionPane.QUESTION_MESSAGE);
   JOptionPane.showMessageDialog(null,"Hello good evening  " +name+" Hope your week have been good.\n mine today is to confirm if the following deatails are yours \n");
   JOptionPane.showMessageDialog(null,"name = "+name+"\nage = "+age+"\nRegistartion number = "+regNumber+"\nyear of study = "+yearOfStudy);
    }
}