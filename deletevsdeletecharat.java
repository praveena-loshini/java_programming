import java.util.*;
class Main { public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String n=s.nextLine();
StringBuilder sb=new StringBuilder(n);
sb.delete(1,3);
System.out.println(sb);
sb.deleteCharAt(1);
System.out.println(sb);
}}
