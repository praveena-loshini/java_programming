import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String s2=s.nextLine();
        String[] s3=s2.split(" ");
        boolean pattern=true;
        if(s1.length()!=s3.length){
            pattern=false;
            return;
        }
        Map<Character,String> m=new HashMap<>();
        Map<String,Character> rev=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            String w=s3[i];
            if(m.containsKey(c)&&m.get(c).equals(w)){
                pattern=false; break;
        
            }if(rev.containsKey(w)&&rev.get(w)!=c){
                pattern=false; break;
        
            }
            m.put(c,w);
            rev.put(w,c);
        }
            System.out.println(pattern);
        
    }
}
