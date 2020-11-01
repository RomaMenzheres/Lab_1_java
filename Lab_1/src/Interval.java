import java.util.ArrayList;
import java.util.Scanner;

public class Interval{

    private int begin,end,size, last1, last2;
    private ArrayList<Integer> Arr = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);

/**
Конструктор
 */
    public Interval(){
        begin=0;
        end=0;
        size=0;
        last1 = 0;
        last2 = 0;
    }

    /**
    Ввід інтервалу та занесення його в список
     */

    public void entering(){
        System.out.printf("Enter interval: ");
        begin = scan.nextInt();
        end = scan.nextInt();
        size = end-begin+1;
        Arr.ensureCapacity(size);
        for(int i = 0, n = begin;i<size;i++){
            Arr.add(n);
            n++;
        }
    }

    /**
    Виводимо непарні елементи списку за зростанням
     */

    public void printOdd() {
        System.out.printf("Interval odd elements in front order: \n");
        for (int i = 0; i < size; i++) {
            if (Arr.get(i) % 2 != 0) {
                System.out.printf("%d ", Arr.get(i));
            }
        }
    }

    /**
    Виводимо парні елементи списку за спаданням
     */

    public void printEven() {
        System.out.printf("\n Interval even elements in back order: \n");
        for(int i = size-1; i >= 0; i--) {
            if(Arr.get(i)%2==0)
            {
                System.out.printf("%d ", Arr.get(i));
            }
        }
    }

    /**
    Рахуємо суму непарних елементів та павертаємо її
     */

    public int sumOdd(){
        int odd_sum=0;
        for(int i = 0; i<size; i++){
            if(Arr.get(i)%2!=0){
                odd_sum+=Arr.get(i);
            }
        }
        return odd_sum;
    }

    /**
    Рахуємо суму парних елементів та павертаємо її
     */

    public int sumEven(){
        int even_sum=0;
        for(int i = 0; i<size; i++){
            if(Arr.get(i)%2==0){
                even_sum+=Arr.get(i);
            }
        }
        return even_sum;
    }

    /**
    Визначаємо останнє непарне число та після нього парне число і присвоюємо у відповідні змінні
     */

    public void defineTwoLast() {
        if (Arr.get(size - 1) % 2 != 0) {
            last1 = (Arr.get(size - 1));
            last2 = (Arr.get(size - 2));
        }
        else {
            last1 = (Arr.get(size - 2));
            last2 = (Arr.get(size - 1));
        }
    }

    /**
    Гетери для двох перших чисел ряду Фібоначчі
     */

    public int getLast1() {
        return last1;
    }

    public int getLast2() {
        return last2;
    }
}
