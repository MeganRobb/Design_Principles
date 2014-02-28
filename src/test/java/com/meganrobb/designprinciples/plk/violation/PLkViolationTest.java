/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.designprinciples.plk.violation;

import com.meganrobb.designprinciples.config.SystemConfig;
import com.meganrobb.designprinciples.plk.correction.Imp.AreaManInformation;
import com.meganrobb.designprinciples.plk.correction.Imp.CEOInformation;
import com.meganrobb.designprinciples.plk.violation.Imp.CEOInformation2;
import com.meganrobb.designprinciples.plk.violation.Imp.StoreManager;
import com.tracy.designprinciples.config.AppConfig;
import com.tracy.designprinciples.plk.correction.Student6;
import com.tracy.designprinciples.plk.violation.Principle5;
import com.tracy.designprinciples.plk.violation.Teacher5;
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
public class PLkViolationTest {
     private static AreaManInformation area;
    private static CEOInformation2 ceo;
    private static StoreManager store;
    
    public PLkViolationTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test(expectedExceptions = NullPointerException.class )
    public void exceptionAssertion() throws Exception{
    area.setTarget(3500.0);
    ceo.getDailyTarget();
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SystemConfig.class);
        area = (AreaManInformation)ctx.getBean("plkC2");
        
        ApplicationContext ctxp = new AnnotationConfigApplicationContext(SystemConfig.class);
        ceo = (CEOInformation2)ctx.getBean("plkV1");
        
        ApplicationContext ctxt = new AnnotationConfigApplicationContext(SystemConfig.class);
        store = (StoreManager)ctx.getBean("plkv2");
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
