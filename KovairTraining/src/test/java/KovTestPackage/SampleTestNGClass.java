/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KovTestPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 *
 * @author prasenjitd
 */
public class SampleTestNGClass {
    
    @BeforeTest
    public static void Setup()
    {
        System.out.println("In Setup Method");
    }
    
    @BeforeClass
    public static void BClass()
    {
       System.out.println("In BClass Method");   
    }
    
    @BeforeMethod
    public static void BMethod()
    {
       System.out.println("In BMethdd Method");   
    }
    
    @Test
    @Parameters({"UserName","Password"})
    public static void BLnkUsername(String username,String password)
    {
       System.out.println("In BlnkUsername Method");
       System.out.println("Username is " + username);
       System.out.println("Password is " + password);
    }
    
    
    @Test
    public static void BLnkPassword()
    {
       System.out.println("In BLnkPassword Method");   
    }
    
    @AfterMethod
    public static void AMethod()
    {
        System.out.println("In After Method");
    }
    
    @AfterClass
    public static void AfterClass()
    {
       System.out.println("In After Class");   
    }
    
    @AfterTest
    public static void AfterTest()
    {
       System.out.println("In After Test");   
    }
    
    
    
    @DataProvider
    public static Object[][] credentialsData()
    {
        Object[][] credObj = new Object[][]{
            {"pd","pd"},
            {"ks","ks"},
            {"sm","sm"}
        };
        
        return credObj;
    }
    
}
