import java.util.Scanner;

public class java_09_string {
    public static void main(String[] args) {

        // String is not primitive datatype in Java. It is class provided by java.lang package.
        String name = new String("java");
        System.out.println(name);

        // String are immutable can not be change 

        // no new line
        System.out.print("The name is ");   
        System.out.print(name);

        // printf with format specifier same as c/c++
        int a = 1;
        float b = 2.3f;
        System.out.printf("a = %d, b = %f", a, b);
        
        // format is same as printf
        System.out.format("a = %d, b = %f\n", a, b);
        
        
        // take string as input
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        // System.out.printf("You entered %s\n", s);
        
        
        b = 2.3f;
        System.out.printf("b = %.5f\n", b); // with integer values this gives error
        System.out.printf("b = %8.2f", b); // after decimal their  will be 2 digits in 8 character space
    }
}
