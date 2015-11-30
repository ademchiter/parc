/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcautomobile;

import com.vaadin.data.util.BeanItem;
import com.vaadin.data.util.BeanItemContainer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Vehicule implements java.io.Serializable {

    private int id;
    private String marque;
    private String modele;
    private int laGamme;
    private double prix;
    private static BeanItemContainer<Vehicule> vehicules = new BeanItemContainer<>(Vehicule.class);
    private static BeanItemContainer<Vehicule> vehiculesPC = new BeanItemContainer<>(Vehicule.class);

    public Vehicule() {
    }

    public Vehicule(int id, String marque, String modele, double prix) {
        this.id = id;
        this.marque = marque;
        this.modele = modele;
        this.prix = prix;
        this.vehicules.addBean(this);
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public double getPrix() {
        return prix;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static BeanItemContainer<Vehicule> getVehicules() {
        return vehicules;
    }

    public static BeanItemContainer<Vehicule> getPb(int prix) {

        List<Vehicule> lv;
        lv = (List<Vehicule>) vehicules.getItemIds();

        for (Vehicule unV : lv) {
            if (unV.getPrix() < prix) {
                vehiculesPC.addBean(unV);
            }
        }
        return vehiculesPC;
    }

    /**
     * @return the laGamme
     */
    public int getLaGamme() {
        return laGamme;
    }

    /**
     * @param laGamme the laGamme to set
     */
    public void setLaGamme(int laGamme) {
        this.laGamme = laGamme;
    }

}
