import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        TrafficLight l=new TrafficLight();
        System.out.println(l.color);
        l.checkcolor();
        l.changecolor("green");
        l.checkcolor();
    }
}
class TrafficLight{
    String color="blue";
    int duration=90;
    
    void changecolor(String color){
       this.color=color; 
       System.out.println("changed color:"+color);
    }
    void checkcolor(){
    if(color.equals("red")||color.equals("green")){
        System.out.println("yes color is red or green");
    }else{
        System.out.println("no it is not red or green");
    }
    }
output:
blue
no it is not red or green
changed color:green
yes color is red or green
