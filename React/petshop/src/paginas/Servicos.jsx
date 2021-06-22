import './styles.css'
import axios from "axios";
import { useEffect, useState } from 'react';
import ServicoCard from '../ServicoCard';
import NavBar from '../NavBar';

const Servicos = () => {
    const [servicosItens, setServicosItens] = useState([])

    const obterServicos = () => {
        axios.get('http://localhost:8080/servicos').then((response) =>{
        console.log(response.data)    
        setServicosItens(response.data)
        })
    }

    useEffect(() => {
        obterServicos()
    }, [])
    
    return (
        <div>
           <NavBar />
           <div className="cardsArea">
            <div className="cards">
            {servicosItens.map((item) => 
                <ServicoCard key={item.id} id={item.id} item={item.nome} preco={item.preco} img={item.img}/>
            ) }
            </div>
            </div>
        </div>
    )
}

export default Servicos