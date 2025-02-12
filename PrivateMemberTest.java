class SuperClass {
    private int privateVar = 42;

    public int getPrivateVar() {
        return privateVar;
    }
}

class SubClass extends SuperClass {
    public void display() {
        System.out.println("Accessing privateVar through getter: " + getPrivateVar());
    }
}

public class PrivateMemberTest {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.display();
    }
}