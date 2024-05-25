package AnnaP;

public class Hello {
    public static void main(String[] args) {
        int[][]arr1 = {{1,2,3},{1,2,3},{7,8,9}};
        int[][]arr2 = {{100,200,300},{1,2,3},{17,18,19}};
        arraySum(arr1,arr2);
    }

    public static void arraySum(int[][] arr1, int[][] arr2){
        int[][] arrSum = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
              arrSum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arrSum[i][j]+" ");
            }
            System.out.println();
        }

    }
}
// 2 двовимірних массиви 3х3 в третій масси передати сумму цих двох масивів