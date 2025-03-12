interface animal{
    void display();
 

   interface dog extends animal{}
   interface cat extends animal{}

   interface sound extends dog, cat {}
   class soundi implements sound{
 public void display(){
    System.out.println("dog barks");
    System.out.println("cat meoews");
 }
   }
 public class interexample{
    public static void main(String[] args){
        soundi c1= new soundi();
        c1.display();
    }
 }
   



}