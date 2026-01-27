
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    Person p=new Person(2,s.nextLine());
        Person p1=new Person(40,"seeta");
    System.out.println("age:"+p.age+" name:"+p.name);
        System.out.println("age:"+p1.age+" name:"+p1.name);

    }}
    class Person{
        int age;String name;
        Person(int age,String name){
            this.age=age;
            this.name=name;
        }
    }
