import axios from "axios"
import { useState, useEffect } from "react"
import './styles.css'

export const Cards = () => {
    const [keywords, setKeywords] = useState([])

    useEffect(() => {
        axios.get('http://localhost:8000/keywords').then(response => {
          setKeywords(response.data)

    }, [])
  })
  return(
    <div className="cardsArea">
      <div className="blocos">
          {keywords.map(keyword => 
          <div className="card">
          <p key={keyword.titulo}>{keyword.titulo}</p>
          </div>
          )}
      </div>
      </div>
    
  )
}