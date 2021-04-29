const user = []
let contador = 0

function cadastro() {
    let nome = prompt('Digite seu nome')
    let idade = prompt('Digite sua idade')
    let sexo = prompt('Digite seu sexo')

    user.push({ nome, idade, sexo })

    if (contador <= 5) {
        alterecao = prompt('Deseja fazer alteracoes no cadastro? (s/n)').toLowerCase()
        if (alterecao == 's') {
            document.write((contador == 0) ? "Usuario inicial: " : 'Alteracao no usuario: ' + (contador))
            document.write('<br> Nome: ' + user[contador].nome + '<br>'
                            + 'Idade: ' + user[contador].idade + '<br>' +
                            'Sexo: ' + user[contador].sexo + '<br> <br>')
            contador++
            cadastro()
        }
    }
}

cadastro()

document.write('Usuario final: <br> <br> Nome: ' + user[contador].nome + '<br>')
document.write('Idade: ' + user[contador].idade + '<br>')
document.write('Sexo: ' + user[contador].sexo + '<br>')