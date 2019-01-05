/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KovTestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 *
 * @author prasenjitd
 */
public class LoginTesting {
    static WebElement element=null;
   static WebDriver driver=null;
   static String path="C:\\Users\\prasenjitd.IN\\Documents\\NetBeansProjects\\KovairTraining\\src\\test\\java\\ChromedriverPackage\\chromedriver.exe";      
   static String url="http://10.10.1.26/Kovair8.8/Views/Accounts/Login.aspx";
   static String testCaseName=null;
   static String testCaseId=null;
   static String testCaseStatus=null;
    public LoginTesting() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    @Parameters({"password"})
    public void logincheck(String password) throws Exception
    {
         testCaseName="verify whether the username textbox accepts blanck input or not";
        testCaseId="TC_001";
        try{
             driver.findElement(By.id("USERNAME")).clear();
        driver.findElement(By.id("PWD")).clear();
       // driver.findElement(By.id("USERNAME")).sendKeys(username);
        driver.findElement(By.id("PWD")).sendKeys(password);
        driver.findElement(By.id("Button1")).click();
         element=driver.findElement(By.xpath("//div[@id='errorDiv']/p"));
           // System.out.println(element.getText());
       if(element.getText().equalsIgnoreCase("User Name cannot be blank.")){
          // System.out.println("Test Case Passed");
           testCaseStatus="Passed";
       }
       else{
          // System.out.println("Test case Failed");
           testCaseStatus="Failed";
       }

    }
        catch(Exception ex){
            System.out.println(ex.toString());
        }
          
    }
    
    @Test
    @Parameters({"username"})
    public void blankpasswordcheck(String username) throws Exception
    {
         testCaseName="verify whether validation message is getting displayed if value in password textbox is given blank";
        testCaseId="TC_002";
        try{
             driver.findElement(By.id("USERNAME")).clear();
        driver.findElement(By.id("PWD")).clear();
        driver.findElement(By.id("USERNAME")).sendKeys(username);
        //driver.findElement(By.id("PWD")).sendKeys(password);
        driver.findElement(By.id("Button1")).click();
         element=driver.findElement(By.xpath("//div[@id='errorDiv']/p"));
            //System.out.println(element.getText());
       if(element.getText().equalsIgnoreCase("Password cannot be blank")){
           //System.out.println("Test Case Passed");
           testCaseStatus="Passed";
           
       }
       else{
           testCaseStatus="Failed";
           //System.out.println("Test case Failed");
       }

    }
        catch(Exception ex){
            System.out.println(ex.toString());
        }
        
       
       
    }
    
    @Test
    @Parameters({"username","password"})
    public void LoginSucess(String username,String password)
    {
        testCaseName="Verify whether  validation massege is displayed when login is done with invalid username";
        testCaseId="TC_003";
        try{
            driver.findElement(By.id("USERNAME")).clear();
        driver.findElement(By.id("PWD")).clear();
        driver.findElement(By.id("USERNAME")).sendKeys(username);
        driver.findElement(By.id("PWD")).sendKeys(password);
        driver.findElement(By.id("Button1")).click();
        element=driver.findElement(By.xpath("//div[@id='errorDiv']/p"));
           // System.out.println(element.getText());
       if(element.getText().equalsIgnoreCase("Invalid User Name or Password.")){
          // System.out.println("Test Case Passed");
           testCaseStatus="Passed";
       }
       else{
          // System.out.println("Test case Failed");
           testCaseStatus="Failed";
       }
        
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
    
    
    
    @BeforeTest
    public static void opensite()
    {
        try{
            System.setProperty("webdriver.chrome.driver", path);
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        
            
        }catch(Exception e)
        {
            System.out.println("Exception Occured in opensite");
        }
        
        
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    
    public void setUpMethod() throws Exception {
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        System.out.println("Test Case Results:\nTest Case Id\tTest Case Name\tTest Case Status");
        System.out.println(testCaseId+"\t"+testCaseName+"\t"+testCaseStatus);
        
    }
    @AfterTest
    public void closeBrowser(){
    driver.close();
    }
}
