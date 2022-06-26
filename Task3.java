//Написать метод, который будет эмулировать работу динамического массива 
//(Без исопользования коллекций), протестировать можно при выводе последовательности
// треугольного числа до n
// Пример
// 1
// 1 3
// 1 3 6

// Вариант 1, не работает, ошибка-см ниже, как устранить?
public class Task3 {
    public static void main(String[]args){
       
        int[]a = {1};
        int[]b = {3};
        int[]c = {6};
        
        int[]e = new int[a.length+b.length];
        int[]d = new int[a.length+b.length+c.length];//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
        int count = 0;
           
        for(int i = 0; i<a.length; i++) {
            e[i] = a[i];
            count++;
        }
        for(int j = 0;j<b.length;j++) {
            e[count++] = b[j];
            
        }
        for(int i = 0;i<e.length;i++)
        System.out.print(e[i]+" ");   
        
        for(int i = 0; i<a.length; i++) {
            d[i] = a[i];
            count++;
        }
        for(int k=0; k<b.length;k++){
            d[count++] = c[k];
        }
        for(int l=0; l<c.length;l++){
            d[count++] = b[l];
        }
        for(int i = 0;i<d.length;i++)
        System.out.print(d[i]+" ");
    }        
}      