import java.util.*;
class Main { public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
s.nextLine();
String[] arr=new String[n];
for(int i=0;i<n;i++){
    arr[i]=s.nextLine();}
StringBuilder sb=new StringBuilder();
for(int i=0;i<n;i++){
     sb.append(arr[i]);
     if(i!=n-1){
         sb.append(',');
     }
    }
    System.out.println(sb);
}}
