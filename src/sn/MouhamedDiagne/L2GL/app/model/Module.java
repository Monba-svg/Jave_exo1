package sn.MouhamedDiagne.L2GL.app.model;

import java.util.Objects;

public class Module implements Interface_Affichable {
    protected String code;
//    protected String libelle;
//    public Module(String code, String libelle) {
//        if(code == null || libelle == null || code.isBlank() || libelle.isBlank()) {
//            throw new IllegalArgumentException();
//        }
//        this.code = code;
//        this.libelle = libelle;
//    }
    public Module(String code){
        if(code == null || code.isBlank()){
            throw new IllegalArgumentException();
        }
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Module module = (Module) o;
        return Objects.equals(code, module.code);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(code);
    }

    @Override
    public String afficher()
    {
        return "code : " + code ;
    }


}
