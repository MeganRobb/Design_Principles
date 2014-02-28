/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.designprinciples.isp.correction;

import com.meganrobb.designprinciples.config.SystemConfig;
import com.meganrobb.designprinciples.isp.correction.Imp.DailyTarget;
import com.meganrobb.designprinciples.isp.correction.Imp.MonthlyTarget;
import com.meganrobb.designprinciples.isp.correction.Imp.YearlyTarget;
import com.tracy.designprinciples.config.AppConfig;
import com.tracy.designprinciples.isp.correction.AverageTermMarkCalc;
import com.tracy.designprinciples.isp.correction.TermMarkCalc;
import com.tracy.designprinciples.isp.correction.YearMarkCalc;
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
public class IspCorrectionTest {
    private static DailyTarget dTarget;
    private static MonthlyTarget mTarget;
    private static YearlyTarget yTarget;
    
    public IspCorrectionTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void ispCorrection() {
    Assert.assertEquals(dTarget.dailyFigures(350, 20),7000.0);
    Assert.assertEquals(mTarget.monthlyFigures(700, 30),21000.0);
    Assert.assertEquals(yTarget.yearlyFigures(2100, 12),25200.0);}

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(SystemConfig.class);
        dTarget = (DailyTarget)ctx1.getBean("ispC1");
        
        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(SystemConfig.class);
        mTarget = (MonthlyTarget)ctx2.getBean("ispC2");
        
        ApplicationContext ctx3 = new AnnotationConfigApplicationContext(SystemConfig.class);
        yTarget = (YearlyTarget)ctx3.getBean("ispC3");
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
