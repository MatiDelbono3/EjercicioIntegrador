package org.example;
import EjercicioIntegrador.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
            System.out.println("ingresar Nombre");
            int ID=lectura.nextInt();
            while (ID!= 0){
                System.out.println("ingrese texto");
                String texto=lectura.next();
                System.out.println("ingrese ID red social");
                int IDRedSocial=lectura.nextInt();
                System.out.println("ingrese Fecha de Creacion");
                ArrayList<Publicacion>publicaciones=new ArrayList<Publicacion>();
                if (IDRedSocial==1) {
                    PublicacionFacebook publicacionFacebook=new PublicacionFacebook(ID,IDRedSocial, texto);
                    publicaciones.add(publicacionFacebook);
                }
                else {
                    PublicacionTwitter publicacionTwitter=new PublicacionTwitter(ID, IDRedSocial, texto);
                    publicaciones.add(publicacionTwitter);
                }


        }
    }
}