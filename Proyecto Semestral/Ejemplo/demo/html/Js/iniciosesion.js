let baseUrl = "http://localhost:8080/banderas";
let productos = [];

function ObtenerProductos() {
  fetch(baseUrl).then(res => {
    res.json().then(json => {
      productos = json;
      console.log(productos);
    });
  });
}
