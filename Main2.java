public class Main2 {    
    public static void main(String[] args) { 
      t3 obj = new t3();  
      obj.show(); 
  }
}
class t1 {
    void display() {
        System.out.println("t1 race");
    }
}

class t2 extends t1 {
    void show() {
        super.display();
        System.out.println("t2 also race");
    }
}

class t3 extends t2 {
    @Override
    void show() {
        super.show();
        System.out.println("t3 is slow");
    }
}


