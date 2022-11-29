let baseUrl = "http://localhost:8080/integrantes/all";
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
  let contenedor = document.getElementById("xd");
  contenedor.innerHTML = ""; 

  productos.forEach(producto => {
    contenedor.innerHTML += MapearProducto(producto);
  });
}

function MapearProducto(producto) {
    return `<div class="imagen-port">
                        <img src="${producto.url}" alt="">
                        <div class="hover-galeria">
                            <img src="${producto.url}" alt="">
                            <p>${producto.nombre}</p>
                        </div>
                    </div>`

    
  }
