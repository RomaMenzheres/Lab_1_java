import java.util.ArrayList;
import java.util.Scanner;


public class Fibonacci{
    private int len;
    private ArrayList<Integer>FibArr = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);

    /**
    Конструктор
    */

    public Fibonacci(){
        len = 0;
    }

    /**
    Ввід довжини ряду Фібоначчі
     */

    public void putLen(){
        System.out.printf("Enter fibonacci row lenght: ");
        len = scan.nextInt();
        FibArr.ensureCapacity(len);
    }

    /**
    Рахуємо та виводимо елементи ряду Фібоначчі
     */

    public void fillFibArr(int l1, int l2) {

        FibArr.add(l1);
        FibArr.add(l2);

        System.out.printf("Your row: ");

        for(int i=0,c=2;c<len;i++,c++)
        {
            FibArr.add(FibArr.get(i)+FibArr.get(i+1));
        }
        for(int i=0;i<len;i++)
        {
            System.out.printf("%d ",FibArr.get(i));
        }
    }

    /**
    Рахуємо к-сть парних елементів та повертаємо як % від всієї к-сті елеметів
     */

    int PercentFibEven() {
        int num = 0, even = 0, i = 0;
        for (;i< FibArr.size(); i++) {
            if (FibArr.get(i) % 2 == 0) {
                even++;
            }
        }
        return (even*100)/i;
    }

    /**
    Рахуємо к-сть непарних елементів та повертаємо як % від всієї к-сті елеметів
     */

    int PercentFibOdd(){
        int num = 0, odd = 0, i = 0;;
        for (;i < FibArr.size(); i++) {
            if (FibArr.get(i) % 2 != 0) {
                odd++;
            }
        }
        return (odd*100)/i;
    }
}