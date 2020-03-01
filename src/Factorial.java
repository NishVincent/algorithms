
// Time complexity O(N)
public class Factorial {

    private int factorial(int n) {

        if(n <= 1 )
            return n;
        return n * factorial(n - 1);

    }

    public static void main(String[] args) {
        System.out.println(new Factorial().factorial(4));
    }
}
