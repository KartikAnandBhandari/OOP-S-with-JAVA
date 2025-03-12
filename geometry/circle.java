package geometry;

public class circle{
   double radius;
   double area;

   public circle(){
      this(2.33);
   }
   public circle (double radius){
      this.radius=radius;
      this.area=Math.PI*radius*radius;
   }
  public double getradius(){
   return radius;
  }
  public void setradius(){
   this.radius=radius;
   this.area=Math.PI*radius*radius;
  }
  public double setarea(){
   return area;
  }
  public void display(){
   System.out.println("radius:" + radius);
   System.out.println("area" + area);
  }
}







