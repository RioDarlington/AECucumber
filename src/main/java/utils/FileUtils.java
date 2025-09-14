package utils;

import java.io.*;
import java.util.Scanner;

public class FileUtils
{
    static File file = new File("C:\\Users\\Rio\\IdeaProjects\\AECucumber\\Storage.txt");
    public static void store(String email)
    {

        try
        {
            if (file.createNewFile())
            {
                System.out.println("File created: " + file.getName());
            }
            else
            {
                System.out.println("File already exists.");
            }
            FileWriter send = new FileWriter(file);
            send.write(email);
            System.out.println("Sent to file.");
            send.close();
            }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("An error occurred.");
            throw new RuntimeException(fnfe);
        }

        catch (IOException e)
        {
            System.out.println("An error occurred.");
            throw new RuntimeException(e);
        }

    }

    public static String retrieve()
    {
        String data;
        try
        {
            Scanner retrieve = new Scanner(file);
            data = retrieve.nextLine();
            System.out.println(data);
            retrieve.close();
        }

        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
return data;

    }

}