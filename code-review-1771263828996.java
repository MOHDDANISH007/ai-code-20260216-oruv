public class Main {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 49;

        try {
            int result = add(num1, num2);
            System.out.println("Addition of two numbers is " + result);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }
}