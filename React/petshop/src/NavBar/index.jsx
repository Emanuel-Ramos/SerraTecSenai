import logo from '../img/logo.png'


const NavBar = () => {
    return (
        <div className="navBar">
            <div className="navBar-logo">
                <img src={logo} alt="" className="logo" />
            </div>
            <div className="navBar-routes">
                <h1 className="navBar-item">
                    <a href="/cadastro" className="texto-nav-bar">Cadastro</a>
                </h1>
                <h1 className="navBar-item">
                    <a href="/login" className="texto-nav-bar">Login</a>
                </h1>
                <h1 className="navBar-item">
                    <a href="/servicos" className="texto-nav-bar">Servicos</a>
                </h1>
                <h1 className="navBar-item">
                    <a href="/produtos" className="texto-nav-bar">Produtos</a>
                </h1>
                <h1 className="navBar-item">
                    <a href="/" className="texto-nav-bar">Home</a>
                </h1>
            </div>
        </div>

    )
}

export default NavBar