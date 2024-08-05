import java.util.Scanner;
class starthwithH
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        
        boolean startsWithH = false;
        if (input.startsWith("h") || input.startsWith("H")) {
            startsWithH = true;
        }

        System.out.println("Does the string start with 'h' or 'H'? " + startsWithH);
        
        
    }
}

	