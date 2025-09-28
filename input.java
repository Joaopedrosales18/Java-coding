import java.util.Scanner;

public class input {
    
    public static void main(String[] args){

       double width;
       double height;
       double area;
       
       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter the width: ");
       width = scanner.nextDouble();

       System.out.println("Enter the height: ");
       height = scanner.nextDouble();

       area = width * height;

       System.out.println("Area: " + area + " cm²" );





       scanner.close();
    }
}