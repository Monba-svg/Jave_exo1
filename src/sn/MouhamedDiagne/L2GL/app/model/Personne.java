package sn.MouhamedDiagne.L2GL.app.model;

public abstract class Personne implements Interface_Affichable
{
    private final String nom;
    private final String email;
    public Personne(String nom,String email){
        if(nom==null || nom.isBlank())
        {
            throw new IllegalArgumentException("Nom incorrect");
        }
        if(email==null || email.isBlank() || !email.contains("@")) {
            throw new IllegalArgumentException("Email non valide incorrect");
        }
        this.email=email;
        this.nom=nom;
    }
    public String getNom()
    {
        return nom;
    }
    public String getEmail()
    {
        return email;
    }
    public abstract String role();
    public String identite()
    {
        return "Nom : "+ nom ;
    }

    @Override
    public String afficher()
    {
        return "Nom : "+ nom + " email : " + email;
    }
    public final String carte()
    {
        return "Role : " + role() + "Identité  : " + identite() +" et contact : " + email ;
    }

}
