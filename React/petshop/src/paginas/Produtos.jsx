import './styles.css'
import { useEffect, useState } from 'react'
import http from '../http';
import ProdutoCard from '../ProdutoCard';
import NavBar from '../NavBar';

const Produtos = () => {
    
    const [produtos, setProdutos] = useState([])

    const obterProdutos = () => {
        http.get("produtos").then(response => { 
        setProdutos(response.data);
           
        }).catch(erro => console.log(erro))
    }

    useEffect(() => {
        obterProdutos()
    }, []);


    return(
        <div>
            <NavBar />
            <div className="cardsArea">
            <div className="cards">
            {produtos.map((item) =>
                <ProdutoCard key={item.id}id={item.id} item={item.nome} preco={item.preco} img={item.img} />

            )}
            </div>
            </div>
        </div>
    )
}

export default Produtos