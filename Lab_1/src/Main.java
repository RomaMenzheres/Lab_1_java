/**
 Лабораторна робота №1
 Студента групи КН-204
 Менжереса Романа
 */

public class Main{
    public static void main(String[]args){
        Interval obj = new Interval();
        obj.entering();
        obj.printOdd();
        obj.printEven();
        System.out.printf("\nSum of the odd numbers is: %d \n",obj.sumOdd());
        System.out.printf("Sum of the even numbers is: %d \n",obj.sumEven());
        Fibonacci obj1 = new Fibonacci();
        obj1.putLen();
        obj.defineTwoLast();
        obj1.fillFibArr(obj.getLast1(), obj.getLast2());
        System.out.printf("\nPercent of the even numbers in Fibonacci row is: %d \n",obj1.PercentFibEven());
        System.out.printf("Percent of the odd numbers in Fibonacci row is: %d \n",obj1.PercentFibOdd());
    }
}

