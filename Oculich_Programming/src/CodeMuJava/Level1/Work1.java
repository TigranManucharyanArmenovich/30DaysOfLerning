package CodeMuJava.Level1;

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

        System.out.println();

        work.ex5();

        System.out.println();

        work.ex6();

    }

    public static class Exercise{

        public void ex1(){
            System.out.println("Задание 1");
            System.out.println("Дано число. Проверьте, отрицательное оно или нет. \n" +
                    "Выведите об этом информацию в консоль");
            System.out.println();

            int num = -22;
            String str;

            if (num < 0) {str = "Число отрицателньое";}
            else {str = "Число равно 0 или  положительное";}
            System.out.println("Для примера взял число: " + num);
            System.out.println(str);
        }

        public void ex2(){
            System.out.println("Задание 2");
            System.out.println("Дана строка. Выведите в консоль длину этой строки.");

            String str = "я люблю программирование!";

            System.out.println("ля примера взял строку: " + str);
            System.out.println("Длинна строки: " + str.length());
        }

        public void ex3(){
            System.out.println("Задание 3");
            System.out.println("Дана строка. Выведите в консоль последний символ строки.");

            String str = "я люблю программирование!";

            System.out.println(str);
            System.out.println("Последний символ строки: " + str.charAt(str.length()-1));
        }

        public void ex4(){
            System.out.println("Задание 4");
            System.out.println("Дано число. Проверьте, четное оно или нет");

            int num = 2232;

            if ((num % 2) == 0){
                System.out.println("Число " + num + " чётное");
            }
            else {
                System.out.println("Число " + num + " нечётное");
            }

        }

        public void ex5(){
            System.out.println("Задание 5");
            System.out.println("Даны два слова. Проверьте, что первые буквы этих слов совпадают.");

            String name1 = "иван";
            String name2 = "Игорь";
            int count = 0; //Выбираем какую букву проверять

            System.out.println("имя 1: " + name1 + "\n" + "Имя 2: " + name2 + "\n");

            //Специально усложнил себе задачу и нвилировал разницу в регистре через высчитывание разницы
            //между char кодом одной и той-же буквы в верхнем и нижнем регистре (для обоих алфавиов это 32)
            if (name1.charAt(count) == name2.charAt(count) || name1.charAt(count) == (name2.charAt(0)-32)
                    || name1.charAt(count) == (name2.charAt(count) + 32)){
                System.out.println((count +1) + " Буквы совпадают");
            }
            else{
                System.out.println((count+1) + " Буква не совпадает");
            }
        }

        public void ex6(){
            System.out.println("Задание 6");
            System.out.println("Дано слово. Получите его последнюю букву. \n" +
                               "Если слово заканчивается на мягкий знак, то получите предпоследнюю букву.");

            String word = "Джава";

            System.out.println("Для примера взял слово: " + word);
            if (word.charAt(word.length()-1) == 'ь') {
                System.out.println("Предпоследний символ: " + word.charAt(word.length()-2));
            }
            else {
                System.out.println("Последний символ: " + word.charAt(word.length()-1));
            }

        }
    }
}

