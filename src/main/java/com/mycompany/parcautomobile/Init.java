/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcautomobile;

import com.sun.jndi.cosnaming.IiopUrl.Address;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Table;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 *
 * @author vincent
 */
public class Init {

    private static Init uniqueInstance;
    public XMLDecoder decoder = null;
    public XMLEncoder encoder = null;

    private Init() {
        encodXML();
        decodXML();
    }

    public static Init getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Init();
        }
        return uniqueInstance;

    }

    public void encodXML() {

        Visiteur vincent = new Visiteur(1, "Mazet", "Vincent");
        Visiteur marlon = new Visiteur(2, "Chatte-illon", "Marlon");
        Visiteur alexy = new Visiteur(3, "hivercruysse", "Alexy");

        Vehicule vehicule1 = new Vehicule(1, "Renault", "Clio", 10000);
        Vehicule vehicule2 = new Vehicule(2, "Audi", "A8", 12500);
        Vehicule vehicule3 = new Vehicule(3, "Toyota", "Yaris", 15005);
        Vehicule vehicule4 = new Vehicule(4, "Renault", "titine", 1);

        alexy.addVehicule(vehicule4);
        alexy.addVehicule(vehicule2);
        alexy.addVehicule(vehicule1);
        marlon.addVehicule(vehicule1);
        marlon.addVehicule(vehicule2);

        try {
            encoder = new XMLEncoder(new BufferedOutputStream(
                    new FileOutputStream("utilisateur.xml")));

            encoder.writeObject(vincent.getLPersonnes());
            encoder.writeObject(marlon.getLPersonnes());
            encoder.writeObject(alexy.getLPersonnes());;
            encoder.flush();

        } catch (final java.io.IOException e) {
            e.printStackTrace();
        } finally {
            if (encoder != null) {
                encoder.close();
            }
        }

    }

    public void decodXML() {

        XMLDecoder decoder = null;

        try {
            decoder = new XMLDecoder(new FileInputStream("utilisateur.xml"));
            Visiteur.setLPersonnes((ArrayList<Visiteur>) decoder.readObject()); 
            //final Visiteur visiteur = (Visiteur) decoder.readObject();
            for (Visiteur uv : Visiteur.getLPersonnes()) {
                System.out.println(uv.getPrenom());
            }
        } catch (final Exception e) {
            e.printStackTrace();
        } finally {
            if (decoder != null) {
                decoder.close();
            }
        }
    }
}
