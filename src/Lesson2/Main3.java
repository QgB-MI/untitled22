package Lesson2;

public class Main3 {
    public static void main(String[] args) {
    int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    System.out.println("ДЗ 1");
    exactTask1(arr1);
    System.out.println("ДЗ 2");
    exactTask2(100);
    int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    exactTask3(arr3);
    System.out.println("ДЗ 3");
    System.out.println("ДЗ 4");
    exactTask4();
    System.out.println("ДЗ 5");
    exactTask5(5, 1);


}

    public static void exactTask2(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    public static void exactTask1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }
    public static void exactTask3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }
    public static void exactTask4() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void exactTask5(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }

}


