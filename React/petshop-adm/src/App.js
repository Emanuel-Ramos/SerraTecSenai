import './App.css';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import Login from './Paginas/Login';
import Cadastro from './Paginas/Cadastro';
import ListaProdutos from './Paginas/ListaProdutos';

function App() {
  return (
    <Router>
      <Switch>
        <Route exact path="/" component={Login} />
        <Route exact path="/cadastro" component={Cadastro} />
        <Route path="/ListaProdutos" component={ListaProdutos} />
      </Switch>
    </Router>
  );
}

export default App;
