/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.designprinciples.plk.violation.Imp;

import com.meganrobb.designprinciples.plk.correction.Imp.AreaManInformation;

/**
 *
 * @author student
 */
public class StoreManager {
    private AreaManInformation area;
    
    public double getDailyTarget()
    {
        return area.getTarget();
    }
    
}
