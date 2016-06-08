/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcautomobile;

import com.vaadin.data.util.BeanItemContainer;
import java.util.ArrayList;
import java.util.List;

// test commentaire à supprimer

/**
 *
 * @author adem
 */
public class Visiteur implements java.io.Serializable {

    private int id;
    private String nom;
    private String prenom;
    private String idVehicule = "0";
    private int leidVehicule;
    private static BeanItemContainer<Visiteur> personnes = new BeanItemContainer<>(Visiteur.class);
    private static ArrayList<Visiteur> lp = new ArrayList<Visiteur>();
    
    /**
     * @constructeur
     */
    public Visiteur(){
        
    }

    /**
     *
     * @param id
     * @param nom
     * @param prenom
     */
    public Visiteur(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.personnes.addBean(this);
        this.lp.add(this);
    }

    /**
     *
     * @return  l'id du visiteur
     */
    public int getID() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setID(int id) {
        this.id = id;
    }

    /**
     *
     * @return le nom du visiteur
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @return le prénom du visiteur
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     *
     * @param prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     *
     * @return collection de personnes
     */
    public static BeanItemContainer<Visiteur> getPersonnes() {
        return personnes;
    }
    
    /**
     *
     * @return collection de personnes
     */
    public static ArrayList<Visiteur> getLPersonnes() {
        return lp;
    }
    
    /**
     *
     * @param v
     */
    public static void setLPersonnes(ArrayList<Visiteur> v){
        lp=v;
    }
    
    /**
     * affecte un véhicule à un visiteur
     * @param v
     */
    public void addVehicule(Vehicule v) {
        leidVehicule = v.getId();
        if (idVehicule == "0") {
            idVehicule = Integer.toString(leidVehicule);
            personnes.addBean(this);

        } else {
            idVehicule = idVehicule + ',' + Integer.toString(leidVehicule);
            personnes.addBean(this);

        }

    }

    /**
     *
     * @return les véhicules utilisés par une personne
     */
    public String getVehiculeUtilise() {
        return idVehicule;
    }

}
