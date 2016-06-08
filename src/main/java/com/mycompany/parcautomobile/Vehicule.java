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


// test commentaire à supprimer

/**
 *
 * @author user
 */
public class Vehicule implements java.io.Serializable {

    private int id;
    private String marque;
    private String modele;
    
    private double prix;
    private String gamme;
    private static BeanItemContainer<Vehicule> vehicules = new BeanItemContainer<>(Vehicule.class);
    private static BeanItemContainer<Vehicule> vehiculesPC = new BeanItemContainer<>(Vehicule.class);

    /**
     *@constructeur
     */
    public Vehicule() {
    }

    /**
     *@constructeur
     * @param id
     * @param marque
     * @param modele
     * @param prix
     * @param gamme
     */
    public Vehicule(int id, String marque, String modele, double prix, String gamme) {
        this.id = id;
        this.marque = marque;
        this.modele = modele;
        this.prix = prix;
        this.gamme = gamme;
        this.vehicules.addBean(this);
    }

    /**
     *
     * @return la marque du vehicule
     */
    public String getMarque() {
        return marque;
        
    }

    /**
     *
     * @return le modele du véhicule
     */
    public String getModele() {
        return modele;
    }

    /**
     *
     * @return le prix du véhicule
     */ 
    public double getPrix() {
        return prix;
    }

    /**
     *
     * @param marque
     */
    public void setMarque(String marque) {
        this.marque = marque;
    }

    /**
     *
     * @param modele
     */
    public void setModele(String modele) {
        this.modele = modele;
    }

    /**
     *
     * @param prix
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }

    /**
     *
     * @return l'identifiant du véhicule
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return la gamme
     */
    public String getGamme() {
        return gamme;
    }

    /**
     *
     * @param gamme
     */
    public void setGamme(String gamme) {
        this.gamme = gamme;
    }
    
    /**
     *
     * @return une collection de vehicule
     */ 
    public static BeanItemContainer<Vehicule> getVehicules() {
        return vehicules;
    }

    /**
     *
     * @param prix
     * @return la collection de véhicule ayant un prix supérieur à la variable prix entrée en paramètre
     */
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

    
}
