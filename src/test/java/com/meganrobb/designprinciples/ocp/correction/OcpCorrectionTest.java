/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.designprinciples.ocp.correction;

import com.meganrobb.designprinciples.config.SystemConfig;
import com.meganrobb.designprinciples.ocp.correction.Imp.EveningSandals;
import com.meganrobb.designprinciples.ocp.correction.Imp.LeatherBoots;
import com.tracy.designprinciples.config.AppConfig;
import com.tracy.designprinciples.ocp.correction.Principl;
import com.tracy.designprinciples.ocp.correction.Teach;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
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
public class OcpCorrectionTest {
    private static EveningSandals eve;
    private static LeatherBoots leather;
    public OcpCorrectionTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void ocpCorrectionTest() {
        Assert.assertEquals(eve.calculateSellPrice(100), 130.0);
        Assert.assertEquals(leather.calculateSellPrice(120), 180.0);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(SystemConfig.class);
        eve = (EveningSandals)ctx1.getBean("ocpC1");
        
        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(SystemConfig.class);
        leather = (LeatherBoots)ctx2.getBean("ocpC2");
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
