package ejemplo1.demo.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ejemplo1.demo.Models.Iniciosesion;
import ejemplo1.demo.Models.Integrantes;
import ejemplo1.demo.Models.Productos;
import ejemplo1.demo.Models.Usuarios;
import ejemplo1.demo.Models.Perfil;
import ejemplo1.demo.Services.IntegrantesDB;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class IntegrantesController {
    @GetMapping("/integrantes/all")

    public List<Integrantes> ObtenerIntegrantes(){
        return new IntegrantesDB().ObtenerIntegrantes();
    }

    @GetMapping("/productos/all")
    public List<Productos> ObtenerCatalogo(){
        return new IntegrantesDB().ObtenerCatalogo();
    }


    @PostMapping(value="/registro")
    public String postMethodName( Usuarios obj) {
        new IntegrantesDB().IngresarUsuario(obj);
        return null;
    }

    @PostMapping(value="/verifica")
    public String postMethodName( Integrantes obj) {
        new IntegrantesDB().Login(obj);
        return null;
    }

    @GetMapping("/banderas")
    public List<Iniciosesion> Bandera(){
        return new IntegrantesDB().Bandera();
    }

    @GetMapping("/perfil")
    public List<Usuarios> VerPerfil(){
        return new IntegrantesDB().VerPerfil();
    }

    @PostMapping(value="/perfilact")
    public String postMethodName(Perfil obj) {
        new IntegrantesDB().ActualizarPerfil2(obj);
        return null;
    }
    
}


