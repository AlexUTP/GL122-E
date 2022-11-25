
const newgame = document.querySelector("#new_game");
const url = "http://localhost:8080/NewGame/all";
const funcion = data => {
    data.forEach(element => {
        const articulo = document.createElement("article");
        articulo.innerHTML = `
            <img src="${element.url}" alt="">
            <h3>${element.name}</h3>
            <p>${element.description}</p>
            <button>MAS INFO</button> 
        `
        newgame.appendChild(articulo);
    });
}
fetch(url).then(data => data.json()).then(funcion);