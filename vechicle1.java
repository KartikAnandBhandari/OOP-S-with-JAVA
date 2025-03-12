interface car{
    void display();

    interface bike extends car{}
    interface rmw extends car{}

    interface com extends bike, rmw{}
    class vec1 implements com{
 public void display(){
    System.out.println("car is on road");
System.out.println("bike is on road");
    }
    }

    public class vechicle1{
public static void main(String[]args){
    vec1 c1= new vec1();
    c1.display();
}
    }
}