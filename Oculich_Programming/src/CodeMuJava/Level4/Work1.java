package CodeMuJava.Level4;

public class Work1 {
    public static void main(String[] args) {
        Exercise work = new Exercise();

        System.out.println();
        work.ex1();
    }

    public static class  Exercise{
        public  void ex1(){
            System.out.println("Задание 1");
            System.out.println("Дана некоторая строка с буквами и цифрами. Получите позицию первой цифры в этой строке");

            String str = "arae23sfsd";
            System.out.println("Строка для примера: " + str);

            for (int i = 0; i < str.length(); i++){
                //System.out.println(str.charAt(i) + " | " + i);
                if ((int)str.charAt(i) >= 48 && (int)str.charAt(i) <= 57){
                    System.out.println("Позиция первой цифры в строке: " + i);
                    break;
                }
            }
        }

    }
}