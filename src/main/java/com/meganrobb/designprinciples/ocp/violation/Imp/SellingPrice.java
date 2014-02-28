/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.meganrobb.designprinciples.ocp.violation.Imp;

import com.meganrobb.designprinciples.ocp.correction.Imp.LeatherBoots;

/**
 *
 * @author student
 */
public class SellingPrice {

    public double calSellP(Object Shoes, double cost) {
        double sellP = 0;
        if (Shoes instanceof LeatherBoots) {
            sellP = (cost * 0.50) + cost;
        } else {
            sellP = (cost * 0.30) + cost;
        }
        return sellP;

    }

}
