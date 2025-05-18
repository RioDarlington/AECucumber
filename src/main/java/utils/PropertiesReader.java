package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader
{
   public static Properties properties = new Properties();

    static
    {
        try
        {
            properties.load(new FileInputStream("C:\\Users\\Rio\\IdeaProjects\\AI Conversation\\src\\main\\resources\\runtime.properties"));
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
    public static String getProperty(String key)
    {
    return (String)properties.get(key);
    }

}