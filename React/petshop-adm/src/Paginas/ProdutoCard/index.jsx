import http from "../../http"


const ProdutoCard = (props) => {
    
    const deletar = () => {
        console.log(props)
        http.delete(`produtos/${props.id}`).then(console.log('item deletado'))
    }
    
    return (
        <div>
            <ul>
                <li>
                    {props.item}
                </li>
                <li>
                    {props.preco}
                </li>
                <a href="/editarProduto">Editar</a>
                <button onClick={deletar}>
                    Deletar
                </button>
            </ul>
        </div>
    )
}

export default ProdutoCard