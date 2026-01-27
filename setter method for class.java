import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    Dog d=new Dog(s.nextLine(),s.nextLine());
    System.out.println(d.name+" "+d.breed);
    d.setname("brownie");
    d.setbreed("german shepherd");//set+variable name
    System.out.println(d.name+" "+d.breed);
}}
class Dog{
   private String name,breed;
    Dog(String name,String breed){
        this.name=name;
        this.breed=breed;
    }
    public void setname(String name){//method for that
        this.name=name;
    }
    public void setbreed(String breed){
        this.breed=breed;
    }
}
op:
whitey
chichua
whitey chichua
brownie german shepherd
