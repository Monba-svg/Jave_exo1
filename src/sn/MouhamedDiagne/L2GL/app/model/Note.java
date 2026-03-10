package sn.MouhamedDiagne.L2GL.app.model;

import java.util.Objects;

public class Note {
    private final Etudiant etudiant;
    private final Module module;
    private double valeur;

//    public Note(Etudiant etudiant, Module module,double valeur) {
//        if(etudiant == null || module == null || valeur < 0 || valeur > 20 )
//        {
//            throw new IllegalArgumentException();
//        }
//
//        this.etudiant = etudiant;
//        this.module = module;
//        this.valeur = valeur;
//    }
    public Note(Etudiant etudiant, Module module,double valeur){
        if(etudiant == null || module == null || valeur < 0 || valeur > 20 )
        {
            throw new IllegalArgumentException();
        }

        this.etudiant = etudiant;
        this.module = module;
        this.valeur = valeur;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(etudiant, note.etudiant) && Objects.equals(module, note.module);
    }

    @Override
    public int hashCode() {
        return Objects.hash(etudiant, module);
    }

    public void setValeur(double valeur) {
        if(valeur < 0 || valeur > 20)
        {
            throw new IllegalArgumentException();
        }
        this.valeur = valeur;
    }
    public boolean estValidee()
    {
        if (valeur>=10)
        {
            return true;
        }
        return false;
    }
    public String mention()
    {
        if(valeur<10)
        {
            return "Ajournée";
        }
         else if (valeur>10 && valeur <=12) {
            return "Passable";
        } else if (valeur>12 && valeur<=14) {
            return "Assez bien";
        } else if (valeur>14 && valeur<=16) {
            return "bien";
        }else
        {
            return "Très bien";
        }
    }

}
