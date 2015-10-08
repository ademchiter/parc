/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcautomobile;

import com.vaadin.ui.Grid;
import com.vaadin.ui.Table;

/**
 *
 * @author vincent
 */
public class Init {

    private static Init uniqueInstance;

    private Init() {

        Visiteur vincent = new Visiteur(1, "Mazet", "Vincent");
        Visiteur marlon = new Visiteur(2, "Chatte-illon", "Marlon");
        Visiteur alexy = new Visiteur(3, "hivercruysse", "Alexy");

        Vehicule vehicule1 = new Vehicule(1, "Renault", "Clio", 10000);
        Vehicule vehicule2 = new Vehicule(2, "Audi", "A8", 12500);
        Vehicule vehicule3 = new Vehicule(3, "Toyota", "Yaris", 15005);
        Vehicule vehicule4 = new Vehicule(4, "Renault", "titine", 1);

        alexy.addVehicule(vehicule4.getId());
        marlon.addVehicule(vehicule1.getId());

    }

    public static Init getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Init();
        }
        return uniqueInstance;

    }

}
