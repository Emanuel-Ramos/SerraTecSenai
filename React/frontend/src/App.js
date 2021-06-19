import logo from './logo.svg';
import './App.css';
import { Header } from './componentes/Header';
import { Cards } from './componentes/Cards';
import axios from 'axios';
import { useState } from 'react';

function App() {


  return (
    <div className="body">
      <Header />
      <Cards />
    </div>
  );
}

export default App;
