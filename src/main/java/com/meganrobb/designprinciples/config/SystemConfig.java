/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.meganrobb.designprinciples.config;

import com.meganrobb.designprinciples.plk.correction.Imp.AreaManInformation;
import com.meganrobb.designprinciples.plk.correction.Imp.CEOInformation;
import com.meganrobb.designprinciples.plk.violation.Imp.CEOInformation2;
import com.meganrobb.designprinciples.plk.violation.Imp.StoreManager;
import com.meganrobb.designprinciples.dip.correction.Imp.CalSalary;
import com.meganrobb.designprinciples.dip.correction.Imp.HeadOfficeSalary;
import com.meganrobb.designprinciples.dip.correction.Imp.RetailSalary;
import com.meganrobb.designprinciples.dip.violation.Imp.HeadOfficeSalary2;
import com.meganrobb.designprinciples.dip.violation.Imp.RetailSalary2;
import com.meganrobb.designprinciples.encapulation.Supplier;
import com.meganrobb.designprinciples.inheritance.QShoe;
import com.meganrobb.designprinciples.inheritance.SupplierInher;
import com.meganrobb.designprinciples.isp.correction.Imp.DailyTarget;
import com.meganrobb.designprinciples.isp.correction.Imp.DailyTargetImpl;
import com.meganrobb.designprinciples.isp.correction.Imp.MonthlyTarget;
import com.meganrobb.designprinciples.isp.correction.Imp.MonthlyTargetImpl;
import com.meganrobb.designprinciples.isp.correction.Imp.YearlyTarget;
import com.meganrobb.designprinciples.isp.correction.Imp.YearlyTargetImpl;
import com.meganrobb.designprinciples.isp.violation.Impl.CalculateFigures;
import com.meganrobb.designprinciples.isp.violation.Impl.CalculateFiguresImpl;
import com.meganrobb.designprinciples.lsp.correction.Imp.HeadOfficeStaff2;
import com.meganrobb.designprinciples.lsp.correction.Imp.RetailStaff2;
import com.meganrobb.designprinciples.lsp.correction.Imp.StaffMember;
import com.meganrobb.designprinciples.lsp.correction.Imp.StoreMember;
import com.meganrobb.designprinciples.lsp.violation.Imp.HeadOfficeStaff;
import com.meganrobb.designprinciples.lsp.violation.Imp.RetailStaff;
import com.meganrobb.designprinciples.lsp.violation.Imp.StaffMembers;
import com.meganrobb.designprinciples.ocp.correction.Imp.EveningSandals;
import com.meganrobb.designprinciples.ocp.correction.Imp.LeatherBoots;
import com.meganrobb.designprinciples.ocp.correction.Imp.ShoeSellprice;
import com.meganrobb.designprinciples.ocp.violation.Imp.SellingPrice;
import com.meganrobb.designprinciples.polymorphisim.QshoesPoly;
import com.meganrobb.designprinciples.polymorphisim.Shipping;
import com.meganrobb.designprinciples.polymorphisim.SupplierPoly;
import com.meganrobb.designprinciples.srp.correction.Imp.EmployeeReport;
import com.meganrobb.designprinciples.srp.correction.Imp.Employees;
import com.meganrobb.designprinciples.srp.violation.Impl.EmployeeImp;
import com.meganrobb.designprinciples.srp.violation.Impl.EmployeesV;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author student
 */
@Configuration
public class SystemConfig {

    @Bean(name = "encaps")
    public Supplier getService() {
        return new Supplier();
    }

    @Bean(name = "inher")
    public QShoe getProd() {
        return new SupplierInher();
    }
//Bean for polymorphism
    @Bean(name = "sup")
    public QshoesPoly getCost() {
        return new SupplierPoly();
    }

    @Bean(name = "ship")
    public QshoesPoly getPay() {
        return new Shipping();
    }
//Bean for srp correction
    @Bean(name = "srpC")
    public Employees getRepo() {
        return new EmployeeReport();
    }
//Bean for srp violation
    @Bean(name = "srpV")
    public EmployeesV getReport() {
        return new EmployeeImp();
    }
//Beans for isp violation
    @Bean(name = "ispV")
    public CalculateFigures getFigures() {
        return new CalculateFiguresImpl();
    }
 //Bean for isp correction   
    @Bean(name = "ispC1")
    public DailyTarget getDfig() {
        return new DailyTargetImpl();
    }
    
    @Bean(name = "ispC2")
    public MonthlyTarget getMfig() {
        return new MonthlyTargetImpl();
    }
    
    @Bean(name = "ispC3")
    public YearlyTarget getYfig() {
        return new YearlyTargetImpl();
    }
//Beans for ocp correction
    @Bean(name = "ocpC1")
    public ShoeSellprice getEve() {
        return new EveningSandals();
    }
    
    @Bean(name = "ocpC2")
    public ShoeSellprice getBoots() {
        return new LeatherBoots();
    }
//Beans for ocp violation
    @Bean(name = "ocpV1")
    public LeatherBoots getBootV() {
        return new LeatherBoots();
    }
    
    @Bean(name = "ocpV2")
    public EveningSandals getEveV() {
        return new EveningSandals();
    }
    
    @Bean(name = "ocpV3")
    public SellingPrice getSellV() {
        return new SellingPrice();
    }
//Bean for lsp correction
    @Bean(name = "lspC1")
    public StoreMember getHOStaff() {
        return new HeadOfficeStaff2();
    }
    
    @Bean(name = "lspC2")
    public StoreMember getRetailStaff() {
        return new RetailStaff2();
    }
    
    @Bean(name = "lspC3")
    public HeadOfficeStaff2 getStaff() {
        return new HeadOfficeStaff2();
    }
//Bean for lsp violation 
    @Bean(name = "lspV1")
    public StaffMembers getHO() {
        return new HeadOfficeStaff();
    }
    
    @Bean(name = "lspV2")
    public StaffMembers getRe() {
        return new RetailStaff();
    }
    
//Bean for dip correction
    @Bean(name = "dipC1")
    public HeadOfficeSalary getHOsal() {
        return new HeadOfficeSalary ();
    }
    
    @Bean(name = "dipC2")
    public CalSalary getResal() {
        return new RetailSalary ();
    }
//Bean for dip violation
    @Bean(name = "dipV1")
    public HeadOfficeSalary2 getHOsal2() {
        return new HeadOfficeSalary2 ();
    }
    
    @Bean(name = "dipV2")
    public RetailSalary2 getResal2() {
        return new RetailSalary2 ();
    }
 //Bean for plk correction
    @Bean(name = "plkC1")
    public CEOInformation getCeo() {
        return new CEOInformation ();}
    
     @Bean(name = "plkC2")
    public AreaManInformation getArea() {
        return new AreaManInformation ();}
    
//Bean for plk violations
    @Bean(name = "plkV1")
    public CEOInformation2 getCeoV() {
        return new CEOInformation2 ();}
    
     @Bean(name = "plkv2")
    public StoreManager getAreaV() {
        return new StoreManager ();}
    
    
}
