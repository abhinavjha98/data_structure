import java.util.BitSet;
public class bitset {
    public static void main(String[] args) {
        BitSet b1 = new BitSet(16);
        BitSet b2 = new BitSet(16);
        System.out.println(""+b1);
        for(int i =0;i<16;i++){
            if(i%2==0){
                b1.set(i);
            }
            if(i%5==0){
                b2.set(i);
            }
        }
        System.out.println("bitset1"+b1);
        System.out.println("bitset2"+b2);
        b1.and(b2);
        System.out.println(""+b1);
        
    }
}
