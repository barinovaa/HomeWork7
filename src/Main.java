public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    private static void task8() {

    }

    private static void task7() {
        for (int v = 1; v < 520; v = v * 2){
            System.out.println(v);
        }
    }

    private static void task6() {
     for (int s = 7; s < 100; s = s + 7) {
         System.out.println(s);
     }
    }

    private static void task5() {
        for (int g = 1904; g < 2096; g = g + 4) {
            System.out.println( g + " Год является высокосным");
        }
    }

    private static void task4() {
        for (int c = 10; c > -11; c--) {
            System.out.println("Интеграция цикла " + c );
        }
    }

    private static void task3() {
        for (int b = 2; b < 17; b+=2) {
            System.out.println("Итерация цикла на 2 " + b );
        }
    }

    private static void task2() {
     for (int a = 10; a > 0; a--) {
         System.out.println("Итерация цикла " + a);
     }
    }

    public static void task1() {
        for (int i = 0; i < 11; i++) {
            System.out.println("Итерация цикла " + i);
        }
    }
}