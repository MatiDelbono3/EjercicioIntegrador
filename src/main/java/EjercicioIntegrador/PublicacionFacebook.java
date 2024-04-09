package EjercicioIntegrador;
import java.util.Date;
public class PublicacionFacebook extends Publicacion{
    public PublicacionFacebook(int ID, int IDRedSocial, String texto){
        super(ID, IDRedSocial, texto);
    }


    @Override
    public void Publicar() {
        System.out.println("mensaje" + this.getTextoPublicacion() +"enviado por" + this.getIDRedSocial());
    }
}
