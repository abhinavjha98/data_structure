import java.util.*;
public class vector {
    public static void main(String[] args) {
        Vector v =new Vector(3,1);
        System.out.println("Size"+v.size());
        System.out.println("Capacity:"+v.capacity());
        v.addElement(new Integer(85));
        v.addElement(new Double(45));
        Enumeration em = v.elements();
        while(em.hasMoreElements()){
            System.out.println(""+em.nextElement());
        }
    }
}
