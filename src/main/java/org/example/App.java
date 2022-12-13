package org.example;

import java.io.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Human Vasya = new Human("Вася", 22, "чоловік");
        Human Maruna = new Human("Марина",23,"жінка");

        File output = new File("src/main/java/org/example/output");
        output.mkdir();
        File result = new File("src/main/java/org/example/output/result.csv");
        try{
            result.createNewFile();
            FileWriter fileWriter = new FileWriter(result.getAbsolutePath());
            fileWriter.write(Vasya+"\n");
            fileWriter.write(Maruna+"\n");
            fileWriter.close();
            System.out.println("Wrote to the result.csv");
            BufferedReader bufferedReader =new BufferedReader(new FileReader(result.getName()));
            System.out.println(bufferedReader.readLine());
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Oooops");
        }



    }
}
