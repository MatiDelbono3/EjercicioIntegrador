package EjercicioIntegrador;

public class PublicacionTwitter extends Publicacion{
    public PublicacionTwitter(int ID, int IDRedSocial, String texto) {
        super(ID, IDRedSocial, texto);
    }
    @Override
    public void Publicar(){
        if (getTextoPublicacion().length()<=280 && getID()==1) {
            System.out.println("mensaje" + this.getTextoPublicacion() +"enviado por" + this.getIDRedSocial());
        }
        }
    }

