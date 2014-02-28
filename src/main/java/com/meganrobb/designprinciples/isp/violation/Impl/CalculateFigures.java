/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.designprinciples.isp.violation.Impl;

/**
 *
 * @author student
 */
public interface CalculateFigures {
    public double dailyFigures(double price,double quan);
    public double monthlyFigures(double dailyInc,double days);
    public double yearlyFigures(double monthlyInc,double months);
    
}
