import java.util.*;
class Main {
    public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
StringBuilder sb=new StringBuilder(s1);
if(sb==sb.reverse()){
    System.out.println("palindrome");
}else{
    System.out.println("Not palindrome");
}
    }
}
