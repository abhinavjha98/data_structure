import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
 import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
public class Student
  implements Serializable
{
  public int rollNo;
  public String name;
  public double marks;
  
  public Student(int rollNo, String name, double marks)
  {
    this.rollNo = rollNo;
    this.name = name;
    this.marks = marks;
  }
  
  public String toString()
  {
    return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
  }
}
class Operations
{
  Operations() {}
  
  void display(ArrayList<Student> v)
  {
    for (Student s : v) {
      System.out.println(s);
    }
  }
  
  Student addStudent()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("RollNo: ");
    int rollNo = sc.nextInt();
    System.out.println("Name: ");
    String name = sc.next();
    System.out.println("Marks: ");
    double marks = sc.nextDouble();
    Student obj = new Student(rollNo, name, marks);
    return obj;
  }
  
  boolean deleteStudent(int rollNo)
  {
    boolean status = false;
    for (Student s : Teacher.studentDb) {
      if (rollNo == rollNo) {
        int index = Teacher.studentDb.indexOf(s);
        Teacher.studentDb.remove(index);
        status = true;
        break;
      }
    }

    return status;
  }
  
  Student searchStudent(int rollNo) {
    Student st = null;
    for (Student s : Teacher.studentDb) {
      if (rollNo == rollNo) {
        st = s;
        break;
      }
    }
   

public class Teacher
{
  public Teacher() {}
  
  static ArrayList<Student> studentDb = new ArrayList();
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Operations obj = new Operations();
    int ch;
    do
    {
      System.out.println("Select Operations");
      System.out.println("1. Add New Student");
      System.out.println("2. Delete Student");
      System.out.println("3. Search Student");
      System.out.println("4. Failed Students");
      System.out.println("5. Exit");
      System.out.println("Enter Choice : ");
      
      ch = sc.nextInt();
      switch (ch) {
      case 1: 
        Student s = obj.addStudent();
        if (s != null) {
          studentDb.add(s);
          System.out.println("Student added successfully !!!");
        }
        break;
      case 2: 
        System.out.println("Enter rollNo to be deleted: ");
        int rollNo = sc.nextInt();
        boolean deleted = obj.deleteStudent(rollNo);
        if (deleted) {
          System.out.println("Roll no " + rollNo + " deleted successfully !!!");
          System.out.println("After Deletion updated list is - ");
          obj.display(studentDb);
        }
        break;
      case 3: 
        System.out.println("Enter rollNo to be searched: ");
        int rollNo = sc.nextInt();
        Student s = obj.searchStudent(rollNo);
        if (s == null) {
          System.out.println("Roll No " + rollNo + " not found");
        } else {
          System.out.println(s);
        }
        break;
      case 4: 
        System.out.println("Enter passing marks: ");
        double pm = sc.nextDouble();
        
        ArrayList<Student> v = obj.failedStudents(pm);
        System.out.println("Failed Student's list -> ");
        obj.display(v);
      }
      
    } while (ch != 5);
    System.out.println("Bye Bye !!!");
    


    sc.close();
  }
}




    return st;
  }
  
  ArrayList<Student> failedStudents(double pm) {
    ArrayList<Student> v = new ArrayList();
    for (Student s : Teacher.studentDb) {
      if (marks < pm) {
        v.add(s);
      }
    }
    return v;
  }
}