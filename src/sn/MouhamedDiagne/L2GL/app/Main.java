package sn.MouhamedDiagne.L2GL.app;

import sn.MouhamedDiagne.L2GL.app.model.*;
import sn.MouhamedDiagne.L2GL.app.model.Module;

public class Main {
    public static void main(String[] args)
    {
        Etudiant p = new Etudiant("TOTO","TOTO@gmail.com","TOTO");
//        System.out.println(p.identite("X"));
        Interface_Affichable[] elements = new Interface_Affichable[3];
        elements[0] = new Module("Azerty");
        elements[1] = new Module("Azerty2");
        elements[2] = p;
        for (Interface_Affichable m : elements ) {
            System.out.println(m.afficher());
        }
        Module m2 = new Module("Azerty3");
        Module m = new Module("Azerty3");
        Note n = new Note(p,m,14);
        Note n2 = new Note(p,m,15);
        System.out.println(n.mention());
        System.out.println(m2.equals(m));
        System.out.println(m2==m);

        System.out.println(p.carte());
    }
}
