class Exe30 {
    public static int recution(int n) {
        if (n == 0 || n == 1) {
            System.out.println(n);
            return n; // Return the value of n
        }

        int result = n * recution(n - 1); // Store the result of the multiplication
        System.out.println("this is " + result);
        return result; // Return the result
    }

    public static void main(String[] args) {
        recution(5); // Call the method with a test value
    }
}
