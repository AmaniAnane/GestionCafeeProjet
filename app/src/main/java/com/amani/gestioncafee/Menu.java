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
        Menu m=new Menu("Cafe con leche","2.500",R.drawable.cafe2);
        lst.add(m);
        m=new Menu("Cafffe Direct","1500",R.drawable.cofe1);
        lst.add(m);
        m=new Menu("Cafffe Capoucino","1600",R.drawable.cofe3);
        lst.add(m);
        m=new Menu("Express coffee","1500",R.drawable.espresso);
        lst.add(m);
        return lst;
    }
    public static List<Menu> getAllDrinke()
    {
        List<Menu> lst=new ArrayList<Menu>();
        Menu m=new Menu("cocktail drink","6500",R.drawable.cocktail);
        lst.add(m);
        m=new Menu("TOM COLLINS COCKTAIL","7500",R.drawable.tom);
        lst.add(m);
        m=new Menu("Cocktails Cosmopolitan","8500",R.drawable.c);
        lst.add(m);
        return lst;
    }
    public static List<Menu> getAllDisert()
    {
        List<Menu> lst=new ArrayList<Menu>();
        Menu m=new Menu("Delicious Molecular Disert","9000",R.drawable.desert);
        lst.add(m);
        m=new Menu("Delicious Mokla Disert","4500",R.drawable.diser);
        lst.add(m);
        m=new Menu("Delicious  Disert","5500",R.drawable.diserr);
        lst.add(m);
        return lst;
    }
    public static List<Menu> getAllBrekfest()
    {
        List<Menu> lst=new ArrayList<Menu>();
        Menu m=new Menu("Pancakes","22000",R.drawable.brk1);
        lst.add(m);
        m=new Menu("French Toast","23500",R.drawable.breakfast);
        lst.add(m);
        m=new Menu("lo-Caba","12500",R.drawable.brk3);
        lst.add(m);
        return lst;
    }




}
