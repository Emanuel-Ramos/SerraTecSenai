import http from "../http"
import { useEffect, useState } from "react"
import { useParams } from "react-router-dom"
import NavBar from "../NavBar"

const Servico = () => {
    const { id } = useParams()
    const [servico, setServico] = useState({})


    useEffect(() => {
        http.get('servicos/' + id)
            .then(response => setServico(response.data))
    }, [id])

    return (
        <div>
            <NavBar />
            <h1>{servico.nome}</h1>
            <h1>{servico.preco}</h1>
        </div>
    )
}

export default Servico