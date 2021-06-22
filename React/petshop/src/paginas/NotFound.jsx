import React from 'react';
import { Link } from 'react-router-dom';
import './styles.css'
import img from '../img/notFound.png'

const NotFound = () => (
  <div className="notFoundPage" >
    <h1>Não há nada para ver aqui</h1>
    <Link to="/">
      <button>
          Voltar para a home
      </button>
    </Link>
    <img src={img} alt="" style={{padding: 50}}/>
  </div>
);

export default NotFound;