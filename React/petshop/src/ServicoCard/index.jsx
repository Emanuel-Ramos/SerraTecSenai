import './styles.css'
import { Link } from 'react-router-dom'

const ServicoCard = (props) => {
    return(
        <div className="item">
            <Link to={`/servico/${props.id}` }>
            <img src={props.img} alt="" className="imgItem"/>
            </Link>
            <a>{props.item}</a>
            <a>R${props.preco}</a>
        </div>
    )
}

export default ServicoCard