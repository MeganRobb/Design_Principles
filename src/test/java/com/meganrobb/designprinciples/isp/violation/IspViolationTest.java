/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.designprinciples.isp.violation;

import com.meganrobb.designprinciples.config.SystemConfig;
import com.meganrobb.designprinciples.isp.violation.Impl.CalculateFigures;
import com.tracy.designprinciples.config.AppConfig;
import com.tracy.designprinciples.isp.violation.MarkCalculator;
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
public class IspViolationTest {
    private static CalculateFigures figures;
    public IspViolationTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void ispViolation() {
    Assert.assertEquals(figures.dailyFigures(350, 20),7000.0);
    Assert.assertEquals(figures.monthlyFigures(700, 30),21000.0);
    Assert.assertEquals(figures.yearlyFigures(2100, 12),25200.0);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SystemConfig.class);
        figures = (CalculateFigures)ctx.getBean("ispV");
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
