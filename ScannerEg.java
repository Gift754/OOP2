import java.util.Scanner;
public class ScannerEg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your height: ");
        double height = sc.nextDouble();
        System.out.println("Enter your gender: ");
        char gender = sc.next().charAt(0);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Gender: "+gender);
    }
    
}
