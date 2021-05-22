const btn = document.querySelector('#btnAdd');
const div = document.querySelector('.cards');
const form = document.querySelector('form');


form.addEventListener('submit', (event) => {
    event.preventDefault()
    let titulo = document.querySelector('#titulo').value;
    let img = document.querySelector('#URL').value;
    let descricao = document.querySelector('#descricao').value;

    let newCard = document.createElement('div');
    newCard.classList.add('card');

    let newImg = document.createElement('img');
    newImg.setAttribute('src', img);
    newImg.classList.add('card-img-top');

    let newCardBody = document.createElement('div');
    newCardBody.classList.add('card-body');


    let h5 = document.createElement('h5');
    h5.classList.add('card-title');
    h5.append(titulo)

    let p = document.createElement('p');
    p.classList.add('card-text');
    p.append(descricao)

    newCardBody.append(h5);
    newCardBody.append(p);
    newCard.append(newImg);
    newCard.append(newCardBody);
    
    div.append(newCard);
})

   // <div class="card" style="width: 18rem;">
    // <img src="..." class="card-img-top" alt="...">
    // <div class="card-body">
    // <h5 class="card-title">Card title</h5>
    // <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    // <a href="#" class="btn btn-primary">Go somewhere</a>
    // </div> 