import java.util.ArrayList;
import java.util.Scanner;
class operation{
    void display(ArrayList<Students>v){
        for (Students s : v) {
      System.out.println(s);
    }    
    
}
    Students adds()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("RollNo: ");
    int rollNo = sc.nextInt();
    System.out.println("Name: ");
    String name = sc.next();
    System.out.println("Marks: ");
    double marks = sc.nextDouble();
    Students obj = new Students(rollNo, name, marks);
    return obj;
  }
    boolean deleteStudent(int rollNo)
  {
    boolean status = false;
    for (Student s : operation.Teachers.studentDb) {
      if (rollNo == rollNo) {
        int index = operation.Teachers.studentDb.indexOf(s);
        Operations.Teacher.studentDb.remove(index);
        status = true;
        break;
      }
    }

    return status;
  }
    class Teachers{
         public static void main(String[] args) {
        ArrayList<Students> std =new ArrayList();
        Scanner sc = new Scanner(System.in);
        operation obj = new operation();
         int ch;
         while(true){
      System.out.println("1. Add New");
      System.out.println("2. Delete ");
      System.out.println("3. Search ");
      System.out.println("4. Failed ");
      System.out.println("5. Exit");
      System.out.println("Enter Choice : ");
      ch =sc.nextInt();
      switch(ch){
          case 1:
              break;
          case 2:
              break;
          case 3:
              break;
      }
         }
    }}
    }

public class Teachers  extends Students{
    public static void main(String[] args) {
        ArrayList<Students> std =new ArrayList();
        Scanner sc = new Scanner(System.in);
        operation obj = new operation();
         int ch;
         while(true){
      System.out.println("1. Add New");
      System.out.println("2. Delete ");
      System.out.println("3. Search ");
      System.out.println("4. Failed ");
      System.out.println("5. Exit");
      System.out.println("Enter Choice : ");
      ch =sc.nextInt();
      switch(ch){
          case 1:
              break;
          case 2:
              break;
          case 3:
              break;
      }
         }
    }

    public Teachers(int Roll_no, String name, double marks) {
        super(Roll_no, name, marks);
    }
}
