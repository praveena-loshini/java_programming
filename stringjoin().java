import java.util.*;
class Main {
    public static void main(String[] args) {
Scanner s1=new Scanner(System.in);
String delim=s1.nextLine();
String s=s1.nextLine();
String result=String.join(delim,s.split(","));
System.out.println(result);
}
    
}
