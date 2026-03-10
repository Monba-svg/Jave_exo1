package sn.MouhamedDiagne.L2GL.app.model;

import java.util.Objects;

public final class Etudiant extends Personne implements Interface_Affichable  {

    private final String matricule;
//    public Etudiant(String nom, String email, String matricule){
//        super(nom,email);
//        if(matricule.isBlank())
//        {
//            throw new IllegalArgumentException("Matricule non valide");
//        }
//        this.matricule=matricule;
//    }
    public Etudiant(String nom,String email,String matricule){
        super(nom,email);
        if(matricule.isBlank())
        {
            throw new IllegalArgumentException("Matricule non valide");
        }
        this.matricule=matricule;

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return Objects.equals(matricule, etudiant.matricule);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricule);
    }

    public String getMatricule() {
        return matricule;
    }

    //regex
//    @Override
//    public String role() {
//        return "Etudiant";
//    }
    @Override
    public String identite()
    {
        return  super.identite() + "matricule : " + matricule;
    }
//
//    public String identite(String prefixe)
//    {
//        return prefixe + " " + super.identite() + matricule;
//    }
    @Override
    public String afficher(){return "Matricule : " + matricule +"Nom : " + getNom() ; }

    @Override
    public String role()
    {
        return  "Etudiant";
    }



}
