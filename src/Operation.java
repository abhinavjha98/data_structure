import java.util.ArrayList;
public class Operation extends Students{

    public Operation(int Roll_no, String name, double marks) {
        super(Roll_no, name, marks);
    }
void display(ArrayList<Students>v){
        for (Students s : v) {
      System.out.println(s);
    }    
}
}
