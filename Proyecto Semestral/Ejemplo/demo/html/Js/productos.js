let baseUrl = "http://localhost:8080/productos/all";
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
  let contenedor = document.getElementById("dx");
  contenedor.innerHTML = ""; 

  productos.forEach(producto => {
    
    contenedor.innerHTML += MapearProducto(producto);

    let cambia = document.getElementById("cambiar");
    cambia.addEventListener("click",()=>{
    let mostra = document.getElementById("mostrar");
    mostra.classList.toggle("ocultar");
    });
  });
}

function MapearProducto(producto) {
    return `

        <div class="animals col shadow p-3 mb-5 bg-body rounded">
            <img id="cambiar"src="${producto.imagen}" alt="">
            <h4>${producto.nombre}</h4>
            <a class="precio" href="">${producto.precio}</a>
            <h6>${producto.tipo}</h6>
            <h6>${producto.descripcion}</h6>
        </div>
`   

  }


  function search_animal() {
    let input = document.getElementById('searchbar').value
    input=input.toLowerCase();
    let x = document.getElementsByClassName('animals');
      
    for (i = 0; i < x.length; i++) { 
        if (!x[i].innerHTML.toLowerCase().includes(input)) {
            x[i].style.display="none";
        }
        else {
            x[i].style.display="list-item";                 
        }
    }
} 

  