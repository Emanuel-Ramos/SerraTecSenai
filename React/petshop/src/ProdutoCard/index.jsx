import './styles.css'
import { Link } from 'react-router-dom'
import './styles.css'

const ProdutoCard = (props) => {
    return(
        <div className="item">
            <Link to={`/produto/${props.id}`}>
            <img src={props.img} alt="" className="imgItem"/>
            </Link>
            <a className="texto-card">
                {props.item}
            </a>
            <a className="TextoCard">
                R${props.preco}
            </a>
            
        </div>
    )
}

export default ProdutoCard