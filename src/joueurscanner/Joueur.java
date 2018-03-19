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
public class Joueur implements Ressource{
    private String Nom;
    private String Prenom;
    private int Age;
    private Genre Genre;
    private String Pseudo;
    private String MotDePasse;
    private String jeux;
    private Color couleur;
    
    public Joueur() {
        this.Age = 0;
        this.MotDePasse = "";
        this.Prenom = "";
        this.Pseudo= "";
        this.Nom = "";
        this.Genre = Genre.Masculin;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public Genre getGenre() {
        return Genre;
    }

    public void setGenre(Genre Genre) {
        this.Genre = Genre;
    }

    public String getPseudo() {
        return Pseudo;
    }

    public void setPseudo(String Pseudo) {
        this.Pseudo = Pseudo;
    }

    public String getMotDePasse() {
        return MotDePasse;
    }

    public void setMotDePasse(String MotDePasse) {
        this.MotDePasse = MotDePasse;
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

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }
 
}
