//Написать метод, который будет эмулировать работу динамического массива 
//(Без исопользования коллекций), протестировать можно при выводе последовательности
// треугольного числа до n
// Пример
// 1
// 1 3
// 1 3 6

//Вариант 2
public class Task32 {
    static int[] AddItem(int[] array, int item) {
        int length = array.length;
        int[] temp = new int[length + 1];
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;
    }
    public static void main(String[] args) {
        int[] a = new int[] { 1 };
        for (int i : a) {System.out.println(i);}
        a = AddItem(a, 3);
        for (int k : a) { System.out.printf("%d ", k); }
        System.out.println("");
        a = AddItem(a, 6);
        for (int j : a) { System.out.printf("%d ", j); }
        System.out.println("");
    }
 
}


