import { useState } from "react"

const Formulario = ({aoSalvar}) => {
    const [peso, setPeso] = useState('')
    const [altura, setAltura] = useState('')
    
    const alterarPeso = (evento) => {
        setPeso(evento.target.value)
    }

    const alterarAltura = (evento) => {
        setAltura(evento.target.value)
    }

    const salvarAlteracoes = (evento) => {
        evento.preventDefault()
        const pessoa = {}
        pessoa.peso = peso
        pessoa.altura = altura
        aoSalvar(pessoa)

    }


    return(
        <form>
            <label>
                Peso
            </label>
            <input value = {peso} onChange={alterarPeso}>
            </input>
            <label>
                Altura
            </label>
            <input value = {altura} onChange={alterarAltura}>
            </input>
            <button onClick={salvarAlteracoes}>
                Salvar
            </button>
        </form>
    )
}

export default Formulario