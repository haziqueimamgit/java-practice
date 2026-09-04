public class arrays {
    public static void main(String[] args) {

        // Q1: Given an array of marks, find the sum of all elements using a for-each loop.
        int[] marks = {12,23,45,32};
        int sum = 0;
        for(int element:marks){
            sum = sum + element;
        }
        System.out.println("The value of the sum is " + sum);

        // Q2: Given an array and a number, check whether the number is present in the array (linear search).
        int[] Marks = {12, 23, 45, 32};
        int num = 45;
        boolean isInArray = false;
        for (int element : Marks) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("The value is present in the Array");
        } else {
            System.out.println("The value is not present in the Array");
        }

        // Q3: Given two 2D matrices, add them element-wise and store/print the result.
        int [][] mat1 = {{4, 6, 9},
                         {5, 8, 2}};
        int [][] mat2 = {{2, 5, 1},
                         {6, 1, 9}};
        int [][] result = {{0, 0, 0},
                           {0, 0, 0}};
        for(int i = 0; i < mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                System.out.format("setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for(int i = 0; i < mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println("");
        }

        // Q4: Reverse an array in-place without using an extra array (two-pointer swap technique).
         int [] arr = {1,2,3,4,56,7};
         int l = arr.length;
         int n = Math.floorDiv(l , 2);
         int temp;
         for(int i=0;i<n;i++){
             temp = arr[i];
             arr[i] = arr[l-i-1];
             arr[l-i-1] = temp;

         }
         for (int element:arr)
             System.out.print(element + " ");

    }
}