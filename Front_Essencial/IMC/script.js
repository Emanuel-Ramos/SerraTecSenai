const div = document.querySelector('.alert')
const alerta = document.querySelector('#IMC')
const btn = document.querySelector('.btnCalcular')

btn.addEventListener('click', () => {
    let peso = document.querySelector('#peso').value
    let altura = document.querySelector('#altura').value
    
    alerta.append(parseInt(peso) / (parseInt(altura) * 2))
    div.classList.remove('d-none')
    
})