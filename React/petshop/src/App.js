
import './App.css';
import Home from './paginas/Home';
import Produtos from './paginas/Produtos';
import Produto from './paginas/Produto';
import Login from './paginas/Login';
import Servicos from './paginas/Servicos';
import Cadastro from './paginas/Cadastro';
import NotFound from './paginas/NotFound';
import Servico from './paginas/Servico'
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';

function App() {
  return (
    <Router>
      <Switch>
        <Route exact path="/" component={Home} />

        <Route path="/produtos" component={Produtos} />

        <Route path="/servicos" component={Servicos} />

        <Route path="/produto/:id" component={Produto} />

        <Route path="/servico/:id" component={Servico} />

        <Route path="/login" component={Login} />

        <Route path="/cadastro" component={Cadastro} />

        <Route component={NotFound} />
      </Switch>
    </Router>
  );
}

export default App;
