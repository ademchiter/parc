/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcautomobile;

/**
 *
 * @author SESSION 2
 */
public class Gamme {
    
    private int idGamme;
    private String nomGamme;
    
    public Gamme(int idGamme, String nomGamme){
    this.idGamme=idGamme;
    this.nomGamme=nomGamme;
    }

    /**
     * @return the idGamme
     */
    public int getIdGamme() {
        return idGamme;
    }

    /**
     * @param idGamme the idGamme to set
     */
    public void setIdGamme(int idGamme) {
        this.idGamme = idGamme;
    }

    /**
     * @return the nomGamme
     */
    public String getNomGamme() {
        return nomGamme;
    }

    /**
     * @param nomGamme the nomGamme to set
     */
    public void setNomGamme(String nomGamme) {
        this.nomGamme = nomGamme;
    }
    
    
}
    
