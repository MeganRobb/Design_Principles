/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.designprinciples.isp.correction.Imp;

/**
 *
 * @author student
 */
public class YearlyTargetImpl implements YearlyTarget{
    public double yearlyFigures(double monthlyInc, double months){
        double yFig = monthlyInc*months;
        return yFig;
    }
    
}
