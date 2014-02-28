/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.designprinciples.lsp.correction;

import com.meganrobb.designprinciples.config.SystemConfig;
import com.meganrobb.designprinciples.lsp.correction.Imp.HeadOfficeStaff2;
import com.meganrobb.designprinciples.lsp.correction.Imp.StoreMember;
import com.tracy.designprinciples.config.AppConfig;
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
    private static HeadOfficeStaff2 head;
    private static StoreMember store;
    
    public IspCorrectionTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void lspCorrectTest() {
    head.setEmpID("ABR8907");
    store.setName("Nurran");
    Assert.assertEquals(head.getEmpID(),"ABR8907");
    Assert.assertEquals(store.getName(),"Nurran");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(SystemConfig.class);
        head = (HeadOfficeStaff2)ctx1.getBean("lspC1");
        
        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(SystemConfig.class);
        store = (StoreMember)ctx2.getBean("lspC2");
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
