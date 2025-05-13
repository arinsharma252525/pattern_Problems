//Butterfly Pattern
public class Pattern10{
    public static void Butterfly(int n){

    //First part
        for(int i = 1;  i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= 2 * (n -i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    //Second part
        for(int i = n;  i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= 2 * (n -i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main (String [] args){
        Butterfly(5);
    }
}

/*
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */