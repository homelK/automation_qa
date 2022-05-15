import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class FileCreation {

    public static void main(String[] args) {

try {
            File myObj = new File("F:\\newFile.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }



/*        try {
            FileWriter myWriter = new FileWriter("F:\\filename.txt");
            myWriter.write("New Line - Test\n");
            myWriter.write("New Line - Test111\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }  */

      /*  try {
            File myObj = new File("F:\\filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } */


     /*  try {
           BufferedWriter writer = new BufferedWriter(new FileWriter("F:\\output.txt"));
           writer.write("Test test test");
           writer.close();
       } catch (IOException e) {
           e.printStackTrace();
       } */


/*       try {
            BufferedReader reader = new BufferedReader(new FileReader("F:\\output.txt"));
            System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/









    }


}







