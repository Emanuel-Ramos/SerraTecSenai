import { useState } from "react"
import { Route } from "react-router-dom"
import http from "../http"

const Cadastro = () => {
    
    const [nome, setNome] = useState('')
    const [email, setEmail] = useState('')
    const [senha, setSenha] = useState('')
    
    const cadastrar = (e) => {
        e.preventDefault()
        let newUser = {
            nome: nome,
            email: email,
            senha: senha
        }
        http.post('auth/register', newUser).then((response) => localStorage.setItem('token', response.data.access_token))
    }
    
    return(
        <div>
            <form onSubmit={cadastrar}>
                <label>
                    Nome
                    <input type="text" onChange={(e) => setNome(e.target.value) } value={nome}/>
                </label>
                <label>
                    Email
                    <input type="text" onChange={(e) => setEmail(e.target.value) } value={email}/>
                </label>
                <label>
                    Senha
                    <input type="text" onChange={(e) => setSenha(e.target.value) } value={senha}/>
                </label>
                <button type="submit">Cadastrar</button>
            </form>
        </div>
    )
}

export default Cadastro