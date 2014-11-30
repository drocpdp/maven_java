package com.davidreynon.sandbox;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Date d = new Date();
        System.out.println(d);
        int[] array1;
        array1 = new int[10];
        for (int x=0; x < array1.length; x++){
        	array1[x] = x;
        }
        for (int x=0; x < array1.length; x++){
        	System.out.println(array1[x]);
        }
        int varlength = 20;
        array1 = new int[varlength];
        for (int x=0; x < array1.length; x++){
        	System.out.println(array1[x]);
        }
        
        
    }
}
