package CodeMuJava.Level2;

public class Work1 {
    public static void main(String[] args) {
        Exercise work = new Exercise();

        System.out.println();
        work.ex1();

        System.out.println();
        work.ex2();

        System.out.println();
        work.ex3();

        System.out.println();
        work.ex4();

    }

    public static class Exercise{
        public void  ex1(){
            System.out.println("Задание 1");
            System.out.println("массив с целыми числами: 1, 2, 3, 4, 5};\n" +
                    "Выведите в консоль элементы этого массива.\n");

            int[] array = {1, 2, 3, 4, 5};
            String str = "";

            for (int i = 0; i < array.length; i ++){
                str += array[i] + " ";
            }

            System.out.println("Вывод элементов массива: " + str);

        }

        public  void  ex2(){
            System.out.println("Задание 2");
            System.out.println("Дан массив со строками: \"ab\", \"cd\", \"ef\" \n" +
                    "Выведите в консоль первые символы элементов этого массива.");

            String[] array = {"ab","cd","ef"};
            String str = "";

            for (int i = 0; i < array.length; i ++){
                str += array[i].charAt(0) + " ";
            }

            System.out.println();
            System.out.println("Первые символы каждого элемента массива: " + str);

        }

        public void ex3(){
            System.out.println("Задание 3");
            System.out.println("Дано целое число: 12345 \n" +
                    "Найдите сумму всех его четных цифр.\n");

            int OriginalNumber = 12345;
            int number = OriginalNumber;
            int sum = 0;

            while (number != 0){

                if (((number % 10) % 2) == 0){
                   sum +=  number % 10;
                };

                number /=10;
            }

            System.out.println("Сумма всех чётных чисел из " + OriginalNumber + " равна: " + sum);
        }

        public void ex4(){
            System.out.println("Задание 4");
            System.out.println("Дано некоторое целое число: 12. Найти факториал этого числа.");

            byte example = 12;
            int num  = 1;

            for (int i = 1; i <= example; i++){
                num *= i;
            }

            System.out.println("\nФакториал " + example + " равен: " + num);

        }
    }
}
