 import java.util.*;

 class Main {

public static void main (String[] args){

Scanner s=new Scanner(System.in); 4
StringBuilder sb=new StringBuilder (10);
System.out.println(sb.capacity()+" "+sb.length());
sb.append('a');
sb.append('a'); sb.append('a');
 sb.append('a');
sb.append('a');
sb.append('a'); sb.append('a'); sb .append('a'); sb.append('a'); sb .append('a'); sb.append('a');
System.out.println("final capacity :"+sb.capacity()+"Final length :"+sb.length());}}
