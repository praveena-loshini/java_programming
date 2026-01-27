import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Employee e=new Employee("ram","mananger",1000.00);
    e.display();
    e.updatesalary(10);
    e.display();
}}
class Employee{
    String name,title;
    Double salary;
    Employee(String n,String t,Double s){
        this.name=n;
        this.title=t;
        this.salary=s;
    }
    public void updatesalary(int percentage){
        salary=salary+((salary*percentage)/100);
    }
    public void display(){
        System.out.println("name:"+name+" job:"+title+" salary:"+salary);
    }
}op:
name:ram job:mananger salary:1000.0
name:ram job:mananger salary:1100.0
