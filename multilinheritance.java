class Addition {
    public void add() {
        int a = 20;
        int b = 50;
        int c = a + b;
        System.out.println(c);
    }
}

class Subtraction extends Addition {
    void sub() {
        int a = 40;
        int b = 40;
        int c = a - b;
        System.out.println(c);
    }
}

class Multiplication extends Subtraction {
    void mul() {
        int x = 40;
        int y = 20;
        int z = x * y;
        System.out.println(z);
    }
}

public class multilinheritance {
    public static void main(String[] args) {
        Multiplication m1 = new Multiplication();
        m1.add();
        m1.sub();
        m1.mul();
    }
}
