/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.designprinciples.encapsulation;

import com.meganrobb.designprinciples.config.SystemConfig;
import com.meganrobb.designprinciples.encapulation.Supplier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class EncapsTest {
    
    private static Supplier service;
    
    public EncapsTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void supplierStyles() {
        service.setStyle("Mary-Jane");
                Assert.assertEquals(service.getStyle(),"Mary-Jane","The style of the shoe is called: ");
    }
    
    //@Test
    //public void supplierColor(){
        //service.setSize(5);
        //Assert.assertEquals(5, service.getSize(),5);
    //}

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SystemConfig.class);
        service = (Supplier)ctx.getBean("encaps");
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
