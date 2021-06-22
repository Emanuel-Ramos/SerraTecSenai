const Item = (props) => {

    const excluir = () => {
      props.excluir(props.id)
    }
  
    return (
      
      <li>
        {props.item}
        <button onClick={excluir}>
        excluir
      </button>
      </li>
      
    )
  }
  
  export default Item