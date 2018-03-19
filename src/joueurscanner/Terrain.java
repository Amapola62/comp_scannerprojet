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
public class Terrain implements Ressource{
    private int X1, Y1, X2, Y2;
    private String Situation;
    private String jeux;

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
        return Color.GREEN;
    }

    public Terrain(int X1, int Y1, int Y2, String Situation) {
        this.X1 = X1;
        this.Y1 = Y1;
        this.Y2 = Y2;
        this.Situation = Situation;
    }

    public int getX1() {
        return X1;
    }

    public void setX1(int X1) {
        this.X1 = X1;
    }

    public int getY1() {
        return Y1;
    }

    public void setY1(int Y1) {
        this.Y1 = Y1;
    }

    public int getX2() {
        return X2;
    }

    public void setX2(int X2) {
        this.X2 = X2;
    }

    public int getY2() {
        return Y2;
    }

    public void setY2(int Y2) {
        this.Y2 = Y2;
    }

    public String getSituation() {
        return Situation;
    }

    public void setSituation(String Situation) {
        this.Situation = Situation;
    }
    
}
