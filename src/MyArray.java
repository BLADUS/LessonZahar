import java.util.Arrays;
import java.util.Scanner;

public class MyArray {
    static Scanner scanner = new Scanner(System.in);
    private double[] array;

    public MyArray() {
        this.array = initArray();
    }

    public double[] initArray() {
        System.out.println("Введите размер массива");
        int sizeArray = scanner.nextInt();
        double[] array = new double[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            array[i] = random(0, 0);
        }
        return array;
    }

    public double random(int min, int max) {
        return Math.random() * ((max - min) + min);
    }

    @Override
    public String toString() {
        return "MyArray{" +
                "myArray=" + Arrays.toString(array) +
                '}';
    }

    //task26
    public static MyArray sortArrayAscend(MyArray myArray) {
        double[] array = myArray.getArray();
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    double buf = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = buf;
                    isSorted = false;
                }
            }
        }
        myArray.setArray(array);
        return myArray;
    }

    //task26*
    public static MyArray sortArrayDescend(MyArray myArray) {
        double[] array = myArray.getArray();
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = array.length - 1; i > 0; i--) {
                if (array[i] > array[i - 1]) {
                    double buf = array[i - 1];
                    array[i] = array[i - 1];
                    array[i - 1] = buf;
                    isSorted = false;
                }
            }
        }
        myArray.setArray(array);
        return myArray;
    }

    public static void searchMaxElementAndIndex(MyArray myArray) {
        double[] array = sortArrayAscend(myArray).getArray();
        System.out.println("Максимальный элемент: " + array[array.length - 1]);
        System.out.println("Индекс максимального элемента: " + ((array.length) - 1));
    }

    
    public static void counterNumberInArray(MyArray myArray) {
        int counter = 0;
        int index = 0;
        double number = input("Введите искомое число:");
        double[] array = sortArrayAscend(myArray).getArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                counter += 1;
                index = i;
            }
        }
        System.out.println("Кол-во вхождений числа" + number + ":" + " в нашем массиве: " + counter);
        System.out.println("Последнее вхождение элемента(его индекс): " + index);
    }

    static public double input(String text){
        System.out.println(text);
        return scanner.nextDouble();
    }
    public double[] getArray() {
        return array;
    }

    public void setArray(double[] array) {
        this.array = array;
    }
}
