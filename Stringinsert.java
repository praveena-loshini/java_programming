import java.util.*;
class Main {
    public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String n=s.nextLine();
String n1=s.nextLine();
int a=s.nextInt();
StringBuilder sb=new StringBuilder(n);
sb.insert(a,n1);


System.out.println(sb);
}}
