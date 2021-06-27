import './styles.css'
import NavBar from '../NavBar'
import { useState } from 'react'
import http from '../http'


const Login = () => {
    const [email, setEmail] = useState('')
    const [senha, setSenha] = useState('')

    const enviarFormulario = (event) => {
        event.preventDefault()
        const USUARIO = {
            email: email,
            senha: senha
        }
        http.post('auth/login', USUARIO).then((response) => localStorage.setItem('token', response.data.access_token))
        .catch((erro) => console.log(erro));
    }

    return(
            

            <div>
                <NavBar />
                <div className="formArea">
                    <form className="loginForm" onSubmit={enviarFormulario}>
                    <label className="formLabel">
                <a>Email</a>
                <input required type="email" name="email" onChange={(e) => setEmail(e.target.value)} value={email}/>
                </label>
                <label className="formLabel">
                    <a>Senha</a>
                    <input required type="password" name="senha" onChange={(e) => setSenha(e.target.value)} value={senha}/>
                </label>
                        <button type="submit" className="formBtn">Enviar</button>
                    </form>
                </div>
            </div>
    )
}

export default Login