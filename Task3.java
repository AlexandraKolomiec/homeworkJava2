//Написать метод, который будет эмулировать работу динамического массива 
//(Без исопользования коллекций), протестировать можно при выводе последовательности
// треугольного числа до n
// Пример
// 1
// 1 3
// 1 3 6

// Вариант 1
public class Task3 {
    public static void main(String[]args){
       
        int[]a = {1};
        int[]b = {3};
        int[]c = {6};
        int[]e = new int[a.length+b.length]; // длина 2
        //int[]d = new int[a.length+b.length+c.length];
        int[]d = new int[e.length+c.length];  // длина 3
        int count = 0;
        
        for (int z : a) {extracted(z);
      
        for(int i = 0; i<a.length; i++) {
            e[i] = a[i];
            count++;    // одна операция фора тупо присваивание е0 = 1 каунт 1
        }
        for(int j = 0;j<b.length;j++) {
            e[count] = b[j];    // одна операция форма присваивание е1 = 3
            count++; // каунт 2
        }
        
        for(int f = 0;f<e.length;f++){
             System.out.print(e[f]+" ");}   // не выводится в терминал, не понимаю почему
        //System.exit(0);
        System.out.println("");
        
        for(int i = 0; i<e.length; i++) {
            d[i] = e[i];   // массив д с 2 значениями и  1 пустотой
          
        }
        
        for(int k=0; k<c.length;k++){
            d[count] = c[k];
           
        }

        for(int h=0; h<d.length; h++) {
            System.out.print(d[h]+" ");

        }
       
    }        
}

    private static void extracted(int z) {
        System.out.println(z);
    }
}