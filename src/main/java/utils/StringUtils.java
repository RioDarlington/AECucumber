package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class StringUtils
{
    public static String generateString(int length)
    {
        boolean useLetters = true;
        boolean useNumbers = true;
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }
    public static String randomEmail()
    {
        return generateString(10) + "@outlooking.com";
    }

}

