//Diamond
public class Pattern13{
    public static void Diamond(int n){
        //First Half
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Second Half
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main (String [] args){
        Diamond(15);
    }
}

/*
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */