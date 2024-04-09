package EjercicioIntegrador;

import java.util.Date;

public abstract class Publicacion {
    private int ID;
    private String TextoPublicacion;
    private int IDRedSocial;
    private Date FechaCreacion;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTextoPublicacion() {
        return TextoPublicacion;
    }

    public void setTextoPublicacion(String textoPublicacion) {
        TextoPublicacion = textoPublicacion;
    }

    public int getIDRedSocial() {
        return IDRedSocial;
    }

    public void setIDRedSocial(int IDRedSocial) {
        this.IDRedSocial = IDRedSocial;
    }

    public Date getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        FechaCreacion = fechaCreacion;
    }
    public Publicacion (int ID, int IDRedSocial, String TextoPublicacion){
        this.ID=ID;
        this.IDRedSocial=IDRedSocial;
        this.TextoPublicacion=TextoPublicacion;
        Date Fecha=new Date();
    }
    public void Publicar(){
        System.out.println("publicando");
    }
}
