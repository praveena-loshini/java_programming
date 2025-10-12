import java.util.*;
class Main {
    public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String n=s.nextLine();
StringBuilder sb=new StringBuilder(n);
for(int i=sb.length()-1;i>=0;i--){
    char c=sb.charAt(i);
    if(c=='a'||c=='e'||c=='o'||c=='i'||c=='u'){
        sb.deleteCharAt(i);
    }
}

System.out.println(sb);
}}
