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
  let contenedor = document.getElementById("cuerpoTabla");
  contenedor.innerHTML = "";

  productos.forEach(producto => {
    contenedor.innerHTML += MapearProducto(producto);
  });
}

function MapearProducto(producto) {
  return `<tr>
  <td>
    <button class='btn btn-danger btn-sm' onclick="EliminarProducto(${producto.nombre})">Eliminar</button>
    <button class='btn btn-warning btn-sm' onclick="PopularDatosCampos(${producto.nombre})">Actualizar</button>
    </td>
  <td>${producto.nombre}</td>
  <td>${producto.tipo}</td>
  <td>${producto.descripcion}</td>
  <td>${producto.precio}</td>
</tr>`;
}

function EliminarProducto(pid) {
  fetch(baseUrl + '/producto/' + pid, { method: "Delete" }).then(res => {
    console.log(res);
    ObtenerProductos();
  });
}

function GuardarProducto() {
  let data = {
    nombre: document.getElementById("nombre").value,
    precio: document.getElementById("precio").value,
    descripcion: document.getElementById("descripcion").value,
    tipo: document.getElementById("tipo").value
  };

  fetch(baseUrl + "/producto", {
    method: "POST",
    body: JSON.stringify(data),
    headers: {
      "Content-type": 'application/json; charset=UTF-8'
    }
  }).then(res => {
    ObtenerProductos();
  });
}

function PopularDatosCampos(pid) {
  let producto = productos.filter(p => { return p.id == pid })[0];

  document.getElementById('nombre').value = producto.nombre;
  document.getElementById('precio').value = producto.precio;
  document.getElementById('descripcion').value = producto.fechaCaducidad;
  document.getElementById('tipo').value = producto.id;

}

function ActualizarProducto() {
  let data = {
    nombre: document.getElementById("nombre").value,
    precio: document.getElementById("precio").value,
    descripcion: document.getElementById("descripcion").value,
    tipo: document.getElementById("tipo").value
  };

  fetch(baseUrl + "/producto", {
    method: "PUT",
    body: JSON.stringify(data),
    headers: {
      "Content-type": 'application/json; charset=UTF-8'
    }
  }).then(res => {
    ObtenerProductos();
  });
}