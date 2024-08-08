import java.util.ArrayList;

class ArrayList6 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();  // Type-safe ArrayList
        a1.add(20);
        a1.add(30);
        a1.add(40);
        
        a1.remove((Integer) 12);  // Attempt to remove the element with value 12
        
        System.out.println(a1);  // Print the ArrayList
    }
}
