import java.util.*;
public class Main{
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       Person p=new Person("john",30);
       System.out.println(p);
       
    }
}
public class Person{
    String n;
    int a;
    Person(String n,int a){
        this.a=a;
        this.n=n;
    }
    public String toString(){
        return " age:"+a+"name:"+n;    }
}
