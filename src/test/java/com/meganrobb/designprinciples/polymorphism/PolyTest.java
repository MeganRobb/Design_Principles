/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.designprinciples.polymorphism;

import com.meganrobb.designprinciples.config.SystemConfig;
import com.meganrobb.designprinciples.inheritance.SupplierInher;
import com.meganrobb.designprinciples.polymorphisim.Shipping;
import com.meganrobb.designprinciples.polymorphisim.SupplierPoly;
import junit.framework.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class PolyTest {
    private static SupplierPoly cost;
    private static Shipping pay;
    
    public PolyTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void calCosts() {
        cost.prices(150);
        Assert.assertEquals("The price that is owed to suppliers is: ", 171.0, cost.prices(150));
    }
    
    public void calPay(){
        pay.prices(100);
        Assert.assertEquals("The price that is owed to Shipping is: ", 110, pay.prices(100));
        
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SystemConfig.class);
        cost = (SupplierPoly)ctx.getBean("sup");
        
        ApplicationContext ctz = new AnnotationConfigApplicationContext(SystemConfig.class);
        pay = (Shipping)ctz.getBean("ship");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
