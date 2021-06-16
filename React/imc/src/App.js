import { useState } from 'react';
import './App.css';
import Formulario from './components/Formulario';
import Titulo from './components/Titulo'
import Resultado from './components/Resultado'

function App() {

  const [providerImc, setProviderImc] = useState([])

  const mostraIMC = (pessoa) => {
    let imc = (parseFloat(pessoa.peso) / (parseFloat(pessoa.altura) * parseFloat(pessoa.altura)))
    let newImc = {}
    newImc.imc = imc
    setProviderImc([
      newImc,
      ...providerImc
    ])
    console.log(newImc)
    console.log(providerImc)
  }

  return (
    <div className="body">
      <Titulo />
      <Formulario aoSalvar={mostraIMC} />
      {providerImc.map((resultados, indice) => <Resultado key={indice} resultado={resultados.imc} />)}

    </div>
  );
}

export default App;
