/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.designprinciples.plk.correction.Imp;

/**
 *
 * @author student
 */
public class CEOInformation {
    
    AreaManInformation areaM;
    
    public void setManager(AreaManInformation m)
    {
        areaM = m;
    }
    public double getDailyTarget()
    {
        return areaM.getTarget();
    }
    
}
