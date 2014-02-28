/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.designprinciples.ocp.correction.Imp;

/**
 *
 * @author student
 */
public class LeatherBoots implements ShoeSellprice {
    public double calculateSellPrice(double costP)
    {
        double sellingP = (costP * 0.50)+costP;
        return sellingP;
    }
}
