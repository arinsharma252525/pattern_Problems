//Hollow Rectangle
public class Pattern5{
    public static void hollow_rectangle(int totalRows, int totalColumns){
        for(int i = 1; i <= totalRows; i++){
            for(int j = 1; j <= totalColumns; j++){
                if(i == 1 || i == totalRows || j == 1 || j == totalColumns){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    } 
    public static void main(String [] args){
     hollow_rectangle(4, 10);
    } 
}

/*
 * Time Complexity: O(totalRows * totalColumns)
 * Space Complexity: O(1)
 */