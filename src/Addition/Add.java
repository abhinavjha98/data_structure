package Addition;
import java.util.*;
public class Add {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    int a,b,c;
    
    System.out.println(""+"Enter first number");
    a = sc.nextInt();
    
    System.out.println(""+"Enter second number");
    b = sc.nextInt();
    
    c = addition(a,b);
        System.out.println(""+"Addition is "+c);
    }
    static int addition(int x,int y){
        return x+y;
    }
}
