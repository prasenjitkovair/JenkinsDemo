/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KovTestPackage;

import java.util.List;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 *
 * @author prasenjitd
 */
public class KovSampleTestCase {
    
    
    
    
    public static void main(String args[]) throws Exception
    {
        String testResult=null;
        WebDriver driver = null;
        WebElement username = null;
        List<WebElement> userList = null;
        String Url = "http://test-app2/Kovair8New";
        String chromedriverpath = "C:\\Users\\prasenjitd.IN\\Documents\\NetBeansProjects\\KovairTraining\\src\\test\\java\\ChromedriverPackage\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromedriverpath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Url);
        
        Thread.sleep(3000);
        username = driver.findElement(By.id("USERNAME"));
        
        driver.findElement(By.id("USERNAME")).clear();
        //driver.findElement(By.xp)
        Thread.sleep(1000);
        driver.findElement(By.id("USERNAME")).sendKeys("pd");
        Thread.sleep(1000);
        driver.findElement(By.id("PWD")).clear();
        Thread.sleep(1000);
        driver.findElement(By.id("PWD")).sendKeys("pd");
        Thread.sleep(1000);
        driver.findElement(By.id("Button1")).click();
        Thread.sleep(3000);
        if( driver.findElement(By.id("Img4")).isDisplayed())
        {
            testResult="Passed";
        }
        else
        {
            testResult="Failed";
        }
         System.out.println("Test Case result "+testResult);      
        driver.quit();
        
    }
}
