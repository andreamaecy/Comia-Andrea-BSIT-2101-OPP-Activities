import java.util.Scanner;

public class MultiplicationTable {
    public static void main (String[] args){

        Scanner user_inputs = new Scanner (System.in);

    
        System.out.print("Enter the size of the multiplication table: ");
        int size_table = user_inputs.nextInt();

        int[][] MultiplicationTable = new int[size_table + 1][size_table + 1];

        for (int i = 0; i<= size_table; i++){
            for (int j = 1; j<=size_table; j++){
                MultiplicationTable[i-1][j-1] = i * j;
            }
        }
        System.out.print("Multiplication Table: ");
        for(int i= 1; i<=size_table; i++){
            for (int j = 1; j<=size_table; j++){
                System.out.printf("%4d" , MultiplicationTable[i][j]);
            }
        }
         user_inputs.close();
    } 
}
