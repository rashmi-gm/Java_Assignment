package oops_question;
class Student{
    String name;
    int rollnumber;
    int marks;

    void display(){

        System.out.println("Name: " + name);
        System.out.println("Rollno: " + rollnumber);
        System.out.println("Marks:" + marks);
        System.out.println("----------------------------------");
    }

}
public class DetailsOfTwoStudent {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "ravi";
        s1.rollnumber = 101;
        s1.marks = 10;
        Student s2 = new Student();
        s2.name ="Rashmi";
        s2.rollnumber = 202;
        s2.marks = 50;
        System.out.println("Student Details");

        s1.display();
        s2.display();

    }

              }

