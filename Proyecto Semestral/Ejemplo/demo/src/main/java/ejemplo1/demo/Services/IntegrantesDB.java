package ejemplo1.demo.Services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ejemplo1.demo.Models.Iniciosesion;
import ejemplo1.demo.Models.Integrantes;
import ejemplo1.demo.Models.Productos;
import ejemplo1.demo.Models.Usuarios;
import ejemplo1.demo.Models.Perfil;
public class IntegrantesDB {
    Connection cn;

    public IntegrantesDB(){
        cn=new Conexion().openDB();
    }


    public List<Integrantes> ObtenerIntegrantes(){
        try {
            Statement stnt = cn.createStatement();
            String query = "select * from integrantes";

            List<Integrantes> Integrante = new ArrayList<>();

            ResultSet result = stnt.executeQuery(query);

            while(result.next()){
                Integrantes integrante = new Integrantes(
                    result.getString("url"),
                    result.getString("nombre")
                );

                Integrante.add(integrante);

            }
            result.close();
            stnt.close();
            return Integrante;
        } catch (Exception e) {
            System.out.println("ocurrio una excepcion en integrantesDB-Integrante");
        }
        return null;
    }




    public List<Productos> ObtenerCatalogo(){
        try {
            Statement stnt = cn.createStatement();
            String query = "select * from Productos";

            List<Productos> Producto1 = new ArrayList<>();

            ResultSet result = stnt.executeQuery(query);

            while(result.next()){
                Productos producto2 = new Productos(
                    result.getString("tipo"),
                    result.getString("nombre"),
                    result.getString("imagen"),
                    result.getString("precio"),
                    result.getString("descripcion")
                );

                Producto1.add(producto2);

            }
            result.close();
            stnt.close();
            return Producto1;
        } catch (Exception e) {
            System.out.println("ocurrio una excepcion en integrantesDB-Producto");
        }
        return null;
    }
    

    public List<Usuarios> IngresarUsuario(Usuarios obj){
        try {
            Statement stnt = cn.createStatement();
            String query = "insert into usuarios values('";
            query+=obj.getCorreo();
            query+="','";
            query+=obj.getNombre();
            query+="','";
            query+=obj.getNombrecom();
            query+="','";
            query+=obj.getPassword();
            query+="','";
            query+=obj.getEdad();
            query+="','";
            query+=obj.getDireccion();
            query+="','";
            query+=obj.getGenero();
            query+="','";
            query+=obj.getCedula();
            query+="')";

            System.out.println(query);

            stnt.execute(query);

            stnt.close();
        } catch (Exception e) {
            System.out.println("ocurrio una excepcion en integrantesDB-Integrante");
            System.out.println(e);
        }
        return null;
    }

    public List<Integrantes> Login(Integrantes obj){
        try {
            Statement stnt = cn.createStatement();
            String query = "select * from usuarios where nombre = '";
            query+=obj.getUrl();
            query+="' and password = '";
            query+=obj.getNombre();
            query+="'";

            System.out.println(query);

            ResultSet result = stnt.executeQuery(query);

            if(result.next()){
                String query2 = "update activo set estado='";
                query2+=obj.getUrl();
                query2+="' where id=1";
                System.out.println(query2);
                stnt.execute(query2);
                Bandera();
            }
            else{
                String query2 = "update activo set estado='nada'  where id=1";
                System.out.println(query2);
                stnt.execute(query2);
                Bandera();
            }

            stnt.close();
        } catch (Exception e) {
            System.out.println("ocurrio una excepcion en integrantesDB-InicioSesion");
            System.out.println(e);
        }
        return null;
    }

    public List<Iniciosesion> Bandera(){
        try {
            Statement stnt = cn.createStatement();
            String query = "select * from activo";

            System.out.println(query);

            List<Iniciosesion> Producto1 = new ArrayList<>();

            ResultSet result = stnt.executeQuery(query);

            while(result.next()){
                Iniciosesion producto2 = new Iniciosesion(
                    result.getString("estado")
                );

                Producto1.add(producto2);

            }
            result.close();
            stnt.close();
            return Producto1;
        } catch (Exception e) {
            System.out.println("ocurrio una excepcion en integrantesDB-Producto");
        }
        return null;
    }

    public List<Usuarios> VerPerfil(){
        try {
            Statement stnt = cn.createStatement();
            String query = "select * from usuarios";

            List<Usuarios> Producto1 = new ArrayList<>();

            ResultSet result = stnt.executeQuery(query);

            while(result.next()){
                Usuarios producto2 = new Usuarios(
                    result.getString("correo"),
                    result.getString("nombre"),
                    result.getString("nombrecom"),
                    result.getString("password"),
                    result.getString("edad"),
                    result.getString("direccion"),
                    result.getString("genero"),
                    result.getString("cedula")
                );

                Producto1.add(producto2);

            }
            result.close();
            stnt.close();
            return Producto1;
        } catch (Exception e) {
            System.out.println("ocurrio una excepcion en integrantesDB-Usuarios");
        }
        return null;
    }


    /*public List<Perfil> ActualizarPerfil(Perfil obj){
        try {
            Statement stnt = cn.createStatement();
            String query = "update usuarios set correo= '";
            query+=obj.getCorreo();
            query+="', nombre= '";
            query+=obj.getNombre();
            query+="', nombrecom= '";
            query+=obj.getNombrecom();
            query+="', password= '";
            query+=obj.getPassword();
            query+="', edad= '";
            query+=obj.getEdad();
            query+="', direccion= '";
            query+=obj.getDireccion();
            query+="', genero= '";
            query+=obj.getDireccion();
            query+="', cedula= '";
            query+=obj.getCedula();
            query+="' where cedula = '";
            query+=obj.getCedula();
            query+="'";

            System.out.println(query);

            stnt.execute(query);

            stnt.close();
        } catch (Exception e) {
            System.out.println("ocurrio una excepcion en integrantesDB-Actualizar");
            System.out.println(e);
        }
        return null;
    }*/


    public List<Perfil> ActualizarPerfil2(Perfil obj){
        try {
            Statement stnt = cn.createStatement();
            String query = "update usuarios set ";
            query+=obj.getCampo();
            query+="= '";
            query+=obj.getContenido();
            query+="' where cedula = '";
            query+=obj.getCedula();
            query+="'";

            System.out.println(query);

            stnt.execute(query);

            stnt.close();
        } catch (Exception e) {
            System.out.println("ocurrio una excepcion en integrantesDB-Actualizar");
            System.out.println(e);
        }
        return null;
    }

}
