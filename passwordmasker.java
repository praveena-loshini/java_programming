import java.util.*;
class Main {
    public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
StringBuilder sb=new StringBuilder(s1);
int index=sb.length()-5;
for(int i=0;i<sb.length();i++){
    if(i<=index){
        sb.setCharAt(i,'*');
    }
}
System.out.println(sb);

    }
}
