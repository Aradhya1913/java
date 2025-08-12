import java.util.Scanner;
public class Arrays{

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};
        
        Gap.bar();
        System.out.println("Element of arr decclared in Code");
        Gap.bar();
        for(int i=0;i<5;i++){
            System.out.print(arr[i]);
        }
        System.out.println("");
        // Arrray Opertion during runtime

        Scanner sc = new Scanner(System.in);
        Gap.bar();
        System.out.println("Enter the array Size");
        int s = sc.nextInt();
        int arr1[] = new int[s]; //To Initialize Array of unknown size 

        System.out.println("Enter array elements");
        for(int i=0;i<s;i++){     
            int ele=sc.nextInt();
            arr1[i]=ele;
        }
    
        Gap.bar();
        System.out.println("Arr1 elements are");
        for(int i=0;i<s;i++){
            System.out.print(arr1[i]);
        }


        // Adding arr[] and arr1[]

        int array[] = new int[arr.length + arr1.length];

        // Copy elements of arr into array
        for (int i = 0; i < arr.length; i++) {
              array[i] = arr[i];
        }

        // Copy elements of arr1 into array
        for (int i = 0; i < arr1.length; i++) {
        array[arr.length + i] = arr1[i];
        }
        System.out.println("");
        Gap.bar();
        System.out.println("New Added array are");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
        System.out.println("");
        Gap.bar();


        


    }
}