let baseUrl = "http://localhost:8080/perfil";
let baseUrl2 = "http://localhost:8080/perfilact";
let productos = [];

function ObtenerProductos() {
  fetch(baseUrl).then(res => {
    res.json().then(json => {
      productos = json;
      ImprimirProductos();
    });
  });
}

function ImprimirProductos() {
  let contenedor = document.getElementById("perfil");
  contenedor.innerHTML = ""; 

  productos.forEach(producto => {
    contenedor.innerHTML += MapearProducto(producto);
  });
}

function MapearProducto(producto) {
    return `<h1>${producto.nombrecom}</h1>
    <h4 id="nombre">${producto.nombre}</h4>
    <h4 style="color: green;">Activo: Ahora</h4>
    <hr style="width: 500px;">

    <h1>Informacion Básica</h1>
    <table>
        <tr>
            <td>Nombre:</td>
        <td>${producto.nombrecom}</td>
        </tr>
        <tr>
            <td>Edad:</td>
        <td>${producto.edad}</td>
        <td></td>
        </tr>

    </table>

    <h1>Informacion Personal</h1>
    <table>
        <tr>
            <td>Direccion:</td>
        <td>${producto.direccion}</td>
        </tr>
        <tr>
            <td>Genero:</td>
        <td>${producto.genero}</td>
        </tr>
        <tr>
            <td>Cédula:</td>
        <td>${producto.cedula}</td>
        </tr>

    </table>

    <h1>Cuenta</h1>
    <table>
        <tr>
            <td>Correo:</td>
        <td>${producto.correo}</td>
        </tr>
        <tr>
            <td>Contraseña:</td>
        <td>${producto.password}</td>
        </tr>

    </table>
    
    <form action="http://localhost:8080/perfilact"  method="post">

                <h2>Seleccione un campo para actualizar</h2>
                <h4>Escriba su cedula para actualizar</h4>
                <input type="text" class="input" placeholder="" name="cedula">
                <select name="campo">

                    <option>nombre</option>
                    
                    <option>nombrecom</option>
                    
                    <option>edad</option>

                    <option>direccion</option>
                    
                    <option>genero</option>
                    
                    <option>cedula</option>

                    <option>correo</option>
                    
                    <option>password</option>
                    
                    </select>
                    <input type="text" class="input" placeholder="" name="contenido">
                    <button onclick="ObtenerProductos()">Actualizar</button>  

            </form>`

    
  }