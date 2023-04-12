import java.util.Scanner;

public class ArrayController {
    static MyArray myArray;
    private static Scanner scanner = new Scanner(System.in);
    static void mainMenu(){
        System.out.println("Выберите пункт меню:");
        System.out.println("0.Выйти");
        System.out.println("1.Создать массив");
        System.out.println("2.Вывести элементы массива");
        System.out.println("3.Сортировать массив по возрастанию");
        System.out.println("4.Сортировать массив по убыванию");
        System.out.println("5.Поиск максимального элемента и его индекса в массиве");
        System.out.println("6.Поиск кол-ва раз вхождения элемента в массив вместе с его последним вхождением(индекс последнего вхождения");
        switch (scanner.nextInt()){
            case 0:{
                return;
            }
            case 1:{
                 myArray = new MyArray();
                break;
            }
            case 2:{
                System.out.println(myArray);
                break;
            }
            case 3:{
                myArray = MyArray.sortArrayAscend(myArray);
                break;
            }
            case 4:{
                myArray = MyArray.sortArrayDescend(myArray);
                break;
            }
            case 5:{
                MyArray.searchMaxElementAndIndex(myArray);
                break;
            }
            case 6:{
                MyArray.counterNumberInArray(myArray);
            }
        }
        mainMenu();
    }

    public static void main(String[] args) {
        mainMenu();
    }
}
