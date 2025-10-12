import java.util.*;
class Main {
    public static void main(String[] args){
 Scanner s=new Scanner(System.in);
 String a=s.nextLine();
 String b=s.nextLine();
 String c=s.nextLine();
 StringBuilder sb=new StringBuilder(a);
 int index;
 while((index=sb.indexOf(b))!=-1){
     sb.replace(index,index+b.length(),c);
 }
 System.out.println(sb);   }
}
