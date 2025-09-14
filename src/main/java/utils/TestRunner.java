package utils;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import java.io.*;

public class TestRunner
{
    public static void main(String[] args) {
        String email = StringUtils.randomEmail();

        FileUtils.store(email);
        Assert.assertTrue(email.equals(FileUtils.retrieve()));
    }
}

    