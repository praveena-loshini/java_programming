import java.util.*;
class Main { public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
StringBuilder sb=new StringBuilder(s1);char c;
for(int i=0;i<sb.length();i++){c=sb.charAt(i);if(i==0){
       c=Character.toUpperCase(c); 
        sb.setCharAt(i,c);
    }else if(i%2!=0){
       c=Character.toLowerCase(c); 
        sb.setCharAt(i,c);
    }else{c=Character.toUpperCase(c); 
        sb.setCharAt(i,c);}
}
    System.out.println(sb);
}}
