// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        int fromBase=s.nextInt();
        int toBase=s.nextInt();
        int n=Integer.parseInt(s1,fromBase);
        System.out.println(n);
        System.out.println(Integer.toString(n,toBase));
    }
}
