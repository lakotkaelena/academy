package by.academy.homework6;

import java.io.*;

public class Task1 {
    /*
    Прочесть информацию введеную из клавиатури
     и записать в созданный вами txt файл, если введена "stop" строка тогда закончить запись в файл.
     */

    public  static String stopstring = "stop";
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new FileWriter("task1.txt"))){
            String text;
            while (!(text = reader.readLine()).equals("ESC")){
                writer.write(text +"\n");
                if(text.equalsIgnoreCase(stopstring)){
                    writer.close();
                }
                writer.flush();
            }

        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}
