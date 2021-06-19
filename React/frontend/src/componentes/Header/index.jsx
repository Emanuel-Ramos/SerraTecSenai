import './styles.css'
import frontend from '../img/frontend.jpg'



export const Header = () => {
    return(
        <div className="header">
            <img src={frontend} alt="" className="imgHeader" />
        </div>
    )
}