import { useState } from "react";
import Formulario from "./Formulario";
import Tarefas from "./Tarefas";
import Item from "./Item";
import axios from "axios";
import { useEffect } from "react";

function App() {

  const [tarefas, setTarefas] = useState([])
  const adicionarTarefa = (tarefa) => {
    axios.post('http://localhost:8000/tarefas', {
      tarefa
    })
      .then(function (response) {
        console.log(response);
      })
      .catch(function (error) {
        console.log(error);
      });
  }

  useEffect(() => {
    axios.get('http://localhost:8000/tarefas').then(response => {
      setTarefas(response.data)
    }, [])
  })



  return (
    <div>
      <Formulario aoSalvar={adicionarTarefa} />
      <Tarefas>
        {tarefas.map((item, indice) =>
          // <li key={indice}>
          //   {item.tarefa} - [ <a href="/#" onClick={() => { excluir(indice) }}>excluir</a> ]
          // </li>
          <Item key={indice} indice={indice} item={item.tarefa} />

        )}
      </Tarefas>
    </div>
  );
}

export default App;
