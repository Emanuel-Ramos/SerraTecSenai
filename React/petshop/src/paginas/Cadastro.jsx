import './styles.css'
import NavBar from '../NavBar';
import { useState } from 'react';
import http from '../http';

const Cadastro = () => {
    const [nome, setNome] = useState('')
    const [email, setEmail] = useState('')
    const [senha, setSenha] = useState('')
    
    const novoCadastro = (e) => {
        e.preventDefault()
        let newUser = {
            nome: nome,
            email: email,
            senha: senha
        }
        http.post('auth/register', newUser).then(console.log('sucesso')).catch(error => console.log(error))
    }


    return(
        <div>
            <NavBar />
        <div className="formArea">
            <form className="cadastroForm" onSubmit={novoCadastro}>
                <label className="formLabel">
                    <a>Nome</a>
                    <input required type="text" onChange={(e) => setNome(e.target.value)} value={nome}/>
                </label>
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

export default Cadastro;