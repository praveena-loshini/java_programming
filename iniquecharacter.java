import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        for(int i=0;i<s1.length();i++){
            int c=0;
            for(int j=0;j<s1.length();j++){
                if(i!=j&&s1.charAt(i)==s1.charAt(j)){
                    c+=1;
                }
            }
            if(c==0){
                System.out.println(s1.charAt(i));
                break;
            }
        }
}
}
