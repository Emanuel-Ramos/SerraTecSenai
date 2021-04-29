//Mostrar que o pedido foi efetuado com sucesso e o codigo do pedido.
function fecharPedido() {

    document.getElementById("botoes").style.display = 'none';
    document.getElementById("resumo").style.display = 'none';

    let divNota = document.createElement("div");
    divNota.id = "nota";
    let agradecimentos = document.createTextNode(`Agradecemos sua preferência senhor(a) ${document.getElementById('nome').value}.
                                                 O codigo do seu pedido é: ${Math.floor(Math.random() * 150)}.
                                                 O tempo estimado para entrega é de até 90 minutos.`)

    divNota.appendChild(agradecimentos)
    document.body.insertBefore(divNota, document.getElementById("menu"))
}


function fazerAlteracao() {
    //apagar o outro pedido
    let pedidoAntigo = document.getElementById("resumo");
    pedidoAntigo.parentNode.removeChild(pedidoAntigo);

    //esconder pedido e aparecer o menu
    document.getElementById("botoes").style.display = 'none'
    document.getElementById("menu").style.display = 'block'

}

function mostrarResumo(pedido) {
    //Guardar o texto de cada input, o .value traz o custo e nao a opcao
    let nameTam = document.getElementById('tamanho')
    let nameBorda = document.getElementById('borda')
    let nameBebida = document.getElementById('bebida')
    let nameEntrega = document.getElementById('tipodeentrega')
    let escolhas = [
        nameTam.options[nameTam.selectedIndex].innerHTML,
        nameBorda.options[nameBorda.selectedIndex].innerHTML,
        document.getElementById('sabor').value,
        document.getElementById('sabor2').value,
        document.getElementById('comentario').value,
        nameBebida.options[nameBebida.selectedIndex].innerHTML,
        nameEntrega.options[nameEntrega.selectedIndex].innerHTML
    ]

    //Criacao da div resumo para o cliente confirmar o pedido
    let divResumo = document.createElement("div")
    divResumo.id = "resumo"
    for (i in escolhas) {
        if (escolhas[i].toString() != "") {
            let conteudoNovo = document.createTextNode(escolhas[i])      
            divResumo.appendChild(conteudoNovo);
            divResumo.appendChild(document.createElement("br"))
            divResumo.appendChild(document.createElement("br"))
        }
    }
    let total = document.createTextNode(`Total do pedido: R$ ${pedido.tamanho + pedido.borda + pedido.bebida + pedido.entrega}`)
    divResumo.appendChild(total);
    document.body.insertBefore(divResumo, document.getElementById("menu"));
}


function finalizarPedido() {
    //armazenar dados que o cliente passar em objetos
    const pedido = {
        tamanho: parseInt(document.getElementById('tamanho').value),
        borda: parseInt(document.getElementById('borda').value),
        sabor: document.getElementById('sabor').value,
        sabor2: document.getElementById('sabor2').value,
        bebida: parseInt(document.getElementById('bebida').value),
        entrega: parseInt(document.getElementById('tipodeentrega').value),
        pagamento: document.getElementById('pagamento').value,
        nome: document.getElementById('nome').value,
        troco: document.getElementById('troco').value == "sim" ? true : false,
        comentario: document.getElementById('comentario').value
    }
    const entrega = {
        celular: document.getElementById('celular').value,
        endereco: document.getElementById('endereco').value,
        numero: document.getElementById('numero').value,
        complemento: document.getElementById('complemento').value == "" ? "Nenhum complemento fornecido" : document.getElementById('complemento').value,
        bairro: document.getElementById('bairro').value,
        referencia: document.getElementById('referencia').value == "" ? "Nenhuma referencia" : document.getElementById('referencia').value

    }

    //validar se o formulario foi completado

    for (val in pedido) {
        if (pedido[val].toString() == "null" || pedido[val].toString() == "NaN") {
            return alert('Você não selecionou todas as opcôes')
        }
    }
    if (pedido.nome == "") { return alert('Você não preencheu seu nome corretamente') }

    if (document.getElementById("tipodeentrega").value == 5) {
        for (val in entrega) {
            if (entrega[val] == "") {
                return alert('Você não preencheu o endereço corretamente')
            }
        }
    }

    //trocar as divs
    document.getElementById("botoes").style.display = 'block'
    document.getElementById("menu").style.display = 'none'
    mostrarResumo(pedido)
}

//Aparecer/Desaparecer input de quantidade de troco 
function validarForm() {
    var optionSelect = document.getElementById("troco").value;

    if (optionSelect == "sim") {
        document.getElementById("inputTroco").disabled = false;
    } else if (optionSelect == "nao") {
        document.getElementById("inputTroco").disabled = true;
    }
}

function validarTroco() {
    var optionSelect = document.getElementById("pagamento").value;

    if (optionSelect == "dinheiro") {
        document.getElementById("inputTroco").disabled = false;
        document.getElementById("troco").disabled = false;
    } else {
        document.getElementById("inputTroco").disabled = true;
        document.getElementById("troco").disabled = true;
    }
}


//Ativar/Desativar a div de formulario de delivery
function ativarEntrega() {
    if (document.getElementById("tipodeentrega").value == 5) {
        document.getElementById("dadosEntrega").style.display = 'block'
    } else {
        document.getElementById("dadosEntrega").style.display = 'none'
    }
}
