package CodeMuJava.Level8;

import java.io.*;
import java.time.LocalDate;

public class Work1 {
    public static void main(String[] args) {
        Exercise work = new Exercise();
        String line = "Я люблю программировать";

        System.out.println();
        work.ex1TextWriter(line);
        work.ex1TextReader();
    }

    public static class Exercise {
        public void ex1TextWriter(String str) {

            try(FileWriter writer = new FileWriter("notes3.txt", false))
            {
                // запись всей строки
                writer.write(str);

                writer.flush();
            }

            catch(IOException ex){

                System.out.println(ex.getMessage());
            }

        }
        public void ex1TextReader(){
            System.out.println("Задание 1");
            System.out.println("Дан текстовый файл. Получите количество символов в нем.");
            System.out.println();

            int counter = 0;

            try(FileReader reader = new FileReader("notes3.txt"))
            {
                // читаем посимвольно
                int c;
                while((c=reader.read())!=-1){

                    counter++;
                }
            }

            catch(IOException ex){

                System.out.println(ex.getMessage());
            }

            System.out.println("Количество символов: " + counter);

        }
    }
}
