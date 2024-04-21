package CodeMuJava.Level3;

import java.util.Arrays;

public class Work2 {
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

    public static class  Exercise{
        public  void ex1(){
            System.out.println("Задание 1");
            System.out.println("Дан массив со строками. " +
                    "Выведите в консоль только те строки, которые начинаются на \"http://\" ");
            System.out.println();

            String[] sits = {"http://yandex.ru", "http://mail.ru", "www.dns.ru", "http://niu.ranepa.ru",
                             "gmail.com"};

            String str = "Корректно введённые сайты: ";
            String substring = "http://";

            for (int i = 0; i < sits.length; i++){
                if (sits[i].contains(substring) == true){
                    str += "\n" + sits[i];
                }
            }

            System.out.println(str);
        }

        public  void ex2(){
            System.out.println("Задание 2");
            System.out.println("Дана некоторая строка: 1203405. Найдите позицию первого нуля в строке.");
            System.out.println();

            String str = "1203405";
            int position = 0;

            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) == '0'){
                    position = i;
                    break;
                }
            }

            System.out.println("Позиция первого нуля: " + position);
        }

        public void ex3(){
            System.out.println("Задание 3");
            System.out.println("Дана строка: \"abcdef\" \n" +
                    "Получите три последних символа этой строки: ");
            System.out.println();

            String str = "abcdef";
            String shStr = "";

            for (int i = 0; i < str.length(); i++){

                if (((str.length()) - i) ==3) {
                    for (int j = i; j < str.length(); j++){
                        shStr += str.charAt(j);
                    }
                    break;
                }
            }

            System.out.println("Последние 3 символа строки: " + shStr);
        }

        public void ex4(){
            System.out.println("Задание 4");
            System.out.println("Дан массив: 1, 2, 3, 4, 5, 6. Получите из него следующий срез: 3, 4, 5");
            System.out.println();

            int[] array = {1,2,3,4,5,6};
            int[] shortArray = new int[array.length / 2];

            for (int i = 0; i < array.length /2; i++){
                shortArray[i] = array[i+2];
            }

            String ResultArray = Arrays.toString(shortArray);

            System.out.println("Разрез масива: " + ResultArray);
        }

        public void ex5(){
            System.out.println("Задание 5");
            System.out.println("Дана строкаЖ \"abc def jhi\". Получите массив слов из этой строки:");

            String str = "abc def jhi";

            String[] words = str.split(" ");

        }
    }
}
