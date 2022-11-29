package ejemplo1.demo.Models;

public class Usuarios {
    private String correo,nombre,nombrecom,password,edad,direccion,genero,cedula;


    
    public Usuarios(String correo, String nombre, String nombrecom, String password, String edad, String direccion,
            String genero, String cedula) {
        this.correo = correo;
        this.nombre = nombre;
        this.nombrecom = nombrecom;
        this.password = password;
        this.edad = edad;
        this.direccion = direccion;
        this.genero = genero;
        this.cedula = cedula;
    }

    public Usuarios() {
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombrecom() {
        return nombrecom;
    }

    public void setNombrecom(String nombrecom) {
        this.nombrecom = nombrecom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    


    
}
