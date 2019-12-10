package com.amani.gestioncafee;

import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private String nom;
    private String prix;
    private int image;

    public Menu(String nom, String prix,int image)
    {

        this.nom=nom;
        this.prix=prix;
        this.image=image;
    }

    public Menu()
    {

        this.nom="";
        this.prix="0";
        this.image=0;
    }






    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setPrix (String prix) {
        this.prix = prix;
    }

    public String getPrix() {
        return prix;
    }

    public void setImage (int image) {
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public static List<Menu> getAllCaffee()
    {
        List<Menu> lst=new ArrayList<Menu>();
        Menu m=new Menu("Caffee Turk","2500",R.drawable.aa);
        lst.add(m);
        m=new Menu("Cafffe Direct","1500",R.drawable.a);
        lst.add(m);
        return lst;
    }
    public static List<Menu> getAllDrinke()
    {
        List<Menu> lst=new ArrayList<Menu>();
        Menu m=new Menu("Caffee Turk","2500",R.drawable.aa);
        lst.add(m);
        m=new Menu("Cafffe Direct","1500",R.drawable.a);
        lst.add(m);
        return lst;
    }
    public static List<Menu> getAllDisert()
    {
        List<Menu> lst=new ArrayList<Menu>();
        Menu m=new Menu("Caffee Turk","2500",R.drawable.aa);
        lst.add(m);
        m=new Menu("Cafffe Direct","1500",R.drawable.a);
        lst.add(m);
        return lst;
    }
    public static List<Menu> getAllBrekfest()
    {
        List<Menu> lst=new ArrayList<Menu>();
        Menu m=new Menu("Caffee Turk","2500",R.drawable.aa);
        lst.add(m);
        m=new Menu("Cafffe Direct","1500",R.drawable.a);
        lst.add(m);
        return lst;
    }




}
