//const atividades = document.querySelector('#atividade')
const listaPerfumes = {
    1 : {
        nome: "Quasar",
        categoria: "Perfume",
        valor: 10
    },
    2: {
        nome: "Arbo",
        categoria: "Perfume",
        valor: 20
    },
    3: {
        nome: "Malbec",
        categoria: "Perfume",
        valor: 30
    },
    4: {
        nome: "",
        categoria: "",
        valor: 1
    },
    5: {
        nome: "",
        categoria: "",
        valor: 1
    },
    6: {
        nome: "",
        categoria: "",
        valor: 1
    },
    7: {
        nome: "",
        categoria: "",
        valor: 1
    },
    8: {
        nome: "",
        categoria: "",
        valor: 1
    },
    9: {
        nome: "",
        categoria: "",
        valor: 1
    },
    10: {
        nome: "",
        categoria: "",
        valor: 1
    },
    11: {
        nome: "",
        categoria: "",
        valor: 1
    },
    12: {
        nome: "",
        categoria: "",
        valor: 1
    }
}

const tBody = document.querySelector('#listaProdutos')

function addToCart(id){
    console.log(listaPerfumes[id])
    let tr = document.createElement('tr')
    let tdNome = document.createElement('td')
    let tdQuantidade = document.createElement('td')
    let tdValor = document.createElement('td')
    let tdCategoria = document.createElement('td')
    let tdTotal = document.createElement('td')

    let tdExcluir = document.createElement('td')
    let btnExcluir = document.createElement('button')
    btnExcluir.textContent = 'excluir'
    btnExcluir.classList.add('btn', 'btn-danger')
    btnExcluir.addEventListener('click', function () {
        tr.remove()
    })
    tdExcluir.append(btnExcluir)

    
    tdNome.append(listaPerfumes[id].nome)
    tdQuantidade.append(1)
    tdValor.append(listaPerfumes[id].valor)
    tdCategoria.append(listaPerfumes[id].categoria)
    tdTotal.append(parseInt(tdValor) * parseInt(tdQuantidade))


    tr.append(tdNome)
    tr.append(tdCategoria)
    tr.append(tdQuantidade)
    tr.append(tdValor)
    tr.append(tdTotal)
    tr.append(tdExcluir)

    console.log(tr)

    tBody.append(tr)

}

// inputBtnLimpar.addEventListener('click',(event) => {
//     event.preventDefault()
//     const trs(document.querySelectorAll('tbody tr')
//     trs.forEach((item) => {
//         item.remove()
//     })
// })


// btn.addEventListener('click', (event) => {
//     event.preventDefault()

//     let lista = {
//         nome: inputNome.value,
//         quantidade: inputQuantidade.value,
//         valor: inputValor.value,
//         categoria: inputCategoria.value,
//         total: produto.quantidade * produto.valor
//     }


//     let tr = document.createElement('tr')

//     let tdInputNome = document.createElement('td')
//     let tdInputQuantidade = document.createElement('td')
//     let tdInputValor = document.createElement('td')
//     let tdInputCategoria = document.createElement('td')
//     let tdInputTotal = document.createElement('td')

//     let tdExcluir = document.createElement('td')
//     let btnExcluir = document.createElement('button')
//     btnExcluir.textContent = 'excluir'
//     btnExcluir.classList.add('btn', 'btn-danger')
//     btnExcluir.addEventListener('click', function () {
//         tr.remove()
//     })
//     tdExcluir.append(btnExcluir)


//     tdInputNome.textContent = lista.atividade
//     tdInputQuantidade.textContent = lista.atividade
//     tdInputValor.textContent = lista.atividade
//     tdInputCategoria.textContent = lista.atividade
//     tdInputTotal.textContent = lista.atividade


//     tr.append(tdInputNome)
//     tr.append(tdInputQuantidade)
//     tr.append(tdInputValor)
//     tr.append(tdInputCategoria)
//     tr.append(tdInputTotal)
//     tr.append(tdExcluir)
//     lista.append(tr)

//     nome.value = ''
//     quantidade.value = ''
//     valor.value = ''
//     categoria.value = ''

// })