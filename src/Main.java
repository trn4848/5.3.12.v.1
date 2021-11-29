import java.io.*;
import java.nio.charset.StandardCharsets;


// строка для теста : Проверка взаимодействия сканера и принта 1 нет так нет 2 3

public class Main {
    public static void main(String[] args) {
        Reader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(reader);
        double sum = 0;
        try {
            System.out.println("Введите текст:");
            String str = br.readLine();
            String[] strArray = str.split(" ");
            for(String s : strArray){
                try{
                    sum += Double.parseDouble(s);
                }catch (NullPointerException | NumberFormatException e){
                    //ignore
                }

            }
            System.out.printf("%.6f", sum);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

