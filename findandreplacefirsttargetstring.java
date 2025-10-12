import java.util.*;
class Main { public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String name=s.nextLine();
String name1=s.nextLine();
StringBuilder sb=new StringBuilder(name);
int index=sb.indexOf(name1);

sb.replace(index,index+name1.length(),"");

System.out.println(sb);
}}
