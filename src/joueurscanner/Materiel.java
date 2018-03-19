/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joueurscanner;

import java.awt.Color;

/**
 *
 * @author Formation
 */
public class Materiel implements Ressource{
    private String NomDuMateriel;
    private String jeux;
    private Color couleur;
    
    @Override
    public String getJeux() {
        return jeux;
    }

    @Override
    public void setJeux() {
        this.jeux = jeux;
    }

    @Override
    public Color getCouleur() {
        return this.couleur;
    }

    public Materiel(String NomDuMateriel) {
        this.NomDuMateriel = NomDuMateriel;
    }

    public String getNomDuMateriel() {
        return NomDuMateriel;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }
    
}
