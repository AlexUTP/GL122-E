package ejemplo1.demo.Models;

public class Integrantes {
    private String url, nombre;

    public Integrantes() {
    }

    
    public Integrantes(String url, String nombre) {
        this.url = url;
        this.nombre = nombre;
    }



    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}

