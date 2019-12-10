package com.amani.gestioncafee;

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



}
