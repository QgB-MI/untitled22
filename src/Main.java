public class Main {
    public static void main(String[] args) {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

        checkSumSign();

        compareNumbers();

        printColor();
    }

    public static void checkSumSign() {

        int a = 10;
        int b = 13;
        System.out.println(a + b);
    }
    public static void compareNumbers() {

        int a = 51;
        int b = -32;

        if(a >= b) {

            System.out.println("a >= b");
        }
        else {

        System.out.println("a < b");
            }


    }

    public static void printColor() {

        int value = 101;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value> 0 & value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
}
