/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.designprinciples.plk.correction;

import com.meganrobb.designprinciples.config.SystemConfig;
import com.meganrobb.designprinciples.plk.correction.Imp.AreaManInformation;
import com.meganrobb.designprinciples.plk.correction.Imp.CEOInformation;
import com.tracy.designprinciples.config.AppConfig;
import com.tracy.designprinciples.plk.correction.Principle6;
import com.tracy.designprinciples.plk.correction.Student6;
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
public class PlkCorrectionTest {
    private static AreaManInformation area;
    private static CEOInformation ceo;
    
    public PlkCorrectionTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   @Test
    public void plkCorrection() {
        area.setTarget(3500.0);
        ceo.setManager(area);
        Assert.assertEquals(ceo.getDailyTarget(),3500.0);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SystemConfig.class);
        area = (AreaManInformation)ctx.getBean("plkC2");
        
        ApplicationContext ctxp = new AnnotationConfigApplicationContext(SystemConfig.class);
        ceo = (CEOInformation)ctx.getBean("plkC1");
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
