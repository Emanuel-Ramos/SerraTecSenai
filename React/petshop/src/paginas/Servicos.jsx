import './styles.css'
import http from '../http';
import { useEffect, useState } from 'react';
import ServicoCard from '../ServicoCard';
import NavBar from '../NavBar';

const Servicos = () => {
    const [servicosItens, setServicosItens] = useState([])

    const obterServicos = () => {
        http.get('servicos').then((response) =>{
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