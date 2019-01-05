/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KovTestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 *
 * @author prasenjitd
 */
public class KovSampleTestNGTestCase {
    
    
    static WebDriver driver = null;
    String testcasename = "";
    String testcaseid = "";
    String testresult = "";
    static String Url = "http://test-app2/Kovair8New";
    static String chromedriverpath = "C:\\Users\\prasenjitd.IN\\Documents\\NetBeansProjects\\KovairTraining\\src\\test\\java\\ChromedriverPackage\\chromedriver.exe";
    
    public KovSampleTestNGTestCase() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeTest
    public static void setUpClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", chromedriverpath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Url);
    }

    @AfterTest
    public static void tearDownClass() throws Exception {
        driver.quit();
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        String testcasename = "";
        String testcaseid = "";
        String testresult = "";
    }
    
    
    @Test
    public void TestCase1() throws Exception
    {
        testcasename = "Login Test";
        testcaseid = "Login_1";
        Thread.sleep(3000);
        driver.findElement(By.id("USERNAME")).clear();
        Thread.sleep(1000);
        driver.findElement(By.id("USERNAME")).sendKeys("pd");
        Thread.sleep(1000);
        driver.findElement(By.id("PWD")).clear();
        Thread.sleep(1000);
        driver.findElement(By.id("PWD")).sendKeys("pd");
        Thread.sleep(1000);
        driver.findElement(By.id("Button1")).click();
        Thread.sleep(3000);
    }
    

    @AfterMethod
    public void tearDownMethod() throws Exception {
        
        System.out.println("TestName: " + testcasename);
        System.out.println("Testid: " + testcaseid);
        System.out.println("Test Result: " + testresult);
    }
}
