public class MultiArrays {
    public static void main(String[] args) {
        
        int arr[][] = new int[3][4];
        int arr1[][][]=new int[1][2][3];

 // Manual Method to Insert Array Elements 

        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[0][3]=4;

        arr[1][0]=5;
        arr[1][1]=6;
        arr[1][2]=7;
        arr[1][3]=8;
       
        arr[2][0]=9;
        arr[2][1]=10;
        arr[2][2]=11;
        arr[2][3]=12;

// Loop based Random number to Insert Values to Array           
         
            for(int i=0;i<3;i++){
                for(int j=0;j<4;j++){
                 arr[i][j]= (int)(Math.random()*10);
                }
             }

// Loop to print the elements of Arrays

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
            System.out.print(arr[i][j]+"  ");
        }
        System.out.println("  ");
    }
        Gap.bar();
// Enhanced for loop
        for(int n[]:arr) // itertates throw rows 
        {
            for(int m:n) // iterates all the columns of that row 
            {
                System.out.print( m + " ");
            }
            System.out.println("  "); // prints new rows in the next line

        }

    }

    }
