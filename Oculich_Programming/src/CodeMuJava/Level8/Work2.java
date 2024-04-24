package CodeMuJava.Level8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Work2 {
    public static void main(String[] args) {
        Exercise work = new Exercise();
        String line = "Я люблю программировать";

        System.out.println();
        //work.ex1TextWriter(line);
        work.ex1TextReader();
    }

    public static class Exercise {
        public void ex1TextWriter(String str) {

            try(FileWriter writer = new FileWriter("work2.txt", false))
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
            System.out.println("Дан текстовый файл. Получите количество букв в нем (т.е. без пробелов, знаков препинаний и т.п.).");
            System.out.println();

            int counter = 0;

            try(FileReader reader = new FileReader("work2.txt"))
            {
                // читаем посимвольно
                int c;
                while((c=reader.read())!=-1){

                    //условие проверяет совпадение кода символа в пределах обоих регистров букв обоих алфовитов
                    if ((((((char) c) >= 65) && ((char) c) <= 90) || ((((char) c) >= 1040) && ((char) c) <= 1071)) ||
                            (((((char) c) >= 97) && ((char) c) <= 122) || ((((char) c) >= 1072) && ((char) c) <= 1103))) {
                        counter++;
                    }
                }
            }

            catch(IOException ex){

                System.out.println(ex.getMessage());
            }

            System.out.println("Количество символов: " + counter);

        }
    }
}

