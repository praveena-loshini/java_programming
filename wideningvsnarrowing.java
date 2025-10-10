mport java.util.*;
public class Main{
    public static void main(String[] args){
       int i=100;
       long l=i;System.out.println("widening"+l);
     
       byte b=(byte)i;System.out.println("compileerror-narrowing"+b);
       float f=l;System.out.println("widenoing"+f);
       short s=(short)f;System.out.println("compilerro-narrowing"+s);
       
    }
}
