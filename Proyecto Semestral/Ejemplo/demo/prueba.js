const mssql = require('mssql');
const rest = new (require('rest-mssql-nodejs'))({
    server: 'DESKTOP-G140CGT',
    user: 'sa',
    password: '12345',
    database: 'ejemplo1',
    port: 1433

});


setTimeout(async () => {

    const resultado = await rest.executeQuery("select * from datitos")

    /*if(resultado.data = 'bryan')
    {
    console.log(resultado.data)
    }*/

    console.log(resultado.data)

},1500);