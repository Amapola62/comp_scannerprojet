/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joueurscanner;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class JoueurScanner {

    private static Scanner sc = new Scanner(System.in);
    private static List<Joueur> listeJoueurs;
    private static List<JoueurFoot> listeJoueursFoot;
    private static List<JoueurRugby> listeJoueursRugby;
    private static List<JoueurHandball> listeJoueursHandball;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int typejoueur = 0;
            String valeur = "";

            listeJoueurs = new ArrayList<Joueur>();

            do {
                System.out.println("Choisissez le type de Joueur que vous voulez créer");
                System.out.println("1. Créer un joueur de foot");
                System.out.println("2. Créer un joueur de rugby");
                System.out.println("3. Créer un joueur de handball");
                System.out.println("4. Afficher les équipes");
                System.out.println("5. Clear");
                System.out.println("0 = fin : ");
                while (!sc.hasNextInt()) {
                    System.out.println("Choisissez le type de Joueur que vous voulez créer");
                    System.out.println("1. Créer un joueur de foot");
                    System.out.println("2. Créer un joueur de rugby");
                    System.out.println("3. Créer un joueur de handball");
                    System.out.println("4. Afficher les équipes");
                    System.out.println("5. Clear");
                    System.out.println("0 = fin : ");
                    sc.next();
                }
                valeur = sc.next();
                typejoueur = Integer.parseInt(valeur);
                switch (typejoueur) {
                    case 1:
                        saisir_joueur(new JoueurFoot());
                        break;
                    case 2:
                        saisir_joueur(new JoueurRugby());
                        break;
                    case 3:
                        saisir_joueur(new JoueurHandball());
                        break;
                    case 4:
                        genererEquipe();
                        break;
                    case 5:
                        clearJoueurs();
                }
            } while (typejoueur != 0);
            //todo continuer le programme
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     *
     * @param ListeJoueurs
     * <b>Toutes les exceptions seront gérées dans le main.</b>
     * <i>On saisit toutes les données du joueur et on contrôle la saisie</i>
     * @throws Exception
     */
    public static void saisir_joueur(Joueur oJ) throws Exception {
        String temp = "";
        int valtemp = 0;
        System.out.println("Entrez un nom");
        oJ.setNom(setClavier(temp));
        System.out.println("Entrez un prénom");
        oJ.setPrenom(setClavier(temp));
        System.out.println("Entrez un âge");
        valtemp = setClavier(valtemp);
        if (valtemp > 12) {
            oJ.setAge(valtemp);
        } else {
            throw new Exception("Le joueur est trop jeune");
        }
        System.out.println("Entrez un genre");
        temp = setClavier(temp);
        if (temp.equalsIgnoreCase("m")) { //Masculin
            oJ.setGenre(Genre.Masculin);
        } else {
            if (temp.equalsIgnoreCase("f")) {//Feminin
                oJ.setGenre(Genre.Feminin);
            } else {
                throw new Exception("Le genre est invalide");
            }
        }
        System.out.println("Entrez un pseudo");
        oJ.setPseudo(setClavier(temp));
        System.out.println("Entrez un mot de passe");
        temp = setClavier(temp);
        if (temp.length() > 2) {
            oJ.setMotDePasse(temp);
        } else {
            throw new Exception("Le mot de passe est trop court");
        }
        listeJoueurs.add(oJ);
    }

    public static String setClavier(String temp) {
        temp = sc.next();
        return temp;
    }

    public static int setClavier(int temp) {
        if (sc.hasNextInt()) {
            temp = sc.nextInt();
        }
        return temp;
    }

    public static void genererEquipe() {
        try {
            listeJoueursFoot = new ArrayList<JoueurFoot>();
            listeJoueursRugby = new ArrayList<JoueurRugby>();
            listeJoueursHandball = new ArrayList<JoueurHandball>();

            for (Joueur oJ : listeJoueurs) {

                if (oJ instanceof JoueurFoot) {
                    listeJoueursFoot.add((JoueurFoot) oJ);
                }
                if (oJ instanceof JoueurRugby) {
                    listeJoueursRugby.add((JoueurRugby) oJ);
                }
                if (oJ instanceof JoueurHandball) {
                    listeJoueursHandball.add((JoueurHandball) oJ);
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        afficherEquipe();
    }

    public static void afficherEquipe() {
        if(!listeJoueursFoot.isEmpty()) {
        System.out.println("Foot : " + "\n");
        for (JoueurFoot oJ : listeJoueursFoot) {
            System.out.println("Nom : " + oJ.getNom() + "\n" + "Prenom : " + oJ.getPrenom() + "\n" + "Age :" + oJ.getAge() + "\n" + "Genre :" + oJ.getGenre());
            System.out.println("--");
            }
        }
        if(!listeJoueursRugby.isEmpty()) {
        System.out.println("------");
        System.out.println("Rugby : " + "\n");
        for (JoueurRugby oJ : listeJoueursRugby) {
            System.out.println("Nom : " + oJ.getNom() + "\n" + "Prenom : " + oJ.getPrenom() + "\n" + "Age :" + oJ.getAge() + "\n" + "Genre :" + oJ.getGenre());
            System.out.println("--");
            }
        }
        if(!listeJoueursHandball.isEmpty()) {
        System.out.println("------");
        System.out.println("Handball : " + "\n");
        for (JoueurHandball oJ : listeJoueursHandball) {
            System.out.println("Nom : " + oJ.getNom() + "\n" + "Prenom : " + oJ.getPrenom() + "\n" + "Age :" + oJ.getAge() + "\n" + "Genre :" + oJ.getGenre());
            System.out.println("--");
            }
        }
    }
    public static void clearJoueurs() {
        listeJoueursFoot.clear();
        listeJoueursRugby.clear();
        listeJoueursHandball.clear();
    }
    public static void AfficheRessources(Ressource oR) {
        System.out.println("Nom du jeu : "+oR.getJeux()+"\n"+"Couleur :"+oR.getCouleur());
    }
    public static Equipe CreerEquipe(List<Joueur> listeJoueurs) {
        String Nom;
        System.out.println("Saisir le nom de l'équipe :");
        Nom = sc.next();
        Equipe oE = new Equipe(Nom, listeJoueurs);
        return oE;
    }
    
}
