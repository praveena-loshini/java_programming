import java.util.Scanner;
import java.math.BigInteger;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        BigInteger a=new BigInteger(s.nextLine());
        BigInteger b=new BigInteger(s.nextLine());
        BigInteger c=new BigInteger(s.nextLine());
        System.out.println(a.add(b).add(c));
    }
}
