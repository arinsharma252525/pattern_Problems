//0-1 Triangle
public class Pattern9{
    public static void binary_Triangle(int n){
        for(int i = 1;  i <= n; i++){
            for(int j = 1; j <= i; j++){
                if((i + j) % 2 == 0){
                   System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }  
        }System.out.println();    
    }
}
    public static void main(String [] args){
    binary_Triangle(5);
    }
}

/*
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */