import logo from '../img/logo.jpg'

const NavBar = () => {
    return(

            <div className="navBar">
            
            <img src={logo} alt="" className="logo"/>

            <h1 className="navBar-item">
                <a href="/" className="texto-nav-bar">Home</a>
            </h1>
            <h1 className="navBar-item">
                <a href="/servicos" className="texto-nav-bar">Servicos</a>
            </h1>
            <h1 className="navBar-item">
                <a href="/produtos" className="texto-nav-bar">Produtos</a>
            </h1>
         </div>

    )
}

export default NavBar