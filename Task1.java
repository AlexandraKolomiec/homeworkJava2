//Задание1
//У вас есть отсортированный массив, нужно используя минимальное колличество попыток найти загаданное число
import java.util.Arrays;
public class Task1 {
    public static void main(String[]args){
        
        int[]SortedArray={1,2,3,4,5,6,7,8};
        int key=Arrays.binarySearch(SortedArray, 8);
        System.out.println(key);
        //System.out.println(Arrays.binarySearch(SortedArray,8));
    }
}
