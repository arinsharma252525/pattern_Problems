//Half Pyramid
public class Pattern3 {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

/*
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */