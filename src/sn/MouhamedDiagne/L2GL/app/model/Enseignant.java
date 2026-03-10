package sn.MouhamedDiagne.L2GL.app.model;

public final class Enseignant extends Personne {
    private final String numeroSomme;
    public Enseignant(String nom,String email,String numeroSomme)
    {
        super(nom,email);
        if(numeroSomme.isBlank())
        {
            throw new IllegalArgumentException("Numero invalide");
        }
        this.numeroSomme=numeroSomme;
    }
    @Override
    public String role() {
        return "Etudiant";
    }


}
