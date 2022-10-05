import java.util.Scanner;
class Example12 {
    public static void main(String[] argv) {
        float x,y;
        System.out.println("Enter first number:");
//Reading the value
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        x = inputValue.nextFloat();

        System.out.println("Enter second number:");
        y = inputValue.nextFloat();
        if (x >=y) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }
    }
}
