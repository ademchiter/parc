/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcautomobile;

import com.vaadin.data.util.BeanItemContainer;
import java.util.List;

/**
 *
 * @author vincent
 */
public class Visiteur implements java.io.Serializable {

    private int id;
    private String nom;
    private String prenom;
    private String idVehicule = "0";
    private int leidVehicule;
    private static BeanItemContainer<Visiteur> personnes = new BeanItemContainer<>(Visiteur.class);

    public Visiteur(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.personnes.addBean(this);
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public static BeanItemContainer<Visiteur> getPersonnes() {
        return personnes;
    }

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

    public String getVehiculeUtilise() {
        return idVehicule;
    }

}
