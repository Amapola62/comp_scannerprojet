/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joueurscanner;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Formation
 */
public class Equipe implements Ressource{
    private String nom;
    private String jeux;
    private List<Joueur>listeJoueurs = new ArrayList <Joueur>();
    private Color couleur;
   
    
    public Equipe(String Nom, List<Joueur> listeJoueurs) {
        this.nom = nom;
        this.listeJoueurs = listeJoueurs;
    }
    
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
        return  this.couleur;
    }

    public String getNom() {
        return nom;
    }

    public List<Joueur> getListeJoueurs() {
        return listeJoueurs;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }
    
}
