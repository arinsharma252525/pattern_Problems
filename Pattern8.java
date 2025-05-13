//Floyd's Triangle
public class Pattern8{
    public static void floyd_Triangle(int n){
        int counter = 1;
        for(int i = 1;  i <= n; i++){
            for(int j = 1; j <= i; j++){
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
    }
}
    public static void main(String [] args){
    floyd_Triangle(4);
    }
}

/*
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */