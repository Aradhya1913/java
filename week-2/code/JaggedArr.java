public class JaggedArr {
    public static void main(String[] args) {
     
        int arr[][]=new int[3][]; // jagged array only specifying that there is 3 rows

        arr[0]=new int[3];// First row has 3 columns
        arr[1]=new int[4];// Second row has 4 columns
        arr[2]=new int[2];// Third row has 2 columns
       
       
        // Here the array column and rows size are unknown to iterate, Therefore-
        // for rows -> "arr.length" & for iterating the number of elements in that particualar row -> "arr[i].lenght";
       
        for(int i=0;i<arr.length;i++) // Outer loop iterates over rows. 
        {
            for(int j=0;j<arr[i].length;j++)//	Inner loop iterates over available elements in that row.

            {
                arr[i][j]=(int)(Math.random()*10);
            }
        }   
        for(int n[]:arr)
        {
            for(int m:n)
            {
                System.out.println(m+" ");
            }
            System.out.println(" ");
        }
    }
}