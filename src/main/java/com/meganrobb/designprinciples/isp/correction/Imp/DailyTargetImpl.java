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
public class DailyTargetImpl implements DailyTarget {
    public double dailyFigures(double price, double quan){
        double dFig = price * quan;
        return dFig;
    }
    
}
