package CodeMuJava.Level7;

import java.util.Scanner;

public class Work2 {
    public static void main(String[] args) {
        Exercise work = new Exercise();
        Scanner scan = new Scanner(System.in);
        System.out.println("Задание 1");
        System.out.println("Сделайте метод, который параметром будет принимать число и удалять из него нули.");

        System.out.println();

        System.out.print("прошу введите число: ");

        int userNum = scan.nextInt();
        int resultNum = work.ex1(userNum);

        System.out.println();
        System.out.println("Преображенное число: " + resultNum );
    }

    public static class Exercise {

        public int ex1(int num) {

            String str = ""+ num;
            String resultStr = "";

            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) != '0'){
                    resultStr += str.charAt(i);
                }
            }

            int resultNum = Integer.parseInt(resultStr);
            return resultNum;
        }
    }
}

