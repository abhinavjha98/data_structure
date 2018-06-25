import java.util.*;
import java.util.Scanner;
public class Function {
    public static void main(String args[]){
        Scanner src = new Scanner(System.in);
        String rc;
        int rd;
        System.out.println("Enter number of records");
        rc=src.nextLine();
        rd=Integer.parseInt(rc);
        Student a = new Student();
     
        a.getName();
       a.Roll();
        a.display();
        
    }
}
class Student extends Function{
    String name;
    int ro;
   public String getName(){
        Scanner src =new Scanner(System.in);
        System.out.println("Enter your name");
        name=src.nextLine();
        return name;
    }
   public int Roll(){
        Scanner src=new Scanner(System.in);
         System.out.println("Enter your roll no");
         ro = src.nextInt();
        return ro;
}
   public void display(){
       System.out.println("Your name is "+name+"\n"+"Your roll number "+ro);
   }
}
