import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        int n=s1.length();
        boolean palindrome=true;
        for(int i=0,j=n-1;i<n;i++,j--){
            char c=s1.charAt(i);
            char c1=s1.charAt(j);
            if(c!=c1){
                palindrome=false;
                break;
            }}
            if(palindrome){System.out.println("palindrome");
            }else{
                System.out.println("not palindrome");
            }
        }}
