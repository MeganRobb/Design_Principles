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
public class CalculateFiguresImpl implements CalculateFigures {

    public double dailyFigures(double price, double quan) {
        double dFigures = price * quan;
        return dFigures;
    }

    public double monthlyFigures(double dailyInc, double days) {
        double mFigures = dailyInc * days;
        return mFigures;
    }

    public double yearlyFigures(double monthlyInc, double months) {
        double yFigures = monthlyInc * months;
        return yFigures;
    }

}
