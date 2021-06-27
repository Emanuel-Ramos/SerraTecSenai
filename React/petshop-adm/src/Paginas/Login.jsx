import { useState } from "react"
import http from "../http"

const Login = () => {
    
    const [email, setEmail] = useState('')
    const [senha, setSenha] = useState('')

    const logar = (e) => {
        e.preventDefault()
        let adm = {
            email: email,
            senha: senha
        }
        http.post('auth/login', adm).then((response) => localStorage.setItem('token', response.data.access_token))
        .catch((erro) => console.log(erro))
    }

    return(
        <div className="formArea">
            <form className="admForm" onSubmit={logar}>
                <label>
                    Email
                    <input type="email" value={email} onChange={(e)=>setEmail(e.target.value)}/>
                </label>
                <label>
                    Senha
                    <input type="password" value={senha} onChange={(e)=>setSenha(e.target.value)}/>
                </label>
                <button type="submit">Logar</button>
            </form>
            <div>
                <a href="/cadastro">
                    Nao possui conta? Cadastre-se
                </a>

            </div>
        </div>
    )
}

export default Login