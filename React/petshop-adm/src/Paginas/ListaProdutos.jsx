import { useEffect, useState } from "react"
import http from "../http"
import ProdutoCard from "./ProdutoCard"

const ListaProdutos = () => {
    const [produtos, setProdutos] = useState([])
    

    const obterProdutos = () => {
        http.get('produtos').then(response => {setProdutos(response.data)})
        .catch(erro => console.log(erro))
    }

    useEffect(() => {
        obterProdutos()
    }, []);
    
    return(
        <div>
            <div className="cards">
            {produtos.map((item) =>
                <ProdutoCard key={item.id}id={item.id} item={item.nome} preco={item.preco} img={item.img} />

            )}
            </div>
            <a href='/cadastroProduto'>
            Cadastrar novo produto
            </a>
        </div>
    )
}

export default ListaProdutos